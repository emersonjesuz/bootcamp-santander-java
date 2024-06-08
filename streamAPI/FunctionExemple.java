package streamAPI;

import java.util.Arrays;
import java.util.List;

public class FunctionExemple {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Function<Integer, Integer> dobrar = numero -> numero * 2;
        // List<Integer> numerosDobrados = numeros.stream().map(dobrar).toList();

        // Stream<Integer> numerosDobrados = numeros.stream().map(new Function<Integer,
        // Integer>() {

        // @Override
        // public Integer apply(Integer t) {
        // return t * 2;
        // }

        // });

        List<Integer> numerosDobrados = numeros.stream().map(f -> f * 2).toList();

        numerosDobrados.forEach(System.out::println);
    }
}
