package abstractFactory;

public class Shop {
	
	IFactory factory;
	
	public Shop(IFactory factory) {
		super();
		this.factory = factory;
	}
	
	public void createFamilyObj() {
		ICostume costume = factory.getCostume();
		IWeapon weapon = factory.getWeapon();
		
		weapon.power();
		costume.protection();
	}

}
