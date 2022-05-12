package State;

public class VacantionState implements IState {

	@Override
	public void act(String task) {
			System.out.println("The employee cannot handle this: "+task);
	}

}
