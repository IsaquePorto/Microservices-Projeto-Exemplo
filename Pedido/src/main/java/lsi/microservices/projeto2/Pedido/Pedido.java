package lsi.microservices.projeto2.Pedido;

import lombok.Data;

@Data
public class Pedido {
	
	private int idPedido;
	private int idCliente;
	private int idCarrinho;
	private boolean orcamento;
	
	public void calculaTotalCarrinho() {
		//TODO
	}
	
	public void adcionaProduto(int idProduto, int quantidade) {
		//TODO
	}
	
	public void retiraProduto(int idProduto) {
		//TODO
	}
	
	public void orcamentoParaPedido(int idPedido) {
		//TODO
	}
	
	public void enviaValorProdutos(int idPedido) {
		//TODO
	}
	
	public void concluiPedido(int idPedido) {
		//TODO
	}
	
	public void pagtoStatus(int idPedido) {
		//TODO
	}
}
