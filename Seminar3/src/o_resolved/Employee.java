package o_resolved;

public abstract class Employee {

	private int ID;
	private String name;

	
	public Employee(int iD, String name) {
		super();
		ID = iD;
		this.name = name;

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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [ID=");
		builder.append(ID);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	abstract float calculateBonus();

}

