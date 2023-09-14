package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.model.Usuario;
import co.edu.ue.service.UsuarioServiceI;


@RestController
public class UsuarioController {
	@Autowired
	UsuarioServiceI service;
	
	@PostMapping(value="usuario",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public String saveUser(@RequestBody Usuario usuario) {
		boolean response = service.insertUser(usuario);
				if(response) return "se ha insertado un usuario";
				return "Error al importar";
	}
	@GetMapping(value="usuarios",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Usuario> getAllUsers(){
		return service.getUsers();
	}
	
	@GetMapping(value="usua/{nameUser}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Usuario searchUserUse(@PathVariable("nameUser") String nam){
		return service.searchUserUse(nam);
	}
	
	@GetMapping(value="usu/{idUs}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Usuario searchUserUse(@PathVariable("idUs") int id){
		return service.searchUserId(id);
	}
	
	
}
