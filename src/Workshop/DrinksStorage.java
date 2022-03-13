package Workshop;

import java.util.ArrayList;
import java.util.List;
import javax.naming.NameNotFoundException;

import ConsoleUI.ConsoleUI;

/**
 * <h1>Class DrinksStorage</h1>
 * <div>This class use to store and perform all kind of drinks available in the store. There is two main item categories in this class:
 * <em>Drinks</em> and <em>Topping</em>.</div>
 * <h2>Attribute:</h2>
 * <ul>
 * <li><b>drinkList</b> (<em>List</em>): Store list of drinks available in the store.</li>
 * <li><b>toppingList</b> (<em>List</em>): Store list of toppings available in the store.</li>
 * <li><b>numberOfDrinks</b> (<em>int</em>): Number of drinks available in the store.</li>
 * <li><b>numberOfTopping</b> (<em>int</em>): Number of toppings available in the store.</li>
 * </ul>
 * <h2>Method</h2>
 * <ul>
 * <li><b>Getter and Setter</b> (<em></em>):</li>
 * <li><b>RemoveDrinkFromList</b>(<b>int</b> <em>index</em>): <b>void</b>
 * <li><b>RemoveDrinkFromList</b>(<b>String</b> <em>name</em>): <b>void</b> 
 * <li><b>RemoveDrinkFromList</b>(<b>int</b> <em>index_start</em>, <b>int</b> <em>index_end</em>): <b>void</b>
 * <li><b>clearDrinksList</b>(): <b>void</b> : Empty the drinks list.
 * <li><b>RemoveToppingFromList</b>(<b>int</b> <em>index</em>): <b>void</b> : Remove a topping in position <em>index</em> out of list.
 * <li><b>RemoveToppingFromList</b>(<b>String</b> <em>name</em>): <b>void</b> : Remove a topping with <em>name</em> out of list. Throw exception <b><em>NameNotFound</em></b> if <em>name</em> doesn't exist in this list.
 * <li><b>RemoveToppingFromList</b>(<b>int</b> <em>index_start</em>, <b>int</b> <em>index_end</em>): <b>void</b> : Remove a sequence of drink from <em>index_start</em> to <em>index_end</em>.
 * <li><b>clearToppingList</b>(): <b>void</b> : Empty the topping list.
 * </ul>
 * 
 */
public class DrinksStorage {
	private List<Drinks> drinkList;
	private List<Topping> toppingList;
	private List<String> drinkNameList;
	private List<String> toppingNameList;
	private int numberOfDrinks;
	private int numberOfTopping;
	
	//Constructor
	public DrinksStorage() {
		super();
		// TODO Auto-generated constructor stub
		this.drinkList = new ArrayList<Drinks>();
		this.toppingList = new ArrayList<Topping>();
		this.drinkNameList = new ArrayList<String>();
		this.toppingNameList = new ArrayList<String>();
		this.numberOfDrinks = 0;
		this.numberOfTopping = 0;
	}
	public DrinksStorage(List<Drinks> drinkList, List<Topping> toppingList)
	{
		super();
		this.drinkList = drinkList;
		this.toppingList = toppingList;
		for (Drinks dk : this.drinkList)
		{
			this.drinkNameList.add(dk.getName());
		}
		for (Topping tp : this.toppingList)
		{
			this.toppingNameList.add(tp.getName());
		}
		this.numberOfDrinks = this.drinkList.size();
		this.numberOfTopping = this.toppingList.size();
	}
	public DrinksStorage(List<Drinks> drinkList, List<Topping> toppingList, int numberOfDrinks, int numberOfTopping) {
		super();
		this.drinkList = drinkList;
		this.toppingList = toppingList;
		for (Drinks dk : this.drinkList)
		{
			this.drinkNameList.add(dk.getName());
		}
		for (Topping tp : this.toppingList)
		{
			this.toppingNameList.add(tp.getName());
		}
		this.numberOfDrinks = numberOfDrinks;
		this.numberOfTopping = numberOfTopping;
	}
	
