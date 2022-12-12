
import java.util.ArrayList;

public class Cliente extends Usuario {
    private ArrayList<Livro> livros = new ArrayList<>();

    public Cliente(int senha, long cpf, int idade, String nome) {
        super(senha, cpf, idade, nome);
    }


    @Override
    public String menu() {
        System.out.println("""
                1 - Ver livros
                2 - Ver livros emprestados
                3 - Emprestar livro
                """);
        int option = sc.nextInt();
        switch (option){
            case 1:
                System.out.println(Livro.getLivros());

            case 2:
                verLivrosEmprestados();

            case 3:

        }

        return null;
    }

    public ArrayList<Livro> verLivrosEmprestados(){
        return new ArrayList<>();
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

}
