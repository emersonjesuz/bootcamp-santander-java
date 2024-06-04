import java.util.Objects;

public class Contato {
    private String name;
    private int telefone;

    public Contato(String name, int telefone) {
        this.name = name;
        this.telefone = telefone;
    }

    public String getName() {
        return name;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Contato contato))
            return false;
        return Objects.equals(getName(), contato.getName());

    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {

        return name.toString() + " " + telefone;
    }
}
