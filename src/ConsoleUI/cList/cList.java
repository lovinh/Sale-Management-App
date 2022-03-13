package ConsoleUI.cList;

import java.util.ArrayList;
import java.util.List;

public class cList<T>{
	private List<T> itemList;
	private int numberOfItem;
	private boolean orderType;
	private String title;
	private int margin;
	private int indent;
	private int padding;
	
	public cList() {
		super();
		this.itemList = new ArrayList<T>();
		this.orderType = false;
		this.numberOfItem = 0;
		this.title = null;
		this.margin = 0;
		this.padding = 1;
		this.indent = 5;
	}
	public cList(List<T> itemList, boolean orderType, int numberOfItem) {
		super();
		this.itemList = itemList;
		this.orderType = orderType;
		this.numberOfItem = numberOfItem;
		this.title = null;
		this.margin = 0;
		this.padding = 1;
		this.indent = 5;
	}
	public cList(List<T> itemList, boolean orderType) {
		super();
		this.itemList = itemList;
		this.orderType = orderType;
		this.numberOfItem = itemList.size();
		this.title = null;
		this.margin = 0;
		this.padding = 1;
		this.indent = 5;
	}
	public cList(List<T> itemList) {
		super();
		this.itemList = itemList;
		this.orderType = false;
		this.numberOfItem = itemList.size();
		this.title = null;
		this.margin = 0;
		this.padding = 1;
		this.indent = 5;
	}
	public cList(T[] itemArray, boolean orderType, int numberOfItem) {
		this.itemList = new ArrayList<T>();
		for (T it : itemArray)
		{
			this.itemList.add(it);
		}
		this.numberOfItem = numberOfItem;
		this.orderType = orderType;
		this.title = null;
		this.margin = 0;
		this.padding = 1;
		this.indent = 5;
	}
	public cList(T[] itemArray, boolean orderType) {
		this.itemList = new ArrayList<T>();
		for (T it : itemArray)
		{
			this.itemList.add(it);
			this.numberOfItem++;
		}
		this.orderType = orderType;
		this.title = null;
		this.margin = 0;
		this.padding = 1;
		this.indent = 5;
	}
	public cList(T[] itemArray) {
		this.itemList = new ArrayList<T>();
		for (T it : itemArray)
		{
			this.itemList.add(it);
			this.numberOfItem++;
		}
		this.orderType = false;
		this.title = null;
		this.margin = 0;
		this.padding = 1;
		this.indent = 5;
	}
	public cList(boolean orderType)
	{
		this.itemList = new ArrayList<T>();
		this.numberOfItem = 0;
		this.orderType = orderType;
		this.title = null;
		this.margin = 0;
		this.padding = 1;
		this.indent = 5;
	}
	
	public cList(List<T> itemList, int numberOfItem, boolean orderType, String title, int margin, int indent, int padding) {
		super();
		this.itemList = itemList;
		this.numberOfItem = numberOfItem;
		this.orderType = orderType;
		this.title = title;
		this.margin = margin;
		this.indent = indent;
		this.padding = padding;
	}
	public boolean isOrderType() {
		return orderType;
	}
	public void setOrderType(boolean orderType) {
		this.orderType = orderType;
	}
	public int getNumberOfItem() {
		return numberOfItem;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setMargin(int margin) {
		if (margin < 0)
			throw new IllegalArgumentException("Margin cannot be a negative value.");
		this.margin = margin;
	}
	public void setIndent(int indent) {
		if (indent < 0)
			throw new IllegalArgumentException("Indent cannot be a negative value.");
		this.indent = indent;
	}
	public void setPadding(int padding) {
		if (padding < 0)
			throw new IllegalArgumentException("Padding cannot be a negative value.");
		this.padding = padding;
	}
	public List<T> getItemList() {
		return itemList;
	}
	public void setItemList(List<T> itemList) {
		this.itemList = itemList;
	}
	public void setItemList(T[] itemArray)
	{
		this.itemList.clear();
		for (T it : itemArray)
		{
			this.itemList.add(it);
			this.numberOfItem++;
		}
	}
	public String getTitle() {
		return title;
	}
	public int getMargin() {
		return margin;
	}
	public int getIndent() {
		return indent;
	}
	public int getPadding() {
		return padding;
	}
	
}
