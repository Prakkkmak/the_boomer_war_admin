package beans;

public class Review {

	private int id;
	private int mark;
	
	private String text;
	
	
	
	public Review() {
		super();
		this.id = 0;
		this.mark = 0;
		this.text = "";
	}

	public int getId() {
		return id;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	

}
