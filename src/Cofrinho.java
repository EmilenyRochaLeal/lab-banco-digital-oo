import java.util.Date;

public class Cofrinho extends ContaPoupanca{
    private String descricao;
    private Date dataInicio;
    private Date dataFim;
    
    public Cofrinho(Cliente cliente, String descricao, Date dataInicio, Date datafim) {
        super(cliente);
        //TODO Auto-generated constructor stub
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
    @Override
	public void imprimirExtrato() {
		System.out.println("=== Meus Cofrinhos ===");
        System.out.println(String.format("Descrição: %s", this.descricao));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
    
}
