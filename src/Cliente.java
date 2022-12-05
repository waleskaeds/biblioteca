import java.util.ArrayList;

public class Cliente extends Usuario {
    private long cpf;
    private int idade;
    private ArrayList<Livro> livros = new ArrayList<>();

    @Override
    public String menu() {
        return """
                1 - Ver livros
                2 - Ver livros emprestados
                3 - Emprestar livro
                """;
    }

    public ArrayList<Livro> verLivrosEmprestados(){
        return new ArrayList<>();
    }
}
