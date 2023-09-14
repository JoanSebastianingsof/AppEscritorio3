package co.edu.ue.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.model.Usuario;

@Repository
public class UsuarioDao implements UsuarioDaoI {
	
	@Autowired
	UsuarioJpaI myUser;
	
	@Override
	public Usuario addUsuario(Usuario us) {
		// TODO Auto-generated method stub
		return myUser.save(us);
	}

	@Override
	public Usuario updateUsuario(Usuario us) {
		// TODO Auto-generated method stub
		return myUser.save(us);
	}

	@Override
	public Usuario getUsario(int idUs) {
		// TODO Auto-generated method stub
		return myUser.findById(idUs).orElse(null);
	}

	@Override
	public List<Usuario> getAllUsuarios() {
		// TODO Auto-generated method stub
		return myUser.findAll();
	}

	@Override
	public Usuario getUser(String nameUser) {
		// TODO Auto-generated method stub
		return myUser.findByUsuUser(nameUser);
	}
	
}
