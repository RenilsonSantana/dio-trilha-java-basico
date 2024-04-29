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
		
		imprimirDados(nome, agencia, numero, saldo);
	}
	
	public static void imprimirDados(String nome, String agencia, int numero, double saldo) {
		System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
	}
}
