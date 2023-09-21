package co.edu.ue.service;

import java.util.List;

import co.edu.ue.model.Usuario;

public interface usuarioServiceI {
	boolean insertUser(Usuario usuario);
	boolean updatetUser(Usuario usuario);
	Usuario searchUserEmail(String correoUser);
	List<Usuario>GetUsers();
	Usuario searchUserId(int id);

}
