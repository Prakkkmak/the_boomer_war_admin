package beans;

public class Article {
	
	private int id;
	private int visitorCount;
	
	private String name;
	private String text;
	private String img;
	
	
	public Article() {
		this.name = "";
		this.text = "";
		this.img = "";
		this.visitorCount = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getVisitorCount() {
		return visitorCount;
	}
	public void setVisitorCount(int visitorCount) {
		this.visitorCount = visitorCount;
	}
	public int getId() {
		return id;
	}
	
}
