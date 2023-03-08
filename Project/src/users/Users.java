package users;

public class Users {
	private String name;
	private String dni;
	private String pass;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Users(String name, String dni, String pass) {
		super();
		this.name = name;
		this.dni = dni;
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "User = " + name + ", " + dni + ", " + pass;
	}
	
}
