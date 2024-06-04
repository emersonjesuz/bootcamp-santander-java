public class App {
    public static void main(String[] args) throws Exception {
        AgendaContato agendaContato = new AgendaContato();
        System.out.println("-------    ");
        agendaContato.adicionarContato("flavio1", 123456);
        agendaContato.adicionarContato("flavio1", 123456);
        agendaContato.adicionarContato("flavio3", 123456);
        agendaContato.adicionarContato("flavio4", 123456);
        agendaContato.adicionarContato("flavio5", 123456);
        agendaContato.exibirContatos();
        System.out.println("-------    ");
        agendaContato.pesquisarPorName("flavio2");
        System.out.println("-------    ");
        agendaContato.atualizarContato("flavio1", 98765);

    }
}
