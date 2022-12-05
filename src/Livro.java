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
}
