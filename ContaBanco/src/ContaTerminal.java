import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número de Usuário: ");
        System.out.print("Usuário: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o número da Agência:");
        System.out.print("Agência: ");
        String agencia = sc.nextLine();
        System.out.print("Digite o seu nome: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Digite o saldo que você deseja sacar: ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque!", nomeCliente, agencia, numero, saldo);





   }
}
