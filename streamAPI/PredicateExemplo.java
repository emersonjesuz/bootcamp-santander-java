package streamAPI;

import java.util.Arrays;
import java.util.List;

public class PredicateExemplo {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "KOTLIN", "python", "javascript", "c", "go", "ruby");

        // Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);

        // palavras.stream().filter(new Predicate<String>() {

        // @Override
        // public boolean test(String t) {
        // // TODO Auto-generated method stub
        // return t.length() > 5;
        // }

        // }).forEach(System.out::println);

        palavras.stream().filter(palavra -> palavra.length() > 5).forEach(System.out::printf);
    }
}