	//Getter and Setter
	public List<Drinks> getDrinkList() {
		return drinkList;
	}
	public void setDrinkList(List<Drinks> drinkList) {
		this.drinkList = drinkList;
	}
	public List<Topping> getToppingList() {
		return toppingList;
	}
	public void setToppingList(List<Topping> toppingList) {
		this.toppingList = toppingList;
	}
	
	/**
	 * Return a list of drinks as name of them. List just only contain name in type of <em>string</em>.
	 * @return
	 * {@link List}
	 * @exception
	 * None
	 * @author Lovinh
	 * @see
	 * <ul>
	 * <li>{@link Workshop.DrinksStorage#getDrinkList()}</li>
	 * <li>{@link Workshop.DrinksStorage#getToppingList()}</li>
	 */
	public List<String> getDrinksListAsString()
	{
		return this.drinkNameList;
	}
	/**
	 * Return a list of topping as name of them. List just only contain name in type of <em>string</em>.
	 * @return
	 * {@link List}
	 * @exception
	 * None
	 * @author Lovinh
	 * @see
	 * <ul>
	 * <li>{@link Workshop.DrinksStorage#getDrinkList()}</li>
	 * <li>{@link Workshop.DrinksStorage#getToppingList()}</li>
	 */
	public List<String> getToppingsListAsString()
	{
		return this.toppingNameList;
	}
	
	public int getNumberOfDrinks() {
		return numberOfDrinks;
	}
	public void setNumberOfDrinks(int numberOfDrinks) {
		this.numberOfDrinks = numberOfDrinks;
	}
	public int getNumberOfTopping() {
		return numberOfTopping;
	}
	public void setNumberOfTopping(int numberOfTopping) {
		this.numberOfTopping = numberOfTopping;
	}
	
	//Add, remove, update, select
	
