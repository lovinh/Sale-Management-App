package Workshop;

public class Item {
	protected String name;
	protected long price;
	public Item() 
	{
		this.name = "default name";
		this.price = 0;
	}
	public Item(String name, long price)
	{
		this.name = name;
		if (price < 0) throw new IllegalArgumentException("price cannot be negative number! Invalid value: " + price);
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		if (price < 0) throw new IllegalArgumentException(price + "cannot be negative number!");
		else
			this.price = price;
	}
	
}
