package lsi.microservices.projeto2.Cliente;

import lombok.Data;

@Data
public class Cliente {
	
	private int idCliente;
	private String nomeCliente;
	private String enderecoCliente;
	private String cpfCliente;
	
	public String cadastraCliente() {
		return "Cadastrou um cliente.";
	}
	
	public String visualizaCliente(int idCliente) {
		return "O cliente é Fulano de tal";
	}
	
	public String alteraCliente(int idProduto) {
		return "Alterou um cliente.";
	}
	
}
