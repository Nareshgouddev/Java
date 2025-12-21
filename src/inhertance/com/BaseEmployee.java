package inhertance.com;

public abstract class BaseEmployee implements Employee {
	private String Name;
	private int id;
	private String branch;
	
	BaseEmployee(String Name,int id,String branch){
		this.Name=Name;
		this.id=id;
		this.branch=branch;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public void setid(int id) {
		this.id=id;
	}
	public void setbranch(String branch) {
		this.branch=branch;
	}
	public String getName() {
		return Name;
	}
	public int getid() {
		return id;
	}
	public String getbranch() {
		return branch;
	}
	 @Override
	    public String getDetails() {
	        return String.format("ID: %d, Name: %s, Branch: %s", id, Name, branch);
	    }
}
