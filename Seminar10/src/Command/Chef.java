package Command;

public class Chef {
	private String name;
	
	
	
	public Chef(String name) {
		super();
		this.name = name;
	}

	public void cookPizza(String name) {
		System.out.println("the chef "+this.name+" is cooking "+name);
	}
	
	public void cookPasta(String name) {
		System.out.println("the chef "+this.name+" is cooking "+name);

	}

}
