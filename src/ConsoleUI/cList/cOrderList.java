package ConsoleUI.cList;
import java.util.List;

import ConsoleUI.ConsoleUI;

public class cOrderList<T> extends cList<T> implements ConsoleUI{
	private String markerType;
	private String markerAfter;

	// Constructor
	public cOrderList() {
		super();
		this.markerType = "num";
		this.markerAfter = "dot";
	}

	public cOrderList(boolean orderType) {
		super(orderType);
		this.markerType = "num";
		this.markerAfter = "dot";
	}

	public cOrderList(List<T> itemList, boolean orderType, int numberOfItem) {
		super(itemList, orderType, numberOfItem);
		this.markerType = "num";
		this.markerAfter = "dot";
	}

	public cOrderList(List<T> itemList, boolean orderType) {
		super(itemList, orderType);
		this.markerType = "num";
		this.markerAfter = "dot";
	}

	public cOrderList(List<T> itemList, int numberOfItem, boolean orderType, String title, int margin, int indent,
			int padding) {
		super(itemList, numberOfItem, orderType, title, margin, indent, padding);
		this.markerType = "num";
		this.markerAfter = "dot";
	}

	public cOrderList(List<T> itemList) {
		super(itemList);
		this.markerType = "num";
		this.markerAfter = "dot";
	}

	public cOrderList(T[] itemArray, boolean orderType, int numberOfItem) {
		super(itemArray, orderType, numberOfItem);
		this.markerType = "num";
		this.markerAfter = "dot";
	}

	public cOrderList(T[] itemArray, boolean orderType) {
		super(itemArray, orderType);
		this.markerType = "num";
		this.markerAfter = "dot";
	}

	public cOrderList(T[] itemArray) {
		super(itemArray);
		this.markerType = "num";
		this.markerAfter = "dot";
	}
	

	public cOrderList(List<T> itemList, String markerType, String markerAfter) {
		super(itemList);
		this.markerType = markerType;
		this.markerAfter = markerAfter;
	}

	// Setting
	public void setMarkerType(String markerType)
	{
		String[] listMarker = {"num", "al-lw", "al-up"};
		boolean containing = false;
		for (String mk : listMarker)
		{
			if (mk == markerType)
			{
				containing = true;
				break;
			}
		}
		if (!containing)
		{
			throw new IllegalArgumentException("Invalid markerType.");
		} else if ((markerType == "al-lw" || markerType == "al-up") && this.getNumberOfItem() > 26)
		{
			throw new IllegalArgumentException("Cannot perform order list which its size is larger than 26 with alphabet markerType. "
					+ "Recommend numerical markerType.");
		} else
			this.markerType = markerType;
 	}
	public void setMarkerAfter(String markerAfter)
	{
		String[] listAfter = {"dot", "dash", "braket"};
		boolean containing = false;
		for (String af : listAfter)
		{
			if (af == markerAfter)
			{
				containing = true;
				break;
			}
		}
		if (!containing)
		{
			throw new IllegalArgumentException("Invalid markerAfterType.");
		}
		this.markerAfter = markerAfter; 
	}
	
	// Show
	@Override 
	public void show()
	{
		String marginOutput = new String("");
		String paddingOutput = new String("");
		String indentOutput = new String("");
		int markerNum = 1;
		char markerAlpha = 'a';
		char markerAfterOutput;
		String markerOutput = new String("");
		if (this.markerAfter == "dot")
		{
			markerAfterOutput = '.';
		} else if (this.markerAfter ==  "dash")
		{
			markerAfterOutput = '-';
		}
		else 
		{
			markerAfterOutput = ')';
		}
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
		if (this.markerType == "num")
		{
			for (T it : this.getItemList())
			{
				markerOutput = Integer.toString(markerNum);
				System.out.printf("%s%s%s%c%s%s\n", marginOutput, indentOutput, markerOutput, markerAfterOutput, paddingOutput, it.toString());
				markerNum++;
			}
		} else {
			if (this.markerType == "al-lw")
				markerAlpha = 'a';
			else
				markerAlpha = 'A';
			for (T it : this.getItemList())
			{
				markerOutput = Character.toString(markerAlpha);
				System.out.printf("%s%s%s%c%s%s\n", marginOutput, indentOutput, markerOutput, markerAfterOutput, paddingOutput, it.toString());
				markerAlpha++;
			}
		}
		System.out.print("\n");
	}
}
