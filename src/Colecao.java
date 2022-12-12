import java.util.ArrayList;

public class Colecao {

    private static ArrayList<Colecao> colecoes = new ArrayList<>();

    private String nome;
    private Autor autor;
    private ArrayList<Livro> livros = new ArrayList<>();

    public Colecao(String nome, Autor autor, ArrayList<Livro> livros) {
        this.nome = nome;
        this.autor = autor;
        this.livros = livros;
    }

    public static ArrayList<Colecao> getColecoes() {
        return colecoes;
    }

    public static void setColecoes(ArrayList<Colecao> colecoes) {
        Colecao.colecoes = colecoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }
}
