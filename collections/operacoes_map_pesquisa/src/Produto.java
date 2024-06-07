public class Produto {
    private String nome;
    private int quantidade;
    private double preco;
    private long cod;

    public Produto(String nome, int quantidade, double preco, long cod) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public long getCod() {
        return cod;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return cod + " " + nome.toString() + " " + quantidade + " " + preco;
    }
}
