package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Consumer
 */
public class ConsumerExemplo {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        // 1 -----
        // Consumer<Integer> imprimirNumeroPar = numero -> {
        // if (numero % 2 == 0) {
        // System.out.println(numero);
        // }
        // };
        // numeros.stream().forEach(imprimirNumeroPar);

        // 2 -----
        // numeros.stream().forEach(new Consumer<Integer>() {
        // @Override
        // public void accept(Integer t) {
        // if (t % 2 == 0) {
        // System.out.println(t);
        // }
        // }
        // });

        numeros.stream().forEach((t) -> {
            if (t % 2 == 0) {
                System.out.println(t);
            }

        });
    }

}