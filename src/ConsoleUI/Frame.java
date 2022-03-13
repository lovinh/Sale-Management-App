package ConsoleUI;

public class Frame{
	private int margin;
	
	public Frame() {
		this.margin = 0;
	}

	public Frame(int margin) {
		if (margin < 0)
			throw new IllegalArgumentException("Invalid margin values: " + margin);
		this.margin = margin;
	}

	public int getMargin() {
		return margin;
	}

	public void setMargin(int margin) {
		if (margin < 0)
			throw new IllegalArgumentException("Invalid margin values: " + margin);
		this.margin = margin;
	}

	
}
