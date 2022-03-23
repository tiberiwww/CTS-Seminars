package singleton;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Database db1=new Database.getInstance();;
		Database db2=new Database.getInstance();;
	}

}
