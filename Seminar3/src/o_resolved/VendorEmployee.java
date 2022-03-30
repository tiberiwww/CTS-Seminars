package o_resolved;

public class VendorEmployee extends Employee {

	private float salary;
	
	public VendorEmployee(int iD, String name, float salary) {
		super(iD, name);
		this.salary=salary;
	}
	
	

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return super.getID();
	}



	@Override
	public void setID(int iD) {
		// TODO Auto-generated method stub
		super.setID(iD);
	}



	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}



	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}





	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VendorEmployee [salary=");
		builder.append(super.toString());
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}



	@Override
	public float calculateBonus() {
	
		return this.salary*.05f;
	}

}
