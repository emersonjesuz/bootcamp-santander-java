public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.codigoConvite = codigoConvite;
        this.nome = nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Convidado convidado))
            return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public String toString() {

        return nome.toString() + " " + codigoConvite;
    }
}
