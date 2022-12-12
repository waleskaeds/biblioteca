import java.util.ArrayList;
import java.util.Date;

public class Livro {

    private static ArrayList<Livro> livros = new ArrayList<>();

    private int isbn;
    private String titulo;
    private Autor autor; // Composição
    private Categoria categoria; // Composição
    private String editora;
    private int qtdPag;
    private Date publicacao;
    private Colecao colecao; // Agregação



    public static ArrayList<Livro> getLivros() {
        return livros;
    }

    public static void setLivros(ArrayList<Livro> livros) {
        Livro.livros = livros;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }

    public Date getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(Date publicacao) {
        this.publicacao = publicacao;
    }

    public Colecao getColecao() {
        return colecao;
    }

    public void setColecao(Colecao colecao) {
        this.colecao = colecao;
    }
}