	//Remove
	/**
	 * Remove a drink with <em>name</em> out of list. Throw exception <b><em>NameNotFound</em></b> if <em>name</em> doesn't exist in this list.
	 * @return
	 * <b>void</b>
	 * @exception
	 * <b>IndexOutOfBoundsException</b>
	 * @author LoVinh
	 * @see
	 * <div><a href="#">removeToppingList()</a></div>
	 * <div><a href="#">clearDrinkList()</a></div>
	 * <div><a href="#">clearToppingList()</a></div>
	 */
	public void removeDrinkFromList(String name) throws NameNotFoundException
	{
		int remove_index = 0;
		boolean has_found = false;
		for (int i = 0; i < this.numberOfDrinks; i++)
		{
			if (drinkList.get(i).getName() == name)
			{
				remove_index = i;
				has_found = true;
				break;
			}
		}
		if (!has_found)
		{
			throw new NameNotFoundException("Drink with name " + name + "is not exist.");
		}
		else
		{
			this.drinkList.remove(remove_index);
			this.drinkNameList.remove(remove_index);
			this.numberOfDrinks--;
		}
	}
	/**
	 * Remove a drink in position <em>index</em> out of list.
	 * @return
	 * <b>void</b>
	 * @exception
	 * <b>IndexOutOfBoundsException</b>
	 * @author LoVinh
	 * @see
	 * <div><a href="#">removeToppingList()</a></div>
	 * <div><a href="#">clearDrinkList()</a></div>
	 * <div><a href="#">clearToppingList()</a></div>
	 */
	public void removeDrinkFromList(int index)
	{
		this.drinkList.remove(index);
		this.drinkNameList.remove(index);
		this.numberOfDrinks--;
	}
	/**
	 * Remove a sequence of drink from <em>index_start</em> to <em>index_end</em>. Threw <b><em>IndexOutOfBoundsException</em></b> if index_end was larger than <em>numberOfDrinks</em> 
	 * @return
	 * <b>void</b>
	 * @exception
	 * <b>IndexOutOfBoundsException</b>
	 * @author LoVinh
	 * @see
	 * <div><a href="#">removeToppingList()</a></div>
	 * <div><a href="#">clearDrinkList()</a></div>
	 * <div><a href="#">clearToppingList()</a></div>
	 */
	public void removeDrinkFromList(int index_start, int index_end)
	{
		if (index_end >= this.numberOfDrinks + 1)
			throw new IndexOutOfBoundsException("index_end out of list.");
		int remove_times = index_end - index_start;
		while (remove_times-- > 0)
		{
			this.drinkList.remove(index_start);
			this.drinkNameList.remove(index_start);
			this.numberOfDrinks--;
		}
	}
	/**
	 * Empty the drinks list.
	 * @return
	 * <b>void</b>
	 * @exception
	 * <b>None</b>
	 * @author LoVinh
	 * @see
	 * <div><a href="#">removeToppingList()</a></div>
	 * <div><a href="#">clearDrinkList()</a></div>
	 * <div><a href="#">clearToppingList()</a></div>
	 */
	public void clearDrinksList()
	{
		this.drinkList.clear();
		this.drinkNameList.clear();
		this.numberOfDrinks = 0;
	}
	/**
	 * Remove a drink in position <em>index</em> out of list.
	 * @return
	 * <b>void</b>
	 * @exception
	 * <b>IndexOutOfBoundsException</b>
	 * @author LoVinh
	 * @see
	 * <div><a href="#">removeToppingList()</a></div>
	 * <div><a href="#">clearDrinkList()</a></div>
	 * <div><a href="#">clearToppingList()</a></div>
	 */
	public void removeToppingFromList(String name) throws NameNotFoundException
	{
		int remove_index = 0;
		boolean has_found = false;
		for (int i = 0; i < this.numberOfTopping; i++)
		{
			if (toppingList.get(i).getName() == name)
			{
				remove_index = i;
				has_found = true;
				break;
			}
		}
		if (!has_found)
		{
			throw new NameNotFoundException("Topping with name " + name + "is not exist.");
		}
		else
		{
			this.toppingList.remove(remove_index);
			this.toppingNameList.remove(remove_index);
			this.numberOfTopping--;
		}
	}
	/**
	 * Remove a drink in position <em>index</em> out of list.
	 * @return
	 * <b>void</b>
	 * @exception
	 * <b>IndexOutOfBoundsException</b>
	 * @author LoVinh
	 * @see
	 * <div><a href="#">removeToppingList()</a></div>
	 * <div><a href="#">clearDrinkList()</a></div>
	 * <div><a href="#">clearToppingList()</a></div>
	 */
	public void removeToppingFromList(int index)
	{
		this.toppingList.remove(index);
		this.toppingNameList.remove(index);
		this.numberOfTopping--;
	}
	/**
	 * Remove a drink in position <em>index</em> out of list.
	 * @return
	 * <b>void</b>
	 * @exception
	 * <b>IndexOutOfBoundsException</b>
	 * @author LoVinh
	 * @see
	 * <div><a href="#">removeToppingList()</a></div>
	 * <div><a href="#">clearDrinkList()</a></div>
	 * <div><a href="#">clearToppingList()</a></div>
	 */
	public void removeToppingFromList(int index_start, int index_end)
	{
		if (index_end >= this.numberOfTopping + 1)
			throw new IndexOutOfBoundsException("index_end out of list.");
		int remove_times = index_end - index_start;
		while (remove_times-- > 0)
		{
			this.drinkList.remove(index_start);
			this.drinkNameList.remove(index_start);
			this.numberOfTopping--;
		}
	}
	/**
	 * Remove a drink in position <em>index</em> out of list.
	 * @return
	 * <b>void</b>
	 * @exception
	 * <b>IndexOutOfBoundsException</b>
	 * @author LoVinh
	 * @see
	 * <div><a href="#">removeToppingList()</a></div>
	 * <div><a href="#">clearDrinkList()</a></div>
	 * <div><a href="#">clearToppingList()</a></div>
	 */
	public void clearToppingList()
	{
		this.toppingList.clear();
		this.toppingNameList.clear();
		this.numberOfTopping = 0;
	}
	
