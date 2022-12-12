import java.util.ArrayList;
import java.util.Scanner;

public abstract class Usuario extends Pessoa {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Usuario> listaDeUsuarios = new ArrayList<>();

    private int senha;
    private long cpf;
    private int idade;

    public Usuario(int senha, long cpf, int idade, String nome) {
        super(nome);
        this.senha = senha;
        this.cpf = cpf;
        this.idade = idade;
    }

    public static ArrayList<Usuario> getListaDeUsuarios() {
        return listaDeUsuarios;
    }

    public static void setListaDeUsuarios(ArrayList<Usuario> listaDeUsuarios) {
        Usuario.listaDeUsuarios = listaDeUsuarios;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public abstract String menu();

    public ArrayList<Livro> verLivros(){
        return new ArrayList<>();
    }

    public abstract ArrayList<Livro> verLivrosEmprestados();

    public String emprestarLivro(){
        return "Livro emprestado com sucesso!";
    }


    public static Usuario validaLogin(){
        System.out.println("CPF do usuário: ");
        long cpf = sc.nextLong();
        System.out.println("Senha: ");
        int senha = sc.nextInt();

        for(int i = 0; i < listaDeUsuarios.size(); i++){
            if(senha == listaDeUsuarios.get(i).getSenha() &&
               cpf == listaDeUsuarios.get(i).getCpf()){
                return listaDeUsuarios.get(i);
            }
        }
        return null;
    }

}
