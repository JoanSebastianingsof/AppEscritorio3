package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.UsuarioDaoI;
import co.edu.ue.model.Usuario;

@Service
public class UsuarioService implements UsuarioServiceI {

	@Autowired
	UsuarioDaoI dao;
	
	@Override
	public boolean insertUser(Usuario usuario) {
		if(dao.getUser(usuario.getUsuUser())==null) {
			dao.addUsuario(usuario);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateUser(Usuario usuario) {
		if(dao.getUsario(usuario.getUsuId())!=null) {
			dao.updateUsuario(usuario);
		}
		return false;
	}

	@Override
	public Usuario searchUserId(int id) {
		// TODO Auto-generated method stub
		return dao.getUsario(id);
	}

	@Override
	public Usuario searchUserUse(String nameUser) {
		// TODO Auto-generated method stub
		return dao.getUser(nameUser);
	}

	@Override
	public List<Usuario> getUsers() {
		// TODO Auto-generated method stub
		return dao.getAllUsuarios();
	}

	
}
