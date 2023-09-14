package co.edu.ue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@ComponentScan(basePackages = {"co.edu.ue.controller"})
@SpringBootApplication
public class MyFourtyService4Application {

	public static void main(String[] args) {
		System.getProperties().put("server.port", 8090);
		SpringApplication.run(MyFourtyService4Application.class, args);
	}
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}

}
