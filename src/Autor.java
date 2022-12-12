public class Autor extends Pessoa {
    private String nome;

    public Autor(String nome) {
        super(nome);
    }

    public String menu(){
        return ("1 - Ver livros \n" +
                "2 - Ver livros emprestado \n" +
                "3 - Emprestar livro \n");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
