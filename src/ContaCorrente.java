
public class ContaCorrente extends Conta {
	private double chequeEspecial;

	public ContaCorrente(Cliente cliente, double chequeEspecial) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}
	@Override
	public void sacar(double valor) {
		if (valor <= saldo + chequeEspecial) {
            saldo -= valor;
            System.out.println("Você está em cheque especial");
        }else {
			System.out.println("Sem saldo para essa operação");
		}
	}
}
