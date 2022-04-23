package abstractFactory;

public class CheapWeapon implements IWeapon{

	@Override
	public void power() {
		System.out.println("This weapon as 0.1 power");
	}

}
