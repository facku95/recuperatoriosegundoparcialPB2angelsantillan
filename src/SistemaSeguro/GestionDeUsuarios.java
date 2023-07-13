package SistemaSeguro;

import java.util.TreeSet;

import unlam.pb2.UserNotFound;

public class GestionDeUsuarios {
	
	public static TreeSet<Usuario> userRepository = new TreeSet<>();
	
	public static void agregarUsuarios(Usuario user) {
		userRepository.add(user);
	}
	
	public static Boolean login(Usuario usuarioAvalidar) throws Exception {
		if(userRepository.contains(usuarioAvalidar)==true) {
			return true;
		}else throw new UserNotFound("Wrong user");
		
	}
	
	public static Boolean delete(Usuario usuarioAeliminar) throws Exception {
		if(usuarioAeliminar.getClass()==Admin.class) {
			return true;
		}
		else {throw new ClassCastException();}
	}

}
