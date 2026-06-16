import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BancoAgenciaMain {
    public static void main(String[] args) {

        Scanner enviar = new Scanner(System.in);

        Banco banco = new Banco();

        System.out.print("Digite o número do banco: ");
        banco.setNumero(enviar.nextInt());
        enviar.nextLine(); // limpar buffer

        System.out.print("Digite o nome do banco: ");
        banco.setNome(enviar.nextLine());

        List<Agencia> agencias = new ArrayList<>();

        System.out.print("Quantas agências deseja cadastrar? ");
        int quantidade = enviar.nextInt();
        enviar.nextLine();

        for (int i = 0; i < quantidade; i++) {
            Agencia agencia = new Agencia();

            System.out.println("\nAgência " + (i + 1));

            System.out.print("Número da agência: ");
            agencia.setNumero(enviar.nextInt());
            enviar.nextLine();

            System.out.print("Nome da agência: ");
            agencia.setNome(enviar.nextLine());

            agencias.add(agencia);
        }
        banco.setAgencias(agencias);
        System.out.println("\n=== DADOS DO BANCO ===");
        System.out.println("Número do Banco: " + banco.getNumero());
        System.out.println("Nome do Banco: " + banco.getNome());
        System.out.println("\nAgências:");
        for (Agencia agencia : banco.getAgencias()) {
            System.out.println(
                "- Número: " + agencia.getNumero()
                + ", Nome: " + agencia.getNome()
            );
        }
        enviar.close();
    }
}
