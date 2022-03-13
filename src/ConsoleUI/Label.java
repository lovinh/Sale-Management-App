package ConsoleUI;


public class Label extends Frame implements ConsoleUI{

	private String labelContent;
	private char transformType;
	private boolean nextLine;
	
	private void transform()
	{
		if (this.transformType == 'u')
			this.labelContent = this.labelContent.toUpperCase();
		else if (this.transformType == 'l')
			this.labelContent = this.labelContent.toLowerCase();
		else 
		{
			String tempText = new String("");
			char firstChar;
			for (String s : this.labelContent.split(" "))
			{
				firstChar = s.charAt(0);
				if (firstChar >= 97 && firstChar <= 122)
					firstChar -= 32;
				tempText = tempText + firstChar + s.substring(1, s.length()) + ' ';
				
			}
			this.labelContent = tempText.substring(0, tempText.length() - 1);
		}
	}
	public Label() {
		super();
		this.labelContent = "";
	}
	public Label(String labelContent) {
		super();
		this.labelContent = labelContent;
		this.transformType = 'n';
	}
	public Label(String labelContent, int margin, String transform, boolean nextLine) {
		super(margin);
		// TODO Auto-generated constructor stub
		this.labelContent = labelContent;
		if (transform == "up")
			this.transformType = 'u';
		else if (transform == "lw")
			this.transformType = 'l';
		else if (transform == "cp")
			this.transformType = 'c';
		else if (transform == "nm")
			this.transformType = 'n';
		else
			throw new IllegalArgumentException("Invalid transform type: " + transform);
		this.nextLine = nextLine;
	}
	public String getLabelContent() {
		return labelContent;
	}
	public void setLabelContent(String labelContent) {
		this.labelContent = labelContent;
	}
	
	public char getTransformType() {
		return transformType;
	}
	public void setTransformType(String transform) {
		if (transform == "up")
			this.transformType = 'u';
		else if (transform == "lw")
			this.transformType = 'l';
		else if (transform == "cp")
			this.transformType = 'c';
		else if (transform == "nm")
			this.transformType = 'n';
		else
			throw new IllegalArgumentException("Invalid transform type: " + transform);
	}
	
	public boolean isNextLine() {
		return nextLine;
	}
	public void setNextLine(boolean nextLine) {
		this.nextLine = nextLine;
	}
	
	@Override
	public void show()
	{
		this.transform();
		System.out.printf("%" + (this.getMargin() + this.labelContent.length()) + "s" , this.labelContent);
		if (this.nextLine)
			System.out.print("\n");
	}

}
