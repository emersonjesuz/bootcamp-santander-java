import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    Set<Contato> listContato = new HashSet<>();

    public void adicionarContato(String name, int telefone) {
        listContato.add(new Contato(name, telefone));
    }

    public void exibirContatos() {
        System.out.println(listContato);
    }

    public void pesquisarPorName(String name) {
        Set<Contato> listaContatosPorName = new HashSet<>();
        for (Contato list : listContato) {
            if (list.getName().indexOf(name) != -1) {
                listaContatosPorName.add(list);
            }
        }
        System.out.println(listaContatosPorName);
    }

    public void atualizarContato(String name, int telefone) {

        listContato.forEach(contato -> {
            if (contato.getName().equalsIgnoreCase(name)) {
                contato.setTelefone(telefone);

                return;
            }
        });

        System.out.println(listContato);
    }
}
