package application.brushupskills.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import platform.helper.BaseHelper;
import platform.resource.BaseResource;
import platform.util.ApplicationException;
import platform.util.Util;
import platform.webservice.ui.definition.IdValue;
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
	
	public void addQuestion(String id,String questionId, long order) {
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
