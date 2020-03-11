package beans;

public class Comment {
	
	private int id;
	
	private String text;

	public Comment() {
		this.id = 0;
		this.text = "";
	}

	public int getId() {
		return id;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	

}
