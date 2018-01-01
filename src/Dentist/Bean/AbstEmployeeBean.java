package Dentist.Bean;

public abstract class AbstEmployeeBean extends AbstUserBean{
	private int Salary;
	private String 	Division;
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public String getDivision() {
		return Division;
	}
	public void setDivision(String division) {
		Division = division;
	}
	public AbstEmployeeBean(String name, String tel, String location, int salary, String division) {
		super(name, tel, location);
		Salary = salary;
		Division = division;
	}
	public AbstEmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AbstEmployeeBean(String name, String tel, String location) {
		super(name, tel, location);
		// TODO Auto-generated constructor stub
	}
	

}
