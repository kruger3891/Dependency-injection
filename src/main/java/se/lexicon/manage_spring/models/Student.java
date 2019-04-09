package se.lexicon.manage_spring.models;

public class Student {
	private static int sequencer = 0;
	private final int id;
	private String fname;
	private String lname;
	private String email;
	private String phone;
	
	
	
	public Student(String fname, String lname, String email, String phone) {
		id = ++ sequencer;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getId() {
		return id;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", phone=" + phone
				+ "]";
	}
	
}
