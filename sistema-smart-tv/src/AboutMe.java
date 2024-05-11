import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua Altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out
                .println(" sua altura :" + altura + " seu nome : " + nome + " " + sobrenome + " sua idade:  " + idade);
    }

    // o scaner faz com que o terminal aguarde sua resposta!
}
