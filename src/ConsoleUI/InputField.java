package ConsoleUI;

import java.util.Scanner;
import java.util.zip.DataFormatException;

public class InputField extends Frame implements ConsoleUI{
	
	private Scanner scanner;
	private String streamInput;
	private String labelField;
	private boolean nextLine;
	
	public InputField() {
		// TODO Auto-generated constructor stub
		super();
		this.scanner = new Scanner(System.in);
		this.streamInput = "";
		this.labelField = "Input: ";
		this.nextLine = false;
	}
	public InputField(String labelField, boolean nextLine)
	{
		super();
		scanner = new Scanner(System.in);
		this.streamInput = "";
		this.labelField = labelField;
		this.nextLine = nextLine;
	}
	
	public InputField(String labelField, boolean nextLine, int margin) {
		super(margin);
		// TODO Auto-generated constructor stub
		scanner = new Scanner(System.in);
		this.streamInput = "";
		this.labelField = labelField;
		this.nextLine = nextLine;
	}
	
	public String getStringInput()
	{
		return this.streamInput;
	}
	
	public int getIntInput()
	{
		try {			
			int return_value = Integer.parseInt(this.streamInput);
			return return_value;
		}
		catch(NumberFormatException ex){
			throw new NumberFormatException("Cannot convert " + this.streamInput + " to int.");
		}
	}
	public long getLongInput()
	{
		try {			
			long return_value = Long.parseLong(this.streamInput);
			return return_value;
		}
		catch(NumberFormatException ex){
			throw new NumberFormatException("Cannot convert " + this.streamInput + " to long.");
		}
	}
	public double getDoubleInput()
	{
		try {
			double return_value = Double.parseDouble(this.streamInput);
			return return_value;
		} catch (NullPointerException | NumberFormatException ex)
		{
			if (ex instanceof NullPointerException)
				throw new NullPointerException("stream input is null.");
			else
				throw new NumberFormatException("Cannot convert " + this.streamInput + " to double");
		}
	}
	
	public float getFloatInput()
	{
		try {
			float return_value = Float.parseFloat(this.streamInput);
			return return_value;
		} catch (NullPointerException | NumberFormatException ex)
		{
			if (ex instanceof NullPointerException)
				throw new NullPointerException("stream input is null.");
			else
				throw new NumberFormatException("Cannot convert " + this.streamInput + " to float");
		}
	}
	
	public boolean getBooleanInput() throws DataFormatException
	{
		boolean return_value = true;
		String lwStreamInput = new String(this.streamInput.toLowerCase());
		if (lwStreamInput == "true" || lwStreamInput == "yes" || Integer.parseInt(lwStreamInput) > 0)
			return_value = true;
		else if (lwStreamInput == "false" || lwStreamInput == "no" || Integer.parseInt(lwStreamInput) == 0)
			return_value = false;
		else
			throw new DataFormatException("Cannot convert " + this.streamInput + " to boolean");
		return return_value;
	}
	
	public void setLabelField(String labelField)
	{
		this.labelField = labelField;
	}
	public void setNextLine(boolean nextLine)
	{
		this.nextLine = nextLine;
	}
	
	@Override
	public void show()
	{
		System.out.printf("%" + (this.labelField.length() + this.getMargin()) + "s" + ": " , this.labelField);
		if (this.nextLine)
			System.out.print("\n");
		this.streamInput = this.scanner.nextLine();
	}

}
