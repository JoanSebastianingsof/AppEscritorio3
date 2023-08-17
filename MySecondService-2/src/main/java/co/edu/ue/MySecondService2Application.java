package co.edu.ue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"co.edu.ue.controller"})
public class MySecondService2Application {

	public static void main(String[] args) {
		SpringApplication.run(MySecondService2Application.class, args);
	}

}
