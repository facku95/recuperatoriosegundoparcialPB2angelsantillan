package SistemaSeguro;

import java.util.Objects;

import unlam.pb2.UserNotFound;

public class Usuario implements Comparable<Usuario>{
	protected String userid;
	protected String pass;
	protected Boolean eliminable=true;
	protected Integer tries=0;
	
	public Usuario(String userid, String pass) {
		this.userid = userid;
		this.pass = pass;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Integer getTries() {
		return tries;
	}

	public void setTries(Integer tries) {
		this.tries = tries;
	}
	
	

/*
	@Override
	public int hashCode() {
		return Objects.hash(userid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(userid, other.userid);
	}
*/
	@Override
	public int compareTo(Usuario o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

	
	

}
