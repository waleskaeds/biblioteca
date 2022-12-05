import java.util.ArrayList;
import java.util.Date;

public class Emprestimo {

    private static ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    private int numero;
    private Cliente cliente;
    private Livro livro;
    private Date retirada;
    private Date devolucao;
    private static int qtd; // Serve como base para gerar o número do empréstimo automaticamente
}
