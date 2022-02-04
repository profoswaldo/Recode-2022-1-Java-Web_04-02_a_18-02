package pacote.teste;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private int id;
	private String nome;
	
	private List<Conta> contas;
	
	
	public Cliente() {
		super();
		contas = new ArrayList<Conta>();
	}
	public List<Conta> getContas() {
		return contas;
	}
	public void setContas(List<Conta> conta) {
		this.contas = conta;
	}
	public Cliente(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public void add(Conta conta) {
		contas.add(conta);
	}
	
	public Conta getConta(int pos) {
		return contas.get(pos);
	}
}
