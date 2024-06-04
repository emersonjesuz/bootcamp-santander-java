import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> listaProdutos = new HashSet<>();

    public void adicionarProdutos(String nome, int cod, int quantidade, Double preco) {
        listaProdutos.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorName() {
        Set<Produto> produtosPorNome = new TreeSet<>(listaProdutos);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(listaProdutos);
        return produtosPorPreco;
    }
}
