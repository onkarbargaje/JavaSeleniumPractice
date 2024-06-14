package encapsulation;

public class Employee {
	private String name;
	private String department;
	private int age;
	private String city;

	public void set_Name(String name) {
		this.name = name;
	}

	public String get_Name() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department)

	{
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
