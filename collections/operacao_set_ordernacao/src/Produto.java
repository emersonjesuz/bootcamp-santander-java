import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private String nome;
    private int cod;
    private Double preco;
    private int quantidade;

    public Produto(String nome, int cod, Double preco, int quantidade) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getCod() {
        return cod;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Produto produto))
            return false;
        return getCod() == produto.getCod();

    }

    @Override
    public int hashCode() {
        return Objects.hash(cod);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "cod: " + cod + " nome: " + nome.toString() + " , preço: " + preco + ", quantidade: " + quantidade;
    }

    @Override
    public int compareTo(Produto o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

}

class ComparatorPorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {

        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}