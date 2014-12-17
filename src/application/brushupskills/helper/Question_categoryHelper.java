package application.brushupskills.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import platform.db.Expression;
import platform.db.REL_OP;
import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.Util;
import platform.webservice.ui.definition.IdValue;
import application.brushupskills.resource.question;
import application.brushupskills.resource.question_category;

public class Question_categoryHelper extends BaseHelper {

	private static Question_categoryHelper instance;

	public static Question_categoryHelper getInstance() {
		if (instance == null)
			instance = new Question_categoryHelper();
		return instance;
	}

	public Question_categoryHelper() {
		super(new question_category());
		// TODO Auto-generated constructor stub
	}

	String getLevelName(String name, int level) {
		if (level == 0) return name;
		String str = "";
		for(int i=0; i < level; i++) {
			str = str + "&nbsp;&nbsp;&nbsp;&nbsp;";
		}
		return str+name;
	}
	public question_category orderExist(BaseResource[] catgories,String categoryId, Long order) {
		for(int i =0; i < catgories.length; i++) {
			question_category _catgory = (question_category)catgories[i];
			if (order == _catgory.getOrder()) {
				if (!_catgory.getId().equals(categoryId))
					return _catgory;
			}
		}
		return null;
	}	
	public void changeOrder(String parentId,String categoryId, Long order) {
		if (order == null)
			return;
		BaseResource[] subcatgories = getBySubCategories(parentId);
		if (Util.isEmpty(subcatgories))
			return;
		question_category _catgory = orderExist(subcatgories,categoryId,order);
		if (_catgory == null)
			return;
		long newOrder = order;
		for(int i =0; i < subcatgories.length; i++) {
			_catgory = (question_category)subcatgories[i];
			if (_catgory.getId().equals(categoryId))
				continue;
			if (order <=  _catgory.getOrder()) {
				if (newOrder >= _catgory.getOrder()) {
					newOrder = _catgory.getOrder()+1;
					question_category _pcat = new question_category(_catgory.getId());	
					_pcat.setOrder(newOrder);
					try {
						Question_categoryHelper.getInstance().update(_pcat);
					} catch (ApplicationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

	public void updateTotalQuestions(String id) {
		question_category _question_category = (question_category)Question_categoryHelper.getInstance().getById(id);
		if (_question_category == null || _question_category.getQuestions() == null)
			return;
		question_category _category = new question_category(_question_category.getId());
		_category.setTotal_question(_question_category.getQuestions().size());
		try {
			Question_categoryHelper.getInstance().update(_category);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateParentTotalQuestions(String id,long total,long selfCount) {
		question_category _category = new question_category(id);
		_category.setTotal_question(total+selfCount);
		try {
			Question_categoryHelper.getInstance().update(_category);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateParentCategories(Map<String, question_category> categoryMap,
			Map<String, ArrayList<question_category>> parentMap,String id) {
		if (parentMap == null) {
			BaseResource[] resources = Question_categoryHelper.getInstance().getAll(new String[]{question_category.FIELD_ORDER});
			parentMap = new HashMap<String, ArrayList<question_category>>();
			categoryMap = new HashMap<String, question_category>();
			for(BaseResource resource : resources) {
				String parent = "root";
				question_category _catgory = (question_category)resource;
				categoryMap.put(_catgory.getId(), _catgory);
				if (!Util.isEmpty(_catgory.getParent_category_id())) {
					parent = _catgory.getParent_category_id();
				}
				ArrayList<question_category> child_list = parentMap.get(parent);
				if (Util.isEmpty(child_list)) {
					child_list = new ArrayList<question_category>();
				}
				child_list.add(_catgory);
				parentMap.put(parent,child_list);
			}
		}

		ArrayList<question_category> child_list = parentMap.get(id); 
		question_category _category = categoryMap.get(id);
		if (_category  == null) return;
		if (Util.isEmpty(child_list)) return;
		long selfCount = 0;
		if (!Util.isEmpty(_category.getQuestions())) {
			selfCount = _category.getQuestions().size();
		}
		long total_count = 0;
		for(int i=0; i < child_list.size() ; i++) {
			question_category category = child_list.get(i); 
			if (category.getTotal_question() != null) {
				total_count = total_count + category.getTotal_questionEx();
			}
		}
		updateParentTotalQuestions(id,total_count,selfCount);
		_category.setTotal_question(total_count+selfCount);
		if (!Util.isEmpty(_category.getParent_category_id())) {
			updateParentCategories(categoryMap, parentMap, _category.getParent_category_id());
		}
	}

	public void addQuestion(String id,String questionId, long order) {
		if (id == null) return;
		if (questionId == null) return;

		question_category _question_category = new question_category(id);
		Map<String, Object> map = new HashMap<>();
		map.put(questionId, order);
		_question_category.setQuestions(map);
		try {
			Question_categoryHelper.getInstance().update(_question_category);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		updateTotalQuestions(id);
		question_category _category = (question_category)Question_categoryHelper.getInstance().getById(id);
		if (_category == null)
			return;
		if (!Util.isEmpty(_category.getParent_category_id())) {
			updateParentCategories(null,null,_category.getParent_category_id());
		}
		QuestionHelper.getInstance().changeOrder(id, questionId, order);
	}
	
	void addChilds(Map<String, ArrayList<question_category>> parentMap,ArrayList<IdValue> list,ArrayList<question_category> child_list, int level) {
		if (Util.isEmpty(child_list))
			return;
		for(int i=0; i < child_list.size(); i++) {
			list.add(new IdValue(child_list.get(i).getId(), getLevelName(child_list.get(i).getName(),level)));
			ArrayList<question_category> child_child_list = parentMap.get(child_list.get(i).getId());
			if (!Util.isEmpty(child_child_list)) {
				addChilds(parentMap,list,child_child_list,level+1);
			}
		}
	}
	public IdValue[] getLeveledList() {
		int level = 0;
		ArrayList<IdValue> list = new ArrayList<>();
		BaseResource[] resources = Question_categoryHelper.getInstance().getAll();
		Map<String, ArrayList<question_category>> parentMap = new HashMap<String, ArrayList<question_category>>();
		for(BaseResource resource : resources) {
			String parent = "root";
			question_category _catgory = (question_category)resource;
			if (!Util.isEmpty(_catgory.getParent_category_id())) {
				parent = _catgory.getParent_category_id();
			}
			ArrayList<question_category> child_list = parentMap.get(parent);
			if (Util.isEmpty(child_list)) {
				child_list = new ArrayList<question_category>();
			}
			child_list.add(_catgory);
			parentMap.put(parent,child_list);
		}
		ArrayList<question_category> child_list = parentMap.get("root");
		addChilds(parentMap,list,child_list,level);
		return list.toArray(new IdValue[list.size()]);
	}

	void addLevelResource(Map<String, ArrayList<question_category>> parentMap,ArrayList<BaseResource> list,ArrayList<question_category> child_list, int level) {
		if (Util.isEmpty(child_list))
			return;
		for(int i=0; i < child_list.size(); i++) {
			String name = getLevelName(child_list.get(i).getName(), level);
			child_list.get(i).setName(name);
			list.add(child_list.get(i));
			ArrayList<question_category> child_child_list = parentMap.get(child_list.get(i).getId());
			if (!Util.isEmpty(child_child_list)) {
				addLevelResource(parentMap,list,child_child_list,level+1);
			}
		}
	}

	public BaseResource[] getRootCategories() {
		BaseResource[] resources = Question_categoryHelper.getInstance().getAll(new String[]{question_category.FIELD_ORDER});
		ArrayList<question_category> list = new ArrayList<question_category>();
		for(BaseResource resource : resources) {
			question_category _catgory = (question_category)resource;
			if (Util.isEmpty(_catgory.getParent_category_id())) {
				list.add(_catgory);
			}
		}
		return list.toArray(new question_category[list.size()]);
	}

	public BaseResource[] getBySubCategories(String categoryId) {
		Expression e = new Expression(question_category.FIELD_PARENT_CATEGORY_ID, REL_OP.EQ, categoryId);
		return  Question_categoryHelper.getInstance().getByExpression(e, new String[]{question_category.FIELD_ORDER});
	}

	public BaseResource[] getLeveledResources() {
		int level = 0;
		ArrayList<BaseResource> list = new ArrayList<>();
		BaseResource[] resources = Question_categoryHelper.getInstance().getAll(new String[]{question_category.FIELD_ORDER});
		Map<String, ArrayList<question_category>> parentMap = new HashMap<String, ArrayList<question_category>>();
		for(BaseResource resource : resources) {
			String parent = "root";
			question_category _catgory = (question_category)resource;
			if (!Util.isEmpty(_catgory.getParent_category_id())) {
				parent = _catgory.getParent_category_id();
			}
			ArrayList<question_category> child_list = parentMap.get(parent);
			if (Util.isEmpty(child_list)) {
				child_list = new ArrayList<question_category>();
			}
			child_list.add(_catgory);
			parentMap.put(parent,child_list);
		}
		ArrayList<question_category> child_list = parentMap.get("root");
		addLevelResource(parentMap,list,child_list,level);
		return list.toArray(new question_category[list.size()]);
	}

}
