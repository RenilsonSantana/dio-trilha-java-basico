import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Por favor, digite o seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite o número da sua agência: ");
		String agencia = scanner.nextLine();
		
		System.out.print("Digite o número da sua conta: ");
		int numero = scanner.nextInt();
		
		System.out.print("Digite o seu saldo: ");
		double saldo = scanner.nextDouble();
		
		Conta conta = new Conta(nome, agencia, numero, saldo);
		conta.imprimirDados();
	}
}
