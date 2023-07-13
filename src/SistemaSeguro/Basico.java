package SistemaSeguro;

import unlam.pb2.UserNotFound;

public class Basico extends Usuario{
	public Boolean block=false;
	
	public Basico(String userid, String pass) {
		super(userid, pass);
	}
	
	public void bloquear() {
		block=true;
	}
	
	public void validar(String user, String password) throws Exception{
		if(password!=this.pass&&user!=this.userid&&tries<=3) {
			this.tries++;
			throw new UserNotFound("Wrong Password");
		}else if(tries>3) {
				bloquear();
		}
	}
	
	
	

}
