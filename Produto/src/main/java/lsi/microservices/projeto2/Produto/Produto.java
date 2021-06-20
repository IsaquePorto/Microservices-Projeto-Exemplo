package lsi.microservices.projeto2.Produto;


import lombok.Data;

@Data
public class Produto {
	
	private int idProduto;
	private String nomeProduto;
	private int pesoProduto;
	
	public String cadastraProduto() {
		return "Cadastrou um produto.";
	}
	
	public String removeProduto(int idProduto) {
		return "Removeu o produto de id: "+idProduto;
	}
	
	public String alteraProduto(int idProduto) {
		return "Alterou um produto.";
	}
	
}
