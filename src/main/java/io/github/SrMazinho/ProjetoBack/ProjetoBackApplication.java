package io.github.SrMazinho.ProjetoBack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjetoBackApplication {


	@Autowired
	@Qualifier("aplicationname")
	private String aplicationname;
	@GetMapping ("/hello")
	public String helloWorld(){

		return aplicationname;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjetoBackApplication.class, args);
	}

}
