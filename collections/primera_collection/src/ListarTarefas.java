package collections.primera_collection.src;

import java.util.ArrayList;
import java.util.List;

// para fazer um construtor basta colocar o mesmo nome da class
public class ListarTarefas {
    private List<Tarefa> listaDeTarefas; // cria uma lista de Tarefa, curioso que ela coloca uma class dentro da list

    public ListarTarefas() {
        this.listaDeTarefas = new ArrayList<>();
    }

    public static void main(String[] args) {
        ListarTarefas listarTarefas = new ListarTarefas();

        System.out.println(" Numero total: " + listarTarefas.obterNumeroTotalDeTarefa());
        listarTarefas.adicionarItem("fazer o teste!");
        System.out.println(" Numero total: " + listarTarefas.obterNumeroTotalDeTarefa());
        System.out.println("Todas as Tarefas! => ");
        listarTarefas.obterDescricaoDeTarefas();
    }

    public void adicionarItem(String descricao) {
        listaDeTarefas.add(new Tarefa(descricao)); // adicionei uma tarefa usando a class tarefa passando a descricao
                                                   // pelo contrutor!

    }

    public void removeItem(String descricao) {
        // criei uma lista nova para conter todas tarefas que vao ser removidas,
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa t : listaDeTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                // fiz uma condicao para verificar se sao iguais idependente se maiuscula ou
                // minusscula
                tarefasParaRemover.add(t);
            }
        }

        listaDeTarefas.removeAll(tarefasParaRemover); // removi todas tarefas encontradas

    }

    public int obterNumeroTotalDeTarefa() {
        return listaDeTarefas.size();
    }

    public void obterDescricaoDeTarefas() {
        System.out.println(listaDeTarefas);
    }

}