package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.model.Usuario;

public interface usuarioDaoI {
	Usuario addUsuario (Usuario us);
	Usuario updateUsuario (Usuario us);
//	Usuario updateStatusUs (int idUs);
	Usuario getUsuario (int idUs);
	List<Usuario> getAllUsuarios();
	
	Usuario GetCorreo(String correoUser);
}
