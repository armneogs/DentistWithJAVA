package Dentist.Bean;

import java.util.Date;

public class PatientBean extends AbstUserBean{
	private Date BirthDate,RegisteDate;
	private String Allergic,CongenitalDisease;
	public Date getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}
	public Date getRegisteDate() {
		return RegisteDate;
	}
	public void setRegisteDate(Date registeDate) {
		RegisteDate = registeDate;
	}
	public String getAllergic() {
		return Allergic;
	}
	public void setAllergic(String allergic) {
		Allergic = allergic;
	}
	public String getCongenitalDisease() {
		return CongenitalDisease;
	}
	public void setCongenitalDisease(String congenitalDisease) {
		CongenitalDisease = congenitalDisease;
	}
	public PatientBean(String name, String tel, String location, int id, Date birthDate, Date registeDate,
			String allergic, String congenitalDisease) {
		super(name, tel, location, id);
		BirthDate = birthDate;
		RegisteDate = registeDate;
		Allergic = allergic;
		CongenitalDisease = congenitalDisease;
	}
	public PatientBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PatientBean(String name, String tel, String location, int id) {
		super(name, tel, location, id);
		// TODO Auto-generated constructor stub
	}
	
	
}