	//Add
	/**
	 * Add a drink object into the list of drinks
	 * @param
	 * {@link Workshop.Drinks Drinks}
	 * @return
	 * <b>void</b>
	 * @exception
	 * @author LoVinh
	 * @see
	 * <div>{@link Workshop.DrinksStorage#getDrinks(String) getDrinks()}</div>
	 * <div>{@link Workshop.DrinksStorage#addToppingToList(Topping) addToppingToList()}</div>
	 * <div>{@link Workshop.DrinksStorage#removeDrinkFromList(String) removeDrinkFromList()}</div>
	 */
	public void addDrinkToList(Drinks drinks)
	{
		this.drinkList.add(drinks);
		this.drinkNameList.add(drinks.getName());
		this.numberOfDrinks++;
	}
	/**
	 * Add a drink object into the list of drinks
	 * @param
	 * {@link Workshop.Drinks}
	 * @return
	 * <b>void</b>
	 * @exception
	 * @author LoVinh
	 * @see
	 * <div>{@link Workshop.DrinksStorage#getDrinks(String) getDrinks()}</div>
	 * <div>{@link Workshop.DrinksStorage#addToppingToList(Topping) addToppingToList()}</div>
	 * <div>{@link Workshop.DrinksStorage#removeDrinkFromList(String) removeDrinkFromList()}</div>
	 */
	public void addDrinkToList(List<Drinks> drinks)
	{
		for (Drinks drk : drinks)
		{
			this.drinkList.add(drk);
			this.drinkNameList.add(drk.getName());
			this.numberOfDrinks++;
		}
	}
	/**
	 * Add a drink object into the list of drinks
	 * @param
	 * {@link Workshop.Drinks}
	 * @return
	 * <b>void</b>
	 * @exception
	 * @author LoVinh
	 * @see
	 * <div>{@link Workshop.DrinksStorage#getDrinks(String) getDrinks()}</div>
	 * <div>{@link Workshop.DrinksStorage#addToppingToList(Topping) addToppingToList()}</div>
	 * <div>{@link Workshop.DrinksStorage#removeDrinkFromList(String) removeDrinkFromList()}</div>
	 */
	public void addDrinkToList(Drinks[] drinks)
	{
		for (Drinks drk : drinks)
		{
			this.drinkList.add(drk);
			this.drinkNameList.add(drk.getName());
			this.numberOfDrinks++;
		}
	}
	/**
	 * Add a drink object into the list of drinks
	 * @param
	 * {@link Workshop.Drinks}
	 * @return
	 * <b>void</b>
	 * @exception
	 * @author LoVinh
	 * @see
	 * <div>{@link Workshop.DrinksStorage#getDrinks(String) getDrinks()}</div>
	 * <div>{@link Workshop.DrinksStorage#addToppingToList(Topping) addToppingToList()}</div>
	 * <div>{@link Workshop.DrinksStorage#removeDrinkFromList(String) removeDrinkFromList()}</div>
	 */
	public void addToppingToList(Topping topping)
	{
		this.toppingList.add(topping);
		this.toppingNameList.add(topping.getName());
		this.numberOfTopping++;
	}
	/**
	 * Add a drink object into the list of drinks
	 * @param
	 * {@link Workshop.Drinks}
	 * @return
	 * <b>void</b>
	 * @exception
	 * @author LoVinh
	 * @see
	 * <div>{@link Workshop.DrinksStorage#getDrinks(String) getDrinks()}</div>
	 * <div>{@link Workshop.DrinksStorage#addToppingToList(Topping) addToppingToList()}</div>
	 * <div>{@link Workshop.DrinksStorage#removeDrinkFromList(String) removeDrinkFromList()}</div>
	 */
	public void addToppingToList(List<Topping> topping)
	{
		for (Topping tp : topping)
		{
			this.toppingList.add(tp);
			this.toppingNameList.add(tp.getName());
			this.numberOfTopping++;
		}
	}
	/**
	 * Add a drink object into the list of drinks
	 * @param
	 * {@link Workshop.Drinks}
	 * @return
	 * <b>void</b>
	 * @exception
	 * @author LoVinh
	 * @see
	 * <div>{@link Workshop.DrinksStorage#getDrinks(String) getDrinks()}</div>
	 * <div>{@link Workshop.DrinksStorage#addToppingToList(Topping) addToppingToList()}</div>
	 * <div>{@link Workshop.DrinksStorage#removeDrinkFromList(String) removeDrinkFromList()}</div>
	 */
	public void addToppingToList(Topping[] topping)
	{
		for (Topping tp : topping)
		{
			this.toppingList.add(tp);
			this.toppingNameList.add(tp.getName());
			this.numberOfTopping++;
		}
	}
	
