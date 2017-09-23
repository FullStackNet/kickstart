package platform.db;

public class ResourceOrder {
	private String[] fieldNames;
	private boolean ascending = true;
	
	private int minRange;
	private int maxRange;
	
	public ResourceOrder() {
	}
	
	public ResourceOrder(String[] fieldNames) {
		this(fieldNames, true);
	}

	public ResourceOrder(String[] fieldNames, boolean ascending) {
		setFieldNames(fieldNames, ascending);
	}
	
	public ResourceOrder(int pageSize, int pageNumber) {
		setPage(pageSize, pageNumber);
	}
	
	public void setFieldNames(String[] fieldNames, boolean ascending) {
		this.fieldNames = fieldNames;
		this.ascending = ascending;
	}
	
	public void setAscending(boolean ascending) {
		this.ascending = ascending;
	}
	
	public void setPage(int pageSize, int pageNumber) {
		maxRange = (pageNumber > 0 && pageSize > 0) ? pageNumber * pageSize : 0;
		minRange = (maxRange > 0) ? maxRange - pageSize + 1 : 0;
	}
	
	public String[] getFieldNames() {
		return fieldNames;
	}
	
	public boolean isAscending() {
		return ascending;
	}
	
	public boolean isSortingRequired() {
		return fieldNames != null && fieldNames.length > 0;
	}
	
	public int getMinRange() {
		return minRange;
	}

	public int getMaxRange() {
		return maxRange;
	}
	
	public boolean isPaginationRequired() {
		return minRange > 0 && maxRange > 0;
	}
}