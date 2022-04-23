package adapter;

//extend what we have already, implement what is new
public class AdapterB2A extends DiscountA implements IDiscountB{

	@Override
	public double calculateDiscountB(Customer c) {
		return this.calculateDiscountA(c.getNoOrders());
	}


}
