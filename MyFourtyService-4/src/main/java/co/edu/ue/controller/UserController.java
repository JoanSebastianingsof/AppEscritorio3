package co.edu.ue.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.edu.ue.model.User;

@RestController
public class UserController {
    
	@Autowired
	RestTemplate template;
	
	String baseUrl="http://localhost:8080/";
    private final Logger logger = LoggerFactory.getLogger(UserController.class);

	
	@GetMapping(value="users", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> listUsers(){
		User[] user = template.getForObject(baseUrl+"usuarios", User[].class);
		return Arrays.asList(user);
	}
	
	@GetMapping(value="crear/{usuUser}/{usePassword}", produces = MediaType.APPLICATION_JSON_VALUE)	
	public List<User> createUser(@PathVariable("usuUser") String usuario,@PathVariable("usePassword") String contraseña){
		User user = new User();
		user.setUsuUser(usuario);
		user.setUsePassword(contraseña);
		template.postForLocation(baseUrl+"usuario", user);
		User[] users = template.getForObject(baseUrl+"usuario",	User[].class );
		return Arrays.asList(users);
	}
	@GetMapping(value="usuario/{usuUser}",produces=MediaType.APPLICATION_JSON_VALUE)
	public  User nombreUsu(@PathVariable("usuUser") String nam){

		  ResponseEntity<User> responseEntity = template.getForEntity(baseUrl + "usua/" + nam, User.class);
		    return responseEntity.getBody();
	}
	
	@GetMapping(value="usuaid/{usuId}",produces=MediaType.APPLICATION_JSON_VALUE)
	public User idUser(@PathVariable("usuId") int id) {
		
		  ResponseEntity<User> responseEntity = template.getForEntity(baseUrl + "usu/" + id, User.class);
		    return responseEntity.getBody();
	}
	/*@GetMapping(value="usuario/{usuId}",produces=MediaType.APPLICATION_JSON_VALUE)
	public User get(@PathVariable("usuId") int id) {
        // Usar restTemplate para realizar la solicitud al microservicio original
        return template.getForObject(baseUrl + "usu/" + id, User.class);
    }

    @GetMapping(value = "usua/{usuUser}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User searchUserByName(@PathVariable("usuUser") String name) {
        // Usar restTemplate para realizar la solicitud al microservicio original
        return template.getForObject(baseUrl + "usu/" + name, User.class);
    }*/
}
