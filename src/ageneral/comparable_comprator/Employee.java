package ageneral.comparable_comprator;

public class Employee implements Comparable<Employee>{
	
	private Integer eid;
	private String eName;
	private String city;
	
	public Integer getEId() {
		return this.eid;
	}
	
	public String getEName() {
		return this.eName;
	}
	
	public String getCity() {
		return this.city;
	}
	
	Employee(int eid, String eName, String city){
		this.eid = eid;
		this.eName = eName;
		this.city = city;
	}
	
	public String toString() {
		return "employee[id: "+this.eid+", Name : "+this.eName+" , City : "+this.city+"]";
	}

	//Can sort using Ename only
	public int compareTo(Employee e) {
		return this.getEName().compareTo(e.getEName());
	}

}
