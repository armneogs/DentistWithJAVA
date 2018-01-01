package Dentist.Bean;

public abstract class AbstUserBean {
	private String Name,Tel,Location;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public AbstUserBean(String name, String tel, String location) {
		super();
		Name = name;
		Tel = tel;
		Location = location;
	}

	public AbstUserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
