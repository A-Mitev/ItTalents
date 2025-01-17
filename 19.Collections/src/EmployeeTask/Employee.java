package EmployeeTask;

public class Employee {

	private String name;
	private int age;
	private int salary;
	private static int idNumber = 100;
	private int id;

	public Employee(String name, int age, int salary) throws CompanyException {
		setName(name);
		setAge(age);
		setSalary(salary);
		this.id = idNumber++;

	}

	public String getName() {
		return name;
	}
	
	

	public void setName(String name) throws CompanyException {
		if(name != null && name.length() > 0){
		this.name = name;
		} else {
			throw new CompanyException("Invalid name");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws CompanyException {
		if (age > 0 && this.age < age) {
			this.age = age;
		} else {
			throw new CompanyException("Invalid Age");
		}
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) throws CompanyException {
		if (salary > 0) {
			this.salary = salary;
		} else {
			throw new CompanyException("Invalid Salary");
		}
	}

	public int getId() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Employee)){
			return false;
		}
		return ((Employee) obj).id == this.id;
	}
	
	@Override
	public int hashCode() {
		
		return this.id;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", id=" + id + "]";
	}

}
