package SistemaSeguro;

public class Admin extends Usuario{
	
	public final Boolean eliminable=false;
	
	public Admin(String userid, String pass) {
		super(userid, pass);	
	}

	public Boolean getEliminable() {
		return eliminable;
	}
	
	
	
	

}
