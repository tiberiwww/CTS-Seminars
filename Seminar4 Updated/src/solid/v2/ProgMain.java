package solid.v2;

public class ProgMain {

	public static void main(String[] args) {
			Calculator calculator=new Calculator();
			IoperationType add=new AddOperation();
			System.out.println(calculator.calculate(10, 2, add));
			
	}

}
