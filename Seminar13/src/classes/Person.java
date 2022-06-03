package classes;

public class Person {

	private String name;
	private String personalNumber;
	private int age;// not ok
	private int[] costReceipts;

	public Person() {
	}

	public Person(String name, String personalNumber, int age, int[] costReceipts) {
		super();
		this.name = name;
		this.personalNumber = personalNumber;
		this.age = age;
		this.costReceipts = costReceipts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPersonalNumber() {
		return personalNumber;
	}

	public void setPersonalNumber(String personalNumber) {
		this.personalNumber = personalNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int[] getCostReceipts() {
		return costReceipts;
	}

	public void setCostReceipts(int[] costReceipts) {
		this.costReceipts = costReceipts;
	}

	public double calculateAvgCosts() throws Exception {
		if (this.costReceipts == null || this.costReceipts.length == 0) {
			throw new Exception();
		}
		int sum = 0;
		for (int cost : this.costReceipts) {
			if(cost < 0 || cost > 200) {
				throw new Exception();
			}
			sum += cost;
		}
		return sum / this.costReceipts.length;
	}
}
