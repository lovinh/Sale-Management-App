package ConsoleUI;

public class Line extends Frame implements ConsoleUI{
	private char typeLine;
	private int lengthLine;
	private String aLine;
	public Line() {
		super();
		this.typeLine = '-';
		this.lengthLine = 10;
		for (int i = 0; i < this.lengthLine; i++)
		{
			this.aLine += this.typeLine;
		}
	}
	public Line(char typeLine, int lengthLine, int margin) {
		super(margin);
		if (lengthLine <= 0)
			throw new IllegalArgumentException("length of line cannot be negative number. Unexpected value: " + lengthLine);
		this.typeLine = typeLine;
		this.lengthLine = lengthLine;
		for (int i = 0; i < this.lengthLine; i++)
		{
			this.aLine += this.typeLine;
		}
	}
	public Line(int lengthLine, int margin) {
		super(margin);
		if (lengthLine <= 0)
			throw new IllegalArgumentException("length of line cannot be negative number. Unexpected value: " + lengthLine);
		this.typeLine = '-';
		this.lengthLine = lengthLine;
		for (int i = 0; i < this.lengthLine; i++)
		{
			this.aLine += this.typeLine;
		}
	}
	
	private void updateLine()
	{
		// Change type line or length of the new line is smaller than old one --> Rebuild a line.
		if (this.aLine.charAt(0) != this.typeLine || this.lengthLine < this.aLine.length())
		{
			this.aLine = new String("");
			for (int i = 0; i < this.lengthLine; i++)
			{
				this.aLine += this.typeLine;
			}
		} else if (this.lengthLine > this.aLine.length())
		{
			for (int i = 0; i < (this.lengthLine - this.aLine.length()); i++)
			{
				this.aLine += this.typeLine;
			}
		} else
		{
			return;
		}
	}
	
	public void setTypeLine(char typeLine) {
		this.typeLine = typeLine;
		this.updateLine();
	}
	public void setLengthLine(int lengthLine) {
		if (lengthLine <= 0)
			throw new IllegalArgumentException("length of line cannot be negative number. Unexpected value: " + lengthLine);
		this.lengthLine = lengthLine;
		this.updateLine();
	}
	
	@Override
	public void show()
	{
		System.out.printf("%s\n", this.aLine);
	}
}
