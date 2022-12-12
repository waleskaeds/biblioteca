import java.util.ArrayList;

public class Editora {

    private static ArrayList<Editora> editoras = new ArrayList<>();

    private long cnpj;
    private String nome;


    public static ArrayList<Editora> getEditoras() {
        return editoras;
    }

    public static void setEditoras(ArrayList<Editora> editoras) {
        Editora.editoras = editoras;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
