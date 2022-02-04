import pacote.teste.Cliente;
import pacote.teste.Conta;

public class Principal {

	public static void main(String[] args) {


		Cliente cliente = new Cliente();
		
		Conta conta = new Conta();
		
		cliente.setId(10);
		cliente.setNome("Oswaldo");
		
		conta.setAgencia("1010");
		conta.setNrConta("10101010-10");
		
		cliente.add(conta);
		conta.setCliente(cliente);
		
		System.out.println("ID: " + cliente.getId());
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Agência: " + cliente.getConta(0).getAgencia());
		System.out.println("Conta: " + cliente.getConta(0).getNrConta());
		
		System.out.println("-------");
		System.out.println("ID: " + conta.getCliente().getId());
		System.out.println("Nome: " + conta.getCliente().getNome());
		System.out.println("Agência: " + conta.getAgencia());
		System.out.println("Conta: " + conta.getNrConta());

	}

}
