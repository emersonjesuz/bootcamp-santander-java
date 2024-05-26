public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private double altura;
    private int idade;

    public Pessoa(String nome, double altura, int idade) {
        this.altura = altura;
        this.idade = idade;
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Pessoa p) {
        if (p == null)
            return 1;
        int comparacao = 0;
        if (this.idade > p.idade)
            return 1;

        if (this.idade < p.idade)
            return -1;
        return comparacao;
    }

    @Override
    public String toString() {

        return nome + " " + idade + " " + altura;
    }
}
