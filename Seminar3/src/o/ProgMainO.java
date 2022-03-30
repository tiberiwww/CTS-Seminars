package o;

public class ProgMainO {
	
	public static void main (String [] args) {
		Employee emp1=new Employee(1,"test","FTE", 2000);
		System.out.println(emp1.toString()+"BONUS: "+emp1.calculateBonus());
	}

}
