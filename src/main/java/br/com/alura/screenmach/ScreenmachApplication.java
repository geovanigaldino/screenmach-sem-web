package br.com.alura.screenmach;

import br.com.alura.screenmach.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Define que esta é a classe principal de uma aplicação Spring Boot
@SpringBootApplication
public class ScreenmachApplication implements CommandLineRunner {

	// Metodo principal que inicia a aplicação Spring Boot
	public static void main(String[] args) {
		SpringApplication.run(ScreenmachApplication.class, args);
	}

	// Metodo executado quando a aplicação inicia (interface CommandLineRunner)
	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}