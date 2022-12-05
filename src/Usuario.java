import java.util.ArrayList;

public abstract class Usuario extends Pessoa {

    private String senha;

    public abstract String menu();

    public ArrayList<Livro> verLivros(){
        return new ArrayList<>();
    }

    public abstract ArrayList<Livro> verLivrosEmprestados();

    public String emprestarLivro(){
        return "Livro emprestado com sucesso!";
    }

    public static Usuario validaLogin(long cpf, String senha){
        return new Funcionario();
    }

}
