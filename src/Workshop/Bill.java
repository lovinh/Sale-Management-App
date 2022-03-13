package Workshop;

import java.util.HashMap;

public class Bill {
	private HashMap<Drinks, Integer> itemCart;
	private int itemQuantity;
	private long totalCost;
	private float sale;
	private long customerPayment;
	private long customerNeededPayment;
	private String location;
	private String employeeName;
	private String customerName;
	
	public Bill(HashMap<Drinks, Integer> itemCart, int itemQuantity, long totalCost, float sale, long customerPayment,
			long customerNeededPayment) {
		this.itemCart = itemCart;
		this.itemQuantity = itemQuantity;
		this.totalCost = totalCost;
		this.sale = sale;
		this.customerPayment = customerPayment;
		this.customerNeededPayment = customerNeededPayment;
		this.location = "Store";
		this.employeeName = "Cashier";
		this.customerName = "";
	}

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

	public long getCustomerNeededPayment() {
		return customerNeededPayment;
	}

	public void setCustomerNeededPayment(long customerNeededPayment) {
		this.customerNeededPayment = customerNeededPayment;
	}
	
}
