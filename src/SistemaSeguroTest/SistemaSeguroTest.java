package SistemaSeguroTest;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import SistemaSeguro.Admin;
import SistemaSeguro.Basico;
import SistemaSeguro.GestionDeUsuarios;
import SistemaSeguro.Usuario;
import unlam.pb2.UserNotFound;

public class SistemaSeguroTest {

	@Test
	public void queAlLoguearUsuarioInexistenteLanceExcepcion() throws Exception{
		
		String user="juannm";
		String pass="11";
		
		Usuario juan2 = new Basico(user,pass);
		
		assertThrows(UserNotFound.class, () ->{GestionDeUsuarios.login(juan2);});
	}
	
	@Test
	public void queNoSePuedaEliminarUnAdmin() throws Exception {
		Usuario juancito = new Admin("juan","159");
		GestionDeUsuarios.agregarUsuarios(juancito);
		assertThrows(ClassCastException.class,() ->{GestionDeUsuarios.delete(juancito);});
		
	}

}
