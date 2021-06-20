package lsi.microservices.projeto2.CarrinhoDeCompra;

import lombok.Data;

@Data
public class CarrinhoDeCompra {
	
	 private int idCarrinho;
	 private int idProduto;
	 private int idPedido;
	 private int quantidade;
	 private boolean listaProdutos;
	 
	 public String alteraQuantidade(int idProduto) {
		 return "Quantidade alterada";
	 }
	 
	 public String transformaListaEmCarrinho(int idCarrinho) {
		 return "Transformou lista em carrinho.";
	 }
	 
	 public String listaProdutos(int idCarrinho) {
		 return "Lista de todos os produtos do carrinho.";
	 }
}
