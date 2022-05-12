package State;

public class ProgMain {

	public static void main(String[] args) {

		Employee emp=new Employee();
		emp.setState(enum_state.AWAY);
		emp.processTask("server down");
	}

}
