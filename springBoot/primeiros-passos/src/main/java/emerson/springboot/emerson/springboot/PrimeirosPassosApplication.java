package emerson.springboot.emerson.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);

	}

	// @Bean
	// public CommandLineRunner run(Calculadora calculadora) {
	// return args -> calculadora.somar(10, 20); // new Calculadora();
	// }

}
