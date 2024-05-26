package collections.primera_collection.src;

public class App {

    public static void main(String[] args) throws Exception {
        ListarTarefas listarTarefas = new ListarTarefas();

        listarTarefas.adicionarItem("comprar cebola!");
        listarTarefas.obterDescricaoDeTarefas();
    }

}
