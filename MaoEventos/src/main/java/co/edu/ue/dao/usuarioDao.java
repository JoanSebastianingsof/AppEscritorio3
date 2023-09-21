package co.edu.ue.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.model.Usuario;

@Repository
public class usuarioDao implements usuarioDaoI{

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
	public Usuario getUsuario(int idUs) {
		// TODO Auto-generated method stub
		return myUser.findById(idUs).orElse(null);
	}

	@Override
	public List<Usuario> getAllUsuarios() {
		// TODO Auto-generated method stub
		return myUser.findAll();
	}

	@Override
	public Usuario GetCorreo(String correoUser) {
		// TODO Auto-generated method stub
		return myUser.findByUsuCorreo(correoUser);
	}

	



}
