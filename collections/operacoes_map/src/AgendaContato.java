import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    private Map<String, Integer> contatos;

    public AgendaContato() {
        this.contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, int telefone) {
        contatos.put(nome, telefone);
    }

    public void removerContato(String name) {
        if (!contatos.isEmpty()) {
            contatos.remove(name);
        }
    }

    public void exibirContatos() {
        System.out.println(contatos);
    }

    public Integer buscarContatoPorNome(String name) {
        int numero = contatos.get(name);
        return numero;

    }
}
