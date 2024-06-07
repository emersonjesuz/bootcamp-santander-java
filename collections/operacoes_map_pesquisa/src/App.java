public class App {
    public static void main(String[] args) throws Exception {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(1, "sal", 1, 15);
        estoqueProdutos.adicionarProduto(11, "sal1", 1, 120);
        estoqueProdutos.adicionarProduto(111, "sal2", 1, 140);
        estoqueProdutos.adicionarProduto(1111, "sal3", 1, 110);
        estoqueProdutos.adicionarProduto(11111, "sal4", 2, 100);
        estoqueProdutos.adicionarProduto(11111, "sal45", 1, 1);
        estoqueProdutos.adicionarProduto(1222, "sal5", 1, 12);
        estoqueProdutos.adicionarProduto(122, "sal6", 1, 104);
        estoqueProdutos.adicionarProduto(12, "sal7", 1, 19);
        estoqueProdutos.adicionarProduto(13, "sal8", 1, 10);

        estoqueProdutos.exibirProdutos();

        System.out.println("produto mais barato " + estoqueProdutos.exibirProdutoMaisBarato());
        System.out.println("produto mais caro " + estoqueProdutos.exibirProdutoMaisCaro());
    }
}