	//Update
	/**
	 * Remove a drink in position <em>index</em> out of list.
	 * @return
	 * <b>void</b>
	 * @exception
	 * <b>IndexOutOfBoundsException</b>
	 * @author LoVinh
	 * @see
	 * <div><a href="#">removeToppingList()</a></div>
	 * <div><a href="#">clearDrinkList()</a></div>
	 * <div><a href="#">clearToppingList()</a></div>
	 */
	public void updateDrinksList(String name, String drinkName, long drinkPrice) throws NameNotFoundException
	{
		Drinks updateDrink = this.getDrinks(name);
		if (updateDrink == null)
			throw new NameNotFoundException("Drink with name " + name + "is not exist.");
		else
		{
			if (drinkPrice < 0)
				throw new IllegalArgumentException("Drink's price cannot be negative value. Invalid value: " + drinkPrice);
			updateDrink.setName(drinkName);
			updateDrink.setPrice(drinkPrice);
		}
	}
	/**
	 * Remove a drink in position <em>index</em> out of list.
	 * @return
	 * <b>void</b>
	 * @exception
	 * <b>IndexOutOfBoundsException</b>
	 * @author LoVinh
	 * @see
	 * <div><a href="#">removeToppingList()</a></div>
	 * <div><a href="#">clearDrinkList()</a></div>
	 * <div><a href="#">clearToppingList()</a></div>
	 */
	public void updateDrinksList(int index, String drinkName, long drinkPrice)
	{
		if (drinkPrice < 0)
			throw new IllegalArgumentException("Drink's price cannot be negative value. Invalid value: " + drinkPrice);
		this.drinkList.get(index).setName(drinkName);
		this.drinkList.get(index).setPrice(drinkPrice);
	}
	/**
	 * Remove a drink in position <em>index</em> out of list.
	 * @return
	 * <b>void</b>
	 * @exception
	 * <b>IndexOutOfBoundsException</b>
	 * @author LoVinh
	 * @see
	 * <div><a href="#">removeToppingList()</a></div>
	 * <div><a href="#">clearDrinkList()</a></div>
	 * <div><a href="#">clearToppingList()</a></div>
	 */
	public void updateToppingList(String name, String toppingName, long toppingPrice) throws NameNotFoundException
	{
		Topping updateTopping = this.getTopping(name);
		if (updateTopping == null)
			throw new NameNotFoundException("Topping with name " + name + "is not exist.");
		else
		{
			if (toppingPrice < 0)
				throw new IllegalArgumentException("Topping's price cannot be negative value. Invalid value: " + toppingPrice);
			updateTopping.setName(toppingName);
			updateTopping.setPrice(toppingPrice);
		}
	}
	/**
	 * Remove a drink in position <em>index</em> out of list.
	 * @return
	 * <b>void</b>
	 * @exception
	 * <b>IndexOutOfBoundsException</b>
	 * @author LoVinh
	 * @see
	 * <div><a href="#">removeToppingList()</a></div>
	 * <div><a href="#">clearDrinkList()</a></div>
	 * <div><a href="#">clearToppingList()</a></div>
	 */
	public void updateToppingList(int index, String toppingName, long toppingPrice)
	{
		if (toppingPrice < 0)
			throw new IllegalArgumentException("Topping's price cannot be negative value. Invalid value: " + toppingPrice);
		this.toppingList.get(index).setName(toppingName);
		this.toppingList.get(index).setPrice(toppingPrice);
	}
	
