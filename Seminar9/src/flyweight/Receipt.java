package flyweight;

public class Receipt implements IReceipt{

	
	private String name = "Tibi SRL";
	private ReceiptType type;

	
	
	public Receipt(ReceiptType type) {
		super();
		this.type = type;
	}



	@Override
	public void printReceipt(ReceiptData data) {
		// TODO Auto-generated method stub
		System.out.println("Restaurant: " + this.name + " type: " + this.type + " " + data.getPrice());
	}

	
}
