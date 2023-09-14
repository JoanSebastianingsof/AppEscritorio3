package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.model.Usuario;

public interface UsuarioDaoI {
	Usuario addUsuario(Usuario us);
	Usuario updateUsuario(Usuario us);
	//Usuario updateStatusUs(int idUs);//delete
	Usuario getUsario(int idUs);
	List<Usuario>getAllUsuarios();
	 Usuario  getUser(String nameUser);
	
}
