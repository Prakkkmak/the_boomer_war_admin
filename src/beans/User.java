package beans;

public class User {

	private int id;
	private int access;
	
	private String name;
	private String mail;
	private String password;
	
	
	
	public User() {
		super();
		this.id = 0;
		this.access = 0;
		this.name = "";
		this.mail = "";
		this.password = "";
	}
	public int getId() {
		return id;
	}
	public int getAccess() {
		return access;
	}
	public void setAccess(int access) {
		this.access = access;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
