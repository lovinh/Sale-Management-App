package UI;
import Workshop.Cart;
import Workshop.Drinks;
import Workshop.DrinksStorage;

import ConsoleUI.*;
import ConsoleUI.cList.cOrderList;
public class MenuOrder {
	private Cart cart;
	private DrinksStorage drinksStorage;
	private cOrderList<String> optionList;
	private cOrderList<String> orderDrinkList;
	private cOrderList<String> orderToppingList;
	private InputField inputField;
	private Label label;
	private Line line;
	public MenuOrder() {
		super();
		this.cart = new Cart();
		this.drinksStorage = new DrinksStorage();
		this.optionList = new cOrderList<String>();
		this.orderDrinkList = new cOrderList<String>();
		this.orderToppingList = new cOrderList<String>();
		this.label = new Label();
		this.inputField = new InputField();
		this.line = new Line('-', 20, 0);
		this.orderDrinkList.setTitle("Danh sach do uong: ");
		this.orderToppingList.setTitle("Danh sach topping di kem: ");
		
	}	
	public void updateDrinksStorage(String type)
	{
		if (type == "w")
		{
			if (this.drinksStorage.getDrinkList() != null)
				this.drinksStorage.clearDrinksList();
			if (this.drinksStorage.getToppingList() != null)
				this.drinksStorage.clearToppingList();
			this.inputField.setLabelField("Nhap so luong do uong");
			this.inputField.show();
			int numberOfDrink = this.inputField.getIntInput();
			for (int i = 0; i < numberOfDrink; i++)
			{
				this.inputField.setLabelField("Nhap ten mat hang");
				this.inputField.show();
				String nameDrink = this.inputField.getStringInput();
				boolean isValidPrice = false;
				long priceDrink = 0;
				while(!isValidPrice)
				{
					this.inputField.setLabelField("Nhap gia cho mat hang " + nameDrink);
					this.inputField.show();
					try {
						priceDrink = this.inputField.getLongInput();
						Drinks drk = new Drinks(nameDrink, priceDrink);
						this.drinksStorage.addDrinkToList(drk);
						isValidPrice = true;
					}
					catch (Exception ex)
					{
						this.label.setLabelContent("Gia khong hop le! Vui long nhap lai");
					}
				}
			}
			
		}
		
	}
	public void showDrinksStorage()
	{
		Label drinksStorageLbl = new Label("Hien thi danh sach mat hang bay ban: ", 0, "nm", true);
		drinksStorageLbl.show();
		this.orderDrinkList.setItemList(this.drinksStorage.getDrinksListAsString());
		this.orderDrinkList.show();
		this.line.show();
	}
	public int showOption(String[] ListOption)
	{
//		String[] ListOption = {"Ban hang" , "Cap nhat kho", "Dang xuat"};
		this.optionList.setItemList(ListOption);
		this.optionList.setTitle("Danh sach lua chon: ");
		this.optionList.show();
		return this.optionList.getNumberOfItem();
	}
	public int getOption()
	{
		this.inputField.setLabelField("Nhap lua chon");
		this.inputField.setNextLine(false);
		this.inputField.show();
		return this.inputField.getIntInput();
	}
}
