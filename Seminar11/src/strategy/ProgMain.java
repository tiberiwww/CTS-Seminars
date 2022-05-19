package strategy;

public class ProgMain {

	public static void main(String[] args) {
		int[] vector = new int[10];

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				vector[i] = -i * 2 + 3;
			} else {
				vector[i] = i * 3 + 5;
			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(vector[i] + " ");
		}

		// Data data = new Data(vector, new StrategyMaxNumber());
		Data data = new Data(vector, new StrategyMinNumber());

		// we change the context, not the strategy

		System.out.println("Result: " + data.processVector());
	}

}
