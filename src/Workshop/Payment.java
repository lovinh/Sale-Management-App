package Workshop;

import java.util.HashMap;

public class Payment {
	private HashMap<Drinks, Integer> itemCart;
	private int itemQuantity;
	private long totalCost;
	private float sale;
	private long customerPayment;
	
	// Constructor
	public Payment() {
		// TODO Auto-generated constructor stub
		this.itemCart = new HashMap<Drinks, Integer>();
		this.itemQuantity = 0;
		this.totalCost = 0;
		this.sale = 0;
	}
	public Payment(HashMap<Drinks, Integer> itemCart, int itemQuantity, long totalCost, float sale) {
		this.itemCart = itemCart;
		this.itemQuantity = itemQuantity;
		this.totalCost = totalCost;
		this.sale = sale;
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
	public long getCustomerPayment() {
		return customerPayment;
	}
	public void setCustomerPayment(long customerPayment) {
		this.customerPayment = customerPayment;
	}
	
	// Main method
	public long getCustomerPaymentPrice()
	{
		return this.totalCost - (long) (this.totalCost * this.sale);
	}
	
	public void updateDatabase()
	{
		
	}
	public Bill extractBill()
	{
		return new Bill(this.itemCart, this.itemQuantity, this.totalCost, this.sale, this.customerPayment, this.getCustomerPaymentPrice());
	}
	
}
