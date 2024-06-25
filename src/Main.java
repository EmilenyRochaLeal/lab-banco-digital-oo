
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton, 1000);
		Conta poupanca = new ContaPoupanca(venilton);
		Cofrinho estudo = new Cofrinho(venilton, "estudo de poo", null, null);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		poupanca.transferir(10, estudo);

		
		cc.imprimirExtrato();
		poupanca.renderJuros(0.1);
		poupanca.imprimirExtrato();
		estudo.imprimirExtrato();
	}

}
