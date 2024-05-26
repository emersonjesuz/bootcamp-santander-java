
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("      ");
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("meu novo mundo", "tadeu", 2013);
        catalogoLivros.adicionarLivro("patricia dos desejos", "ruam", 2000);
        catalogoLivros.adicionarLivro("soldado de chumbo", "ana", 2020);
        catalogoLivros.pesquisarPorAutor("tade");
        catalogoLivros.pesquisarPorEntervaloAnos(2000, 2020);
        catalogoLivros.pesquisarPorTitulo("meu novo mundo");
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livros.add(0, new Livro(titulo, autor, anoPublicacao));
    }

    public void pesquisarPorAutor(String autor) {
        List<Livro> livrosDoAutor = new ArrayList<>();
        for (Livro livro : livros) {
            String nomeAutorNaListaEmMaiusculo = livro.getAutor().toUpperCase();
            String autorBuscaEmMaiusculo = autor.toUpperCase();
            if (nomeAutorNaListaEmMaiusculo.contains(autorBuscaEmMaiusculo)) {
                livrosDoAutor.add(livro);
            }
        }
        System.out.println(livrosDoAutor);
    }

    public void pesquisarPorEntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPeloAno = new ArrayList<>();

        for (int i = 0; i < livros.size(); i++) {
            int anoPublicacao = livros.get(i).getAnoPublicacao();
            if (anoPublicacao >= anoInicial && anoPublicacao <= anoFinal) {
                livrosPeloAno.add(livros.get(i));
            }
        }
        System.out.println(livrosPeloAno);
    }

    public void pesquisarPorTitulo(String titulo) {
        Livro livro = new Livro();
        for (Livro l : livros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                livro = l;
                break;
            }
        }
        System.out.println(livro.toString());
    }

}
