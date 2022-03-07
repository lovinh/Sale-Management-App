package Workshop;

import java.util.ArrayList;
import java.util.List;

public class Drinks extends Item{
	private boolean size;
	private ArrayList<Topping> topping;
	private int SugarLevel;
	private int IceLevel;
	private float sale;
	public Drinks(String name, long price) {
		super(name, price);
		this.size = true;
		this.topping = new ArrayList<Topping>();
		this.sale = 0;
		this.SugarLevel = 4;
		this.IceLevel = 4;
	}
	public Drinks(String name, boolean size, ArrayList<Topping> topping, int sugarLevel, int iceLevel, float sale, long price) {
		super(name, price);
		this.size = size;
		this.topping = topping;
		if (sugarLevel < 0 || sugarLevel > 5)
			throw new IllegalArgumentException("sugarLevel is only in range[0, 5]. Invalid value: " + sugarLevel);
		else
			SugarLevel = sugarLevel;
		if (sugarLevel < 0 || sugarLevel > 5)
			throw new IllegalArgumentException("iceLevel is only in range[-2, 5]. Invalid value: " + sugarLevel);
		else
			IceLevel = iceLevel;
		if (sale < 0 || sale > 1)
			throw new IllegalArgumentException("sale is only in range[0, 1]. Invalid value: " + sale);
		else
			this.sale = sale;
	}
	public boolean getSize() {
		return size;
	}
	public void setSize(boolean size) {
		this.size = size;
	}
	public List<Topping> getTopping() {
		return this.topping;
	}
	public void setTopping(ArrayList<Topping> topping) {
		this.topping = topping;
	}
	public int getNumberOfTopping() {
		return this.topping.size();
	}
	public int getSugarLevel() {
		return SugarLevel;
	}
	public void setSugarLevel(int sugarLevel) {
		if (sugarLevel < 0 || sugarLevel > 5)
			throw new IllegalArgumentException("sugarLevel is only in range[0, 5]. Invalid value: " + sugarLevel);
		else
			SugarLevel = sugarLevel;
	}
	public int getIceLevel() {
		return IceLevel;
	}
	public void setIceLevel(int iceLevel) {
		if (iceLevel < 0 || iceLevel > 5)
			throw new IllegalArgumentException("iceLevel is only in range[-2, 5]. Invalid value: " + iceLevel);
		else
			IceLevel = iceLevel;
	}
	public float getSale() {
		return sale;
	}
	public void setSale(float sale) {
		if (sale < 0 || sale > 1)
			throw new IllegalArgumentException("sale is only in range[0, 1]. Invalid value: " + sale);
		else
			this.sale = sale;
	}
	
	public void addTopping(Topping topping)
	{
		this.topping.add(topping);
	}
	public void removeTopping()
	{
		if (this.topping.size() == 0) throw new ArithmeticException("Topping cannot be removed anymore");
		else
			this.topping.remove(this.topping.size() - 1);
	}
	public long getTotalPrice()
	{
		long totalPrice = 0;
		long bonus = 0;
		for (int i = 0; i < this.topping.size(); i++)
		{
			bonus += this.topping.get(i).getPrice() * this.topping.get(i).getNumberOfTopping();
		}
		if (size == true)
			bonus += 7000;
		totalPrice = this.price + bonus - (long) (this.price * sale);
		return totalPrice;
	}
}
