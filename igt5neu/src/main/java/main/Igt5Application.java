package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class Igt5Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Igt5Application.class);
		app.setBannerMode(Mode.OFF);
		app.run(args);
	}

	@Bean // Java Klasse mit getter/setter(private attribute), standard leerer
			// Konstruktor, implementiert Serializable. Wird dynamisch an der
			// richtigen Stelle im Code injiziert
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
