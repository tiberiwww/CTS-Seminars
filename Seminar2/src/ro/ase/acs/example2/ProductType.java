package ro.ase.acs.example2;

public enum ProductType {
	
	
	HIGH_AVAILABILITY(1),
	MEDIUM_AVAILABILITY(2),
	LOW_AVAILABILITY(3),
	CRITICAL_AVAILABILITY(4);
	
	private int id;
	private ProductType(int id) {
		this.id=id;
	}
	
	public int getId() {
		return this.id;
	}
	

}
