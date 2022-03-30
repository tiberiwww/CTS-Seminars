package solid;
//d example
public class Calculator {
	private enum Operations{ADD, SUBSTRACT, MULTIPLY, DEVIDE};
	Calculator(){
	
	}
	
	public double calculate(double a, double b, int i) {
		
		switch(i) {
		case 1:
			return a+b;
			//break;
		case 2:
			return a-b;
			//break;
			default:
				return 0;
				
		}		
	}

}
