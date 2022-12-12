import java.awt.*;
import java.util.ArrayList;

public class Funcionario extends Usuario {
    private String cargo;
    private int matricula;

    public Funcionario(int senha, long cpf, int idade, String cargo, int matricula, String nome) {
        super(senha, cpf, idade, nome);
        this.cargo = cargo;
        this.matricula = matricula;
    }


    public String menu(){
        System.out.println("""
                1 - Ver livros
                2 - Ver livros emprestados
                3 - Emprestar livro
                4 - Cadastrar livro
                5 - Cadastrar autor
                6 - Cadastrar editora
                7 - Cadastrar coleção
                8 - Cadastrar cliente
                9 - Sair
                        """);
        int option = sc.nextInt();
        switch (option){
            case 1:
                System.out.println(Livro.getLivros());
                break;

            case 2:
                System.out.println(verLivrosEmprestados());
                break;

            case 3:
                break;

            case 4:
                cadastrarLivro();
                break;

            case 5:
                cadastrarAutor();
                break;

            case 6:
                cadastrarEditora();
                break;

            case 7:
                cadastrarColecao();
                break;

            case 8:
                cadastrarCliente();
                break;

            case 9:
                System.exit(0);

            default:
                System.out.println("opção inválida");
        }
        return null;
    }

    public ArrayList<Livro> verLivrosEmprestados(){
        return new ArrayList<>();
    }

    public String cadastrarLivro(){
        return "Livro cadastrado com sucesso!";
    }

    public String cadastrarAutor(){
        return "Autor cadastrado com sucesso!";
    }

    public String cadastrarEditora(){
        return "Editora cadastrada com sucesso!";
    }

    public String cadastrarColecao(){
        return "Coleção cadastrada com sucesso!";
    }

    public String cadastrarCliente(){
        System.out.println("Nome: ");
        String nome = sc.next();
        System.out.println("Idade: ");
        int idade = sc.nextInt();
        System.out.println("CPF: ");
        long cpf = sc.nextLong();
        System.out.println("Senha: ");
        int senha = sc.nextInt();
        listaDeUsuarios.add(new Cliente(senha, cpf, idade, nome));
        //System.out.println("teste");
        return "Cliente cadastrado com sucesso!";
    }

}
