import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> listPessoas = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("nome 1", 14, 10);
        ordenacaoPessoa.adicionarPessoa("nome 2", 17, 16);
        ordenacaoPessoa.adicionarPessoa("nome 3", 11, 46);
        ordenacaoPessoa.adicionarPessoa("nome 4", 19, 6);
        ordenacaoPessoa.adicionarPessoa("nome 5", 12, 36);
        System.out.println(ordenacaoPessoa.ordernaPorIdade());
        System.out.println(ordenacaoPessoa.ondernarPorAltura());
    }

    public void adicionarPessoa(String nome, double altura, int idade) {
        listPessoas.add(new Pessoa(nome, altura, idade));
    }

    public List<Pessoa> ordernaPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ondernarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listPessoas);
        Collections.sort(pessoasPorAltura, new OrdenarPorAltura());
        return pessoasPorAltura;

    }
}
