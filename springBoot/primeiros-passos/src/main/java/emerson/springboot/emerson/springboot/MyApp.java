package emerson.springboot.emerson.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // para dizer que é um componente
public class MyApp implements CommandLineRunner {
    @Autowired // para injetar um componente
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception { // para dizer que é um mecanismo de inicialização
        System.out.println("o resultado é " + calculadora.somar(10, 20));
    }
}

// componentes não deve ser instanciados com new