package co.edu.ue.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.model.Usuario;


public interface UsuarioJpaI extends JpaRepository<Usuario, Integer> {
	Usuario findByUsuCorreo(String usuCorreo);
} 
