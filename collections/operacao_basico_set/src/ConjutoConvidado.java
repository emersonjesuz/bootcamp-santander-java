import java.util.HashSet;
import java.util.Set;

public class ConjutoConvidado {
    Set<Convidado> listConvidados = new HashSet<>();

    public void adicionarConvidado(String nome, int codigoConvite) {
        listConvidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoRemover = null;
        for (Convidado convidado : listConvidados) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                convidadoRemover = convidado;
            }
        }
        listConvidados.remove(convidadoRemover);
    }

    public int contarConvidado() {
        return listConvidados.size();
    }

    public void exibirConvidados() {
        System.out.println(listConvidados);

    }
}
