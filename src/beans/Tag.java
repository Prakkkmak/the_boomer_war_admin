package beans;

public class Tag {
	
	private int id;
	private String name;
	
	public Tag() {
		super();
		this.id = 0;
		this.name = "";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
