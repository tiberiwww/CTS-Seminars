package Command;

public class ProgMain {

	public static void main(String[] args) {

		Chef chef1=new Chef("John");
		Chef chef2=new Chef("Maria");
		
		Waiter waiter=new Waiter();
		waiter.noteCommands(new PizzaOrder(chef1, "diavola"));
		waiter.noteCommands(new PastaOrder(chef2, "carbonara"));
		waiter.noteCommands(new PizzaOrder(chef1, "margherita"));
		waiter.sendCommands();

		

	}

}
