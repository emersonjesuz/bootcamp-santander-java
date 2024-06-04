public class App {
    public static void main(String[] args) throws Exception {
        ConjutoConvidado conjutoConvidado = new ConjutoConvidado();
        conjutoConvidado.adicionarConvidado("pedro", 1);
        conjutoConvidado.adicionarConvidado("allan", 1);
        System.out.println("size : " + conjutoConvidado.contarConvidado());
        conjutoConvidado.removerConvidadoPorCodigoConvite(1);
        conjutoConvidado.exibirConvidados();
    }
}
