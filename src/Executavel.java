import java.util.ArrayList;
import java.util.Scanner;

public class Executavel {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Cliente cliente = new Cliente(123, 123, 12, "waleska");
        Funcionario funcionario = new Funcionario(147,147,21, "cargooo", 123, "eduarda");

        Usuario.listaDeUsuarios.add(cliente);
        Usuario.listaDeUsuarios.add(funcionario);

        Usuario usuario = Usuario.validaLogin();
        System.out.println(usuario.menu());

    }

}
