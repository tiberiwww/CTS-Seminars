package chainOfResponsability;

public abstract class AHandler {
	
	protected AHandler nextPerson;
	
	public void setSuccessor(AHandler nextPerson) {
		this.nextPerson=nextPerson;
	}
	public abstract void processOrder(Order o);		//handle request method
	

}
