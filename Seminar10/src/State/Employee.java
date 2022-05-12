package State;

public class Employee {
	
	IState currentState;  	//only 1 state

	public Employee(IState currentState) {
		super();
		this.currentState = currentState;
	}
	
	public Employee() {
		this.currentState=new WorkingState();		
	}
	
	public void setState(enum_state state) {
		switch(state) {
		case WORKING:
			this.currentState=new WorkingState();
			break;
		case AWAY:
			this.currentState=new AwayState();
			break;
		case VACANTION:
			this.currentState=new VacantionState();
			break;
		default:
			this.currentState=new WorkingState();
		}
	}
	
	public void processTask(String task) {
		this.currentState.act(task); 	//act based on current state
	}
}
