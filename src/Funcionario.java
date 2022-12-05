import java.util.ArrayList;

public class Funcionario extends Usuario {
    private String cargo;
    private long cpf;
    private int idade;
    private int matricula;

    public String menu(){
        return """
                1 - Ver livros
                2 - Ver livros emprestados
                3 - Emprestar livro
                4 - Cadastrar livro
                5 - Cadastrar autor
                6 - Cadastrar editora
                7 - Cadastrar coleção
                8 - Cadastrar cliente
                """;
    }

    public ArrayList<Livro> verLivrosEmprestados(){
        return new ArrayList<>();
    }

    public String cadastrarLivro(){ return "Livro cadastrado com sucesso!"; }

    public String cadastrarAutor(){ return "Autor cadastrado com sucesso!"; }

    public String cadastrarEditora(){
        return "Editora cadastrada com sucesso!";
    }

    public String cadastrarColecao(){
        return "Coleção cadastrada com sucesso!";
    }

    public String cadastrarCliente(){
        return "Cliente cadastrado com sucesso!";
    }

}
