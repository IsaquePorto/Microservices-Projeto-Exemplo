package lsi.microservices.projeto2.FormaPagamento;

import lombok.Data;

@Data
public class FormaDePagamento {
	
	private int idFormaPgto;
	private String formaPgto;
	private String descricao;
	
	public String escolheFormaPgto() {
		return "Você vai pagar com : Cartão";
	}
	
	public String retornaFormaPgto() {
		return "A forma de pagamento está em: Cartão";
	}
	
	public String insereFormaPgto() {
		return "Nova forma de pagamento adicionada.";
	}
	
	public String removeFormaPgto() {
		return "Forma de pagamento removida.";
	}
	
	public String enviaValorPedido() {
		return "O valor do pedido é : $1000";
	}
	
	public void calculaPedido() {
		
	}
}
