import java.util.ArrayList;

public abstract class Pessoa {
    private static ArrayList<Pessoa> pessoas = new ArrayList<>();
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public static ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public static void setPessoas(ArrayList<Pessoa> pessoas) {
        Pessoa.pessoas = pessoas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
