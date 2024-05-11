public class MinhaClasses {
    public static void main(String[] args) {

        final String primeiroNome = "Josiemerson";
        final String segundoNome = "Teixeira";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat((" ")).concat(segundoNome);
    }
}
