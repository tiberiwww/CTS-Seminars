package o_resolved;

public class FTEmployee extends Employee {

	float salary;
	public FTEmployee(int iD, String name, float salary) {
		super(iD, name);
		this.salary=salary;
	}
	
	

	public float getSalary() {
		return salary;
	}



	public void setSalary(float salary) {
		this.salary = salary;
	}



	@Override
	public float calculateBonus() {
	return salary*0.1f;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FTEmployee:");
		builder.append(super.toString());
		builder.append("[salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}
	
	

}
