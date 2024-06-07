import java.util.HashMap;
import java.util.Map;

/**
 * EstoqueProdutos
 */
public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco, cod));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public Integer calcularValorTotalEstoque() {
        int valorTotal = 0;
        for (Produto produto : estoqueProdutosMap.values()) {
            valorTotal += produto.getQuantidade() * produto.getPreco();
        }
        return valorTotal;
    }

    public Produto exibirProdutoMaisCaro() {
        Produto p = null;
        double produtoMaisCaro = Double.MIN_VALUE;
        for (Produto produto : estoqueProdutosMap.values()) {
            if (produto.getPreco() > produtoMaisCaro) {
                p = produto;
                produtoMaisCaro = produto.getPreco();
            }
        }
        return p;
    }

    public Produto exibirProdutoMaisBarato() {
        Produto produto = null;
        double produtoMaisBarato = Double.MAX_VALUE;

        for (Produto p : estoqueProdutosMap.values()) {
            if (p.getPreco() < produtoMaisBarato) {
                produtoMaisBarato = p.getPreco();
                produto = p;
            }
        }
        return produto;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produto = null;
        double maiorValorTotal = Double.MIN_VALUE;

        for (Produto p : estoqueProdutosMap.values()) {
            double valorTotal = p.getPreco() * p.getQuantidade();
            if (valorTotal > maiorValorTotal) {
                maiorValorTotal = valorTotal;
                produto = p;
            }
        }
        return produto;
    }
}