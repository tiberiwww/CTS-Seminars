package chainOfResponsability;

public class Progmain {

	public static void main(String[] args) {
		
		AHandler waiter=new Waiter();
		AHandler chef=new Chef();
		
		waiter.setSuccessor(chef);
		waiter.processOrder(new Order("Coffee",3));
		waiter.processOrder(new Order("Pizza",15));

		
	}

}
