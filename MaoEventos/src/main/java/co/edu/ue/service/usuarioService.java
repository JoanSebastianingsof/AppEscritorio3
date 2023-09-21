package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.usuarioDaoI;
import co.edu.ue.model.Usuario;

@Service
public class usuarioService implements usuarioServiceI {
	
	@Autowired
	usuarioDaoI dao;
	@Override
	public boolean insertUser(Usuario usuario) {
		if(dao.GetCorreo(usuario.getUsuCorreo())==null) {
			dao.addUsuario(usuario);
		}
		return true;
	}

	@Override
	public boolean updatetUser(Usuario usuario) {
		if(dao.getUsuario(usuario.getUsuId())==null) {
			dao.updateUsuario(usuario);
		}
		return true;
	}

	@Override
	public Usuario searchUserEmail(String correoUser) {
		// TODO Auto-generated method stub
		return dao.GetCorreo(correoUser);
	}

	@Override
	public List<Usuario> GetUsers() {
		// TODO Auto-generated method stub
		return dao.getAllUsuarios();
	}

	@Override
	public Usuario searchUserId(int id) {
		// TODO Auto-generated method stub
		return dao.getUsuario(id);
	}

	

}
