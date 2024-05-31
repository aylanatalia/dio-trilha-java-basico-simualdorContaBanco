import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e implementar a classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário
        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite o numéro da agência");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da sua conta");
        int conta = scanner.nextInt();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();


        //obter pela scanner os valores digitados no terminal

        //exibir mensagem conta criada

        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");


    }
    
}