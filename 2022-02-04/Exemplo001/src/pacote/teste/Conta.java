package pacote.teste;

public class Conta {
	
	private String agencia;
	private String nrConta;
	
	private Cliente cliente;
	
	public Conta() {
		super();
	}

	public Conta(String agencia, String nrConta) {
		super();
		this.agencia = agencia;
		this.nrConta = nrConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNrConta() {
		return nrConta;
	}

	public void setNrConta(String nrConta) {
		this.nrConta = nrConta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	

}
