package Hoony.poketmonTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PokemonTestApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PokemonTestApplication.class, args);
	}



	// war 배포용
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(ServletInitializer.class);
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(ServletInitializer.class, args);
//	}

}
