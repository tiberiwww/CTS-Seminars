package State;

public class WorkingState implements IState {

	@Override
	public void act(String task) {
		System.out.println("The employee WORKS on this: "+task);
	}

}
