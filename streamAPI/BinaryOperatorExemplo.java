package streamAPI;

import java.util.Arrays;
import java.util.List;

public class BinaryOperatorExemplo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        // BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        // int resultado = numeros.stream().reduce(0, somar);

        // int resultado = numeros.stream().reduce(0, new BinaryOperator<Integer>() {
        // @Override
        // public Integer apply(Integer t, Integer u) {
        // return t + u;
        // }
        // });

        int resultado = numeros.stream().reduce(0, (n1, n2) -> n1 + n2);

        System.out.println(" " + resultado);
    }
}
