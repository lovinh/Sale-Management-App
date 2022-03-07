package Workshop;

import java.util.List;
import javax.naming.NameNotFoundException;

import java.util.ArrayList;
public class DrinksStorage {
	private List<Drinks> drinkList;
	private List<Topping> toppingList;
	private int numberOfDrinks;
	private int numberOfTopping;
	
	//Constructor
	public DrinksStorage() {
		super();
		// TODO Auto-generated constructor stub
		this.drinkList = new ArrayList<Drinks>();
		this.toppingList = new ArrayList<Topping>();
		this.numberOfDrinks = 0;
		this.numberOfTopping = 0;
	}
	public DrinksStorage(List<Drinks> drinkList, List<Topping> toppingList)
	{
		super();
		this.drinkList = drinkList;
		this.toppingList = toppingList;
		this.numberOfDrinks = this.drinkList.size();
		this.numberOfTopping = this.toppingList.size();
	}
	public DrinksStorage(List<Drinks> drinkList, List<Topping> toppingList, int numberOfDrinks, int numberOfTopping) {
		super();
		this.drinkList = drinkList;
		this.toppingList = toppingList;
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
			this.numberOfDrinks--;
		}
	}
	public void removeDrinkFromList(int index)
	{
		this.drinkList.remove(index);
		this.numberOfDrinks--;
	}
	public void removeDrinkFromList(int index_start, int index_end)
	{
		if (index_end >= this.numberOfTopping + 1)
			throw new IndexOutOfBoundsException("index_end out of list.");
		int remove_times = index_end - index_start;
		while (remove_times-- > 0)
		{
			this.drinkList.remove(index_start);
			this.numberOfDrinks--;
		}
	}
	public void clearDrinksList()
	{
		this.drinkList.clear();
		this.numberOfDrinks = 0;
	}
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
			this.numberOfTopping--;
		}
	}
	public void removeToppingFromList(int index)
	{
		this.toppingList.remove(index);
		this.numberOfTopping--;
	}
	public void removeToppingFromList(int index_start, int index_end)
	{
		if (index_end >= this.numberOfTopping + 1)
			throw new IndexOutOfBoundsException("index_end out of list.");
		int remove_times = index_end - index_start;
		while (remove_times-- > 0)
		{
			this.drinkList.remove(index_start);
			this.numberOfTopping--;
		}
	}
	public void removeToppingList()
	{
		this.toppingList.clear();
		this.numberOfTopping = 0;
	}
	
	//Add
	public void addDrinkToList(Drinks drinks)
	{
		this.drinkList.add(drinks);
		this.numberOfDrinks++;
	}
	public void addDrinkToList(List<Drinks> drinks)
	{
		for (Drinks drk : drinks)
		{
			this.drinkList.add(drk);
			this.numberOfDrinks++;
		}
	}
	public void addDrinkToList(Drinks[] drinks)
	{
		for (Drinks drk : drinks)
		{
			this.drinkList.add(drk);
			this.numberOfDrinks++;
		}
	}
	public void addToppingToList(Topping topping)
	{
		this.toppingList.add(topping);
		this.numberOfTopping++;
	}
	public void addToppingToList(List<Topping> topping)
	{
		for (Topping tp : topping)
		{
			this.toppingList.add(tp);
			this.numberOfTopping++;
		}
	}
	public void addToppingToList(Topping[] topping)
	{
		for (Topping tp : topping)
		{
			this.toppingList.add(tp);
			this.numberOfTopping++;
		}
	}
	
	//Update
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
	public void updateDrinksList(int index, String drinkName, long drinkPrice)
	{
		if (drinkPrice < 0)
			throw new IllegalArgumentException("Drink's price cannot be negative value. Invalid value: " + drinkPrice);
		this.drinkList.get(index).setName(drinkName);
		this.drinkList.get(index).setPrice(drinkPrice);
	}
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
	public void updateToppingList(int index, String toppingName, long toppingPrice)
	{
		if (toppingPrice < 0)
			throw new IllegalArgumentException("Topping's price cannot be negative value. Invalid value: " + toppingPrice);
		this.toppingList.get(index).setName(toppingName);
		this.toppingList.get(index).setPrice(toppingPrice);
	}
	
	//Select
	public Drinks getDrinks(String name)
	{
		for (Drinks drk : this.drinkList)
		{
			if (name == drk.getName())
				return drk;
		}
		return null;
	}
	public Topping getTopping(String name)
	{
		for (Topping tp : this.toppingList)
		{
			if (name == tp.getName())
				return tp;
		}
		return null;
	}
	public Drinks getDrinks(int index)
	{
		try {
			return this.drinkList.get(index);
		}
		catch(IndexOutOfBoundsException e){
			return null;
		}
	}
	public Topping getTopping(int index)
	{
		try {
			return this.toppingList.get(index);
		}
		catch(IndexOutOfBoundsException e){
			return null;
		}
	}


}
