
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		cc.limite = 100;
		cc.depositar(600);
		cc.transferir(600, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}