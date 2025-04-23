package model;

public class Student {
	private int student_id;
	private String name;
	private int age;
	private String grade;
	private String email;
	private String phone;
	private String address;
	private String password;
	
	//constructor
	public Student() {}
	
	// parameterized constructor
	public Student(int student_id, String nam, int age, String grade, String email, String phone, String address, String name, String password) {
		this.student_id = student_id;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.password = password;
	}
	
	//getters and setters
	public int getStudent_id() {
		return student_id;
	}
	
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
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
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
