package ConsoleUI.cList;

import java.util.List;

import ConsoleUI.ConsoleUI;

public class cUnorderList<T> extends cList<T> implements ConsoleUI{
	private char bullet;
	
	
	public cUnorderList() {
		super();
		// TODO Auto-generated constructor stub
		this.bullet = '-';
	}


	public cUnorderList(boolean orderType) {
		super(orderType);
		// TODO Auto-generated constructor stub
		this.bullet = '-';
	}


	public cUnorderList(List<T> itemList, boolean orderType, int numberOfItem) {
		super(itemList, orderType, numberOfItem);
		// TODO Auto-generated constructor stub
		this.bullet = '-';
	}


	public cUnorderList(List<T> itemList, boolean orderType) {
		super(itemList, orderType);
		// TODO Auto-generated constructor stub
		this.bullet = '-';
	}


	public cUnorderList(List<T> itemList, int numberOfItem, boolean orderType, String title, int margin, int indent,
			int padding) {
		super(itemList, numberOfItem, orderType, title, margin, indent, padding);
		// TODO Auto-generated constructor stub
		this.bullet = '-';
	}


	public cUnorderList(List<T> itemList) {
		super(itemList);
		// TODO Auto-generated constructor stub
		this.bullet = '-';
	}


	public cUnorderList(T[] itemArray, boolean orderType, int numberOfItem) {
		super(itemArray, orderType, numberOfItem);
		// TODO Auto-generated constructor stub
		this.bullet = '-';
	}


	public cUnorderList(T[] itemArray, boolean orderType) {
		super(itemArray, orderType);
		// TODO Auto-generated constructor stub
		this.bullet = '-';
	}


	public cUnorderList(T[] itemArray) {
		super(itemArray);
		// TODO Auto-generated constructor stub
		this.bullet = '-';
	}
	

	public char getBullet() {
		return bullet;
	}

	public void setBullet(String type) {
		if (type == "dash") 
			this.bullet = '-';
		else if (type == "dot")
			this.bullet = '.';
		else if (type == "plus")
			this.bullet = '+';
		else if (type == "asterisk")
			this.bullet = '*';
		else
			throw new IllegalArgumentException("Unexpected bullet value: " + type);
	}

	// Show
	@Override 
	public void show()
	{
		String marginOutput = new String("");
		String paddingOutput = new String("");
		String indentOutput = new String("");
		for (int i = 0; i < this.getMargin(); i++)
		{
			marginOutput = marginOutput + " ";
		}
		for (int i = 0; i < this.getPadding(); i++)
		{
			paddingOutput = paddingOutput + " ";
		}
		for (int i = 0; i < this.getIndent(); i++)
		{
			indentOutput = indentOutput + " ";
		}
		System.out.printf("%s%s\n", marginOutput, this.getTitle());
		for (T it : this.getItemList())
		{
			System.out.printf("%s%s%c%s%s\n", marginOutput, indentOutput, this.bullet, paddingOutput, it.toString());
		}
		System.out.print("\n");
	}


}
