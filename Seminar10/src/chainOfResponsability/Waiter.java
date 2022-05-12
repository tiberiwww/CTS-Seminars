package chainOfResponsability;

//concrete handler1
public class Waiter extends AHandler {

	@Override
	public void processOrder(Order o) {
		if(o.getDifficulty()<5) {
			System.out.println("the waiter is handling this: "+o.getName());
		}else {
			System.out.println("the waiter cannot handle this");
			this.nextPerson.processOrder(o);
		}
		
	}

}
