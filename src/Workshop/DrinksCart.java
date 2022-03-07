package Workshop;

public class DrinksCart extends Drinks{
	private int amount;
	private long totalPrice;
	public DrinksCart(String name, long price) {
		// TODO Auto-generated constructor stub
		super(name, price);
		this.amount = 1;
		this.totalPrice = this.amount * this.getPrice();
	}
	public DrinksCart(String name, long price, int amount)
	{
		super(name, price);
		this.amount = amount;
		this.totalPrice = amount * this.getPrice();
	}
	
	//Getter and Setter
	public int getAmount()
	{
		return this.amount;
	}
	public void setAmount(int amount)
	{
		this.amount = amount;
	}
	public long getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(long totalPrice) {
		this.totalPrice = totalPrice;
	}
}
