package streamAPI;

import java.util.List;
import java.util.stream.Stream;

public class SupplierExemplo {
    public static void main(String[] args) {
        // criar uma saudacao
        // Supplier<String> saudacao = () -> "ola mundo";

        // criar uma lista de saudações!
        // List<String> listarSaudacao = Stream.generate(saudacao).limit(5).toList();

        List<String> listarSaudacao = Stream.generate(() -> "ola mundo").limit(5).toList();

        // 1--- listarSaudacao.forEach(s -> System.out.println(s));

        listarSaudacao.forEach(System.out::println); // references!
    }
}
