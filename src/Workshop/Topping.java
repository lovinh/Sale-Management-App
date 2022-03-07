package Workshop;
/**
 * Class Topping: Define a topping for drinks. This class inherit from Workshop.ItemClass.
 * <h2>Attributes:</h2>
 * <ul>
 * <li><strong>name:</strong><em>(String)</em>Topping's name.</li>
 * <li><strong>price:</strong><em>(long)</em>Topping's prices.</li>
 * <li><strong>numberOfTopping:</strong><em>(int)</em>Amounts of topping.</li>
 * </ul>
 * <h2>Method:</h2>
 * <ul>
 * <li><strong>get()</strong><em>(void)</em>Return attribute's value.</li>
 * <li><strong>set():</strong><em>(object)</em>Set attribute's value.</li>
 * <li><strong>addTopping(<b>int</b> number = 0):</strong><em>(void)</em>Increase topping's amounts by <em>number</em>. If <em>number</em>=0, add topping's amount by 1.</li>
 * <li><strong>removeTopping(<b>int</b> number = 0):</strong><em>(void)</em>Decrease topping's amounts by <em>number</em>.
 * If <em>number</em>=0, subtract value by 1.</li>
 * <li><strong>removeAllTopping()</strong><em>(void)</em>Set <em>numberOfTopping</em> equal to 0.</li>
 * </ul>
 * @author LoVinh
 * @see
 * <a href="#">Item</a>
 */
public class Topping extends Item{
	private int numberOfTopping;
	public Topping(String name, long price) {
		// TODO Auto-generated constructor stub
		super(name, price);
		numberOfTopping = 0;
	}
	public Topping(String name, long price, int numberOfTopping)
	{
		super(name, price);
		this.numberOfTopping = numberOfTopping;
	}
	public int getNumberOfTopping() {
		return numberOfTopping;
	}
	public void setNumberOfTopping(int numberOfTopping) {
		this.numberOfTopping = numberOfTopping;
	}
	public void addTopping(int number)
	{
		if (number <= 0) throw new IllegalArgumentException("number cannot be negative! Invalid value: " + number);
		else
			this.numberOfTopping += number;
	}
	public void addTopping()
	{
		this.numberOfTopping++;
	}
	public void removeTopping()
	{
		if (this.numberOfTopping == 0) throw new ArithmeticException("NumberOfTopping cannot be subtracted anymore");
		else
			this.numberOfTopping--;
	}
	public void removeTopping(int number)
	{
		if (number <= 0) throw new IllegalArgumentException("number cannot be negative! Invalid value: " + number);
		else if (number > this.numberOfTopping) throw new ArithmeticException("NumberOfTopping cannot be subtracted by this number " + number);
		else
			this.numberOfTopping -= number;
	}
	public void removeAllTopping()
	{
		if (this.numberOfTopping == 0) throw new ArithmeticException("NumberOfTopping cannot be subtracted anymore");
		else
			this.numberOfTopping = 0;
	}
}
