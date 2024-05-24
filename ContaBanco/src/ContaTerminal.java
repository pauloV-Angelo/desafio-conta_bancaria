import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor comece digitando o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Ótimo, agora digite o número da conta bancária: ");
        int numero = sc.nextInt();
        // linha adicionada para consumir o buffer do scanner
        sc.nextLine();
        System.out.println("Agora por favor digite o número da agência com o dígito: ");
        String agencia = sc.nextLine();
        System.out.println("Qual o saldo da conta? ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        sc.close();
    }
}
