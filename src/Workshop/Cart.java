package Workshop;
import java.util.HashMap;
import javax.naming.NameNotFoundException;

public class Cart {
	private HashMap<Drinks, Integer> itemCart;
	private int itemQuantity;
	private long totalCost;
	private float sale;
	
	// Constructor
	public Cart()
	{
		this.itemCart = new HashMap<Drinks, Integer>();
		this.itemQuantity = 0;
		this.totalCost = 0;
		this.sale = 0;
	}
	public Cart(HashMap<Drinks, Integer> itemCart, int itemQuantity, long totalCost) {
		super();
		this.itemCart = itemCart;
		this.itemQuantity = itemQuantity;
		this.totalCost = totalCost;
		this.sale = 0;
	}
	public Cart(HashMap<Drinks, Integer> itemCart, long totalCost)
	{
		super();
		this.itemCart = itemCart;
		this.itemQuantity = itemCart.size();
		this.totalCost = totalCost;
		this.sale = 0;
	}
	public Cart(HashMap<Drinks, Integer> itemCart)
	{
		super();
		this.itemCart = itemCart;
		this.itemQuantity = itemCart.size();
		for (Drinks drk : itemCart.keySet())
		{
			this.totalCost += drk.getTotalPrice() * itemCart.get(drk);
		}
		this.sale = 0;
	}
	
	// Getter and Setter
	public HashMap<Drinks, Integer> getItemCart() {
		return itemCart;
	}
	public void setItemCart(HashMap<Drinks, Integer> itemCart) {
		this.itemCart = itemCart;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public long getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(long totalCost) {
		this.totalCost = totalCost;
	}
	public float getSale() {
		return sale;
	}
	public void setSale(float sale) {
		this.sale = sale;
	}
	
	//Main method
	public void add(Drinks drinks)
	{
		this.itemCart.put(drinks, 1);
		this.itemQuantity++;
		this.totalCost += drinks.getTotalPrice() * this.itemCart.get(drinks);
	}
	public void add(Drinks drinks, int amount)
	{
		if (amount <= 0)
			throw new IllegalArgumentException("Amount cannot be a negative value. Invalid value: " + amount);
		else
		{
			this.itemCart.put(drinks, amount);
			this.itemQuantity++;
			this.totalCost += drinks.getTotalPrice() * this.itemCart.get(drinks);
		}
	}
	public void remove(String name) throws NameNotFoundException
	{
		Drinks remove_key = null;
		boolean has_found = false;
		for (Drinks drk : this.itemCart.keySet())
		{
			if (drk.getName() == name)
			{
				remove_key = drk;
				has_found = true;
				break;
			}
		}
		if (has_found == true)
		{
			this.itemCart.remove(remove_key);
			this.itemQuantity--;
			this.totalCost -= remove_key.getTotalPrice() * this.itemCart.get(remove_key); 
		} else 
		{
			throw new NameNotFoundException("Drinks's name " + name + "is not exist.");
		}
	}
	public void remove(int index)
	{
		Drinks remove_key = null;
		boolean has_found = false;
		if (index < 0 || index > this.itemCart.size())
			throw new IndexOutOfBoundsException("Index out of range. Invalid index: " + index);
		else
		{
			for (Drinks drk : this.itemCart.keySet())
			{
				if(index-- == 0)
				{
					remove_key = drk;
					has_found = true;
					break;
				}
			}
			if (has_found)
			{
				this.itemCart.remove(remove_key);
				this.itemQuantity--;
				this.totalCost -= remove_key.getTotalPrice() * this.itemCart.get(remove_key); 
			}
		}
	}
	public void updateTotalCost()
	{
		for (Drinks drk : this.itemCart.keySet())
		{
			this.totalCost += drk.getTotalPrice();
		}
	}
	

}
