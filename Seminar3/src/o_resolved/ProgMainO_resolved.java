package o_resolved;


public class ProgMainO_resolved {

	public static void main(String[] args) {
		//Employee emp1=new Employee(1,"test","FTE", 2000);
		//System.out.println(emp1.toString()+"BONUS: "+emp1.calculateBonus());
	
		Employee emp2=new FTEmployee(0, "tibi", 400);
		System.out.println(emp2.toString() + "Bonus: "+ ((FTEmployee) emp2).calculateBonus());
	}

}
