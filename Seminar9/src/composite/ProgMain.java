package composite;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Structure menu = new Structure("Menu");
		
		Structure menuDrinks = new Structure("Drinks");
		Structure menuFood = new Structure("Food");
		
		menu.addNode(menuFood);
		menu.addNode(menuDrinks);
		
		menuFood.addNode(new Node("Pizza Carbonara", 20));
		menuFood.addNode(new Node("Pizza Margerita", 12));
		menuFood.addNode(new Node("Paste Carbonara", 18));
		
		System.out.println(menu.getInfo());

	
	}

}
