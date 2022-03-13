package Workshop;
/**
 * <h1>Class Item</h1>
 * <div>This class include the base attribute for drinks and topping item. There is two main attributes: <em>name</em> and <em>price</em>.
 * the <em>name</em> specify the name of drinks or topping. the <em>price</em> specify price of drink or topping.
 * @author Lovinh
 * @see
 * <div>{@link Workshop.Drinks Drinks}</div>
 * <div>{@link Workshop.Topping Topping}</div>
 */
public class Item {
	protected String name;
	protected long price;
	/**
	 * Constructor to build a Item object. the <em>name</em> attribute will set to "default name" and the <em>price</em> attribute will equal to 0.
	 * @author Lovinh
	 */
	public Item() 
	{
		this.name = "default name";
		this.price = 0;
	}
	/**
	 * Constructor to build a Item object.
	 * @exception
	 * IllegalArgumentException if <em> price </em> is negative number.
	 * @author Lovinh
	 */
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
