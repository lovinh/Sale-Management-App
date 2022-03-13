import UI.MenuOrder;
import ConsoleUI.cList.cOrderList;
import ConsoleUI.InputField;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuOrder menuOrder = new MenuOrder();
		String[] ListOption = {"Ban hang" , "Cap nhat kho", "Dang xuat"};
		boolean hasLogOut = false;
		int option = 0;
		while (!hasLogOut)
		{
			menuOrder.showOption(ListOption);
			try {
				option = menuOrder.getOption();
			}
			catch (NumberFormatException ex)
			{
				System.out.print("Lua chon khong phu hop. Xin vui long thu lai!\n");
				menuOrder.showOption(ListOption);
			}
			finally {
				switch (option)
				{
					case 1:
					{
						menuOrder.showDrinksStorage();
						break;
					}
					case 2:
					{
						menuOrder.updateDrinksStorage("w");
						break;
					}
					case 3:
					{
						hasLogOut = true;
						break;
					}
					default:
					{
						System.out.print("Lua chon khong phu hop. Xin vui long thu lai!\n");
					}
				}
			}
			
		}
		System.out.print("Da dang xuat! Xin cam on!");
	}

}
