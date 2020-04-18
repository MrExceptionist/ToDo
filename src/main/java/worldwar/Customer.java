package worldwar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@Column(name="C_No")
	private String c_Id;
	@Column(name="Name")
	private String cname;
	@Column(name="Phn")
	private double phn;
	private String Email;
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

	
	
	public String getC_Id() {
		return c_Id;
	}
	public void setC_Id(String c_Id) {
		this.c_Id = c_Id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getPhn() {
		return phn;
	}
	public void setPhn(long phn) {
		this.phn = phn;
	}
	
	
}
