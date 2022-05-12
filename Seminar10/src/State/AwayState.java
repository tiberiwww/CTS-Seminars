package State;

public class AwayState implements IState {

	@Override
	public void act(String task) {
			System.out.println("The employee WILL prioritze this "+task);
	}

}
