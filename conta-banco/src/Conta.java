
public class Conta {
	String nomeCliente;
	String agencia;
	int numero;
	double saldo;
	
	public Conta(String nomeCliente, String agencia, int numero, double saldo) {
		this.nomeCliente = nomeCliente;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void imprimirDados() {
		System.out.print("Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia + ", conta " + this.numero + " e seu saldo " + this.saldo + " já está disponível para saque.");
	}
}
