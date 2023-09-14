package co.edu.ue.service;

import java.util.List;

import co.edu.ue.model.Usuario;

public interface UsuarioServiceI {
	boolean insertUser(Usuario usuario);
	boolean updateUser(Usuario usuario);
	Usuario searchUserId(int id);
	Usuario searchUserUse(String nameUser);
	List<Usuario>getUsers();
    
}
