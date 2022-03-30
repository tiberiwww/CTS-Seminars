package o;

public class Employee {

	private int ID;
	private String name;
	private String employeeType;
	private int salary;
	
	public Employee(int iD, String name, String employeeType, int salary) {
		super();
		ID = iD;
		this.name = name;
		this.employeeType=employeeType;
		this.salary=salary;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [ID=");
		builder.append(ID);
		builder.append(", name=");
		builder.append(name);
		builder.append(", employeeType=");
		builder.append(employeeType);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}

	
	public float calculateBonus() {
		if(this.employeeType=="FTE") {
			return (float) (this.salary*0.1);
		}
		else return (float) (this.salary*0.2);
	}

	
	
	
}
