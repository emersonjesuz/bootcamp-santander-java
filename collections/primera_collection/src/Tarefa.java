package collections.primera_collection.src;

public class Tarefa {

    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String toString() {
        return descricao; // o metodo to string faz o sistema intender que quero a descricao e nao o
                          // caminho onde estar alocado!

    }
}