	//Select
	/**
	 * Get a specify drink which has name <em>name</em>
	 * @return
	 * <div><b>Drinks</b> if <em>name</em> is exist in drinks list.</div>
	 * <div><b>null</b> if <em>name</em> is not exist in drinks list. </div>
	 * @exception
	 * NullPointerException 
	 * {@link IllegalArgumentException}
	 * @author LoVinh
	 * @see
	 * <div>{@link Workshop.DrinksStorage#getTopping(String) getDrinks()}</div>
	 */
	public Drinks getDrinks(String name)
	{
		if (name == null)
			throw new NullPointerException("Name cannot be null.");
		else if (name == "")
			throw new IllegalArgumentException("Name cannot be empty.");
		else
		{
			for (Drinks drk : this.drinkList)
			{
				if (name == drk.getName())
					return drk;
			}
		}
		return null;
	}
	/**
	 * Get a specify topping which has name <em>name</em>
	 * @return
	 * <div><b>Topping</b> if <em>name</em> is exist in toppings list.</div>
	 * <div><b>null</b> if <em>name</em> is not exist in toppings list. </div>
	 * @exception
	 * NullPointerException
	 * {@link IllegalArgumentException}
	 * @author LoVinh
	 * @see
	 * <div>{@link Workshop.DrinksStorage#getDrinks(int) getDrinks()}</div>
	 * <div>{@link Workshop.DrinksStorage#getDrinks(String) getDrinks()}</div>
	 */
	public Topping getTopping(String name)
	{
		if (name == null)
			throw new NullPointerException("Name cannot be null.");
		else if (name == "")
			throw new IllegalArgumentException("Name cannot be empty.");
		else
		{
			for (Topping tp : this.toppingList)
			{
				if (name == tp.getName())
					return tp;
			}
		}
		return null;
	}
	/**
	 * Get a specify drinks which is located in position <em>index</em>.
	 * @return
	 * <div><b>Drinks</b> if <em>index</em> is exist in Drinks list.</div>
	 * <div><b>null</b> if IndexOutOfBoundsException
	 * @exception
	 * IllegalArgumentException
	 * @author LoVinh
	 * @see
	 * <div>{@link Workshop.DrinksStorage#getTopping(String) getDrinks()}</div>
	 */
	public Drinks getDrinks(int index)
	{
		if (index < 0)
			throw new IllegalArgumentException("index cannot be null: " + index);
		try {
			return this.drinkList.get(index);
		}
		catch(IndexOutOfBoundsException e){
			return null;
		}
	}
	/**
	 * Get a specify topping which is located in position <em>index</em>.
	 * @return
	 * <div><b>Drinks</b> if <em>index</em> is exist in toppings list.</div>
	 * <div><b>null</b> if catch IndexOutOfBoundsException
	 * @exception
	 * IllegalArgumentException
	 * @author LoVinh
	 * @see
	 * <div>{@link Workshop.DrinksStorage#getDrinks(int) getDrinks()}</div>
	 */
	public Topping getTopping(int index)
	{
		if (index < 0)
			throw new IllegalArgumentException("index cannot be null: " + index);
		try {
			return this.toppingList.get(index);
		}
		catch(IndexOutOfBoundsException e){
			return null;
		}
	}
	
	
	


}
