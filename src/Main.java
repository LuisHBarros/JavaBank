import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao JavaBank!");
        System.out.println("Para criar um conta, entre com o número da agência: ");
        String agencia = scanner.nextLine();
        System.out.println("Agora, entre com o número da conta: ");
        Integer conta = scanner.nextInt();
        System.out.println("Qual o nome do titular?");
        String nome = scanner.next();
        System.out.println("Conta criada! Deseja fazer um deposito de quanto?");
        BigDecimal saldo = BigDecimal.valueOf(scanner.nextDouble());
        System.out.println("\"Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$" + saldo + " já está disponível para saque");

    }
}


//"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco,
// sua agência é [Agencia], conta [Numero] e seu saldo [Saldo]
// já está disponível para saque".