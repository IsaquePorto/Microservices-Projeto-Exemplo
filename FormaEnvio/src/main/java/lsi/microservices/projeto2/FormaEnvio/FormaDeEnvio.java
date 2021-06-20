package lsi.microservices.projeto2.FormaEnvio;

import lombok.Data;

@Data
public class FormaDeEnvio {

	private int idFormaEnvio;
	private String formaEnvio;
	private float valorPorQuilo;
	
	public void pesoProdutos(int idPedido) {
		//TODO
	}
	
	public void calculaFrete(int idPedido) {
		//TODO
	}
	
	public void formasEnvio() {
		//TODO
	}
	
	public void valorPostagem(int idPedido) {
		//TODO
	}
	
	public void selecionarForma(int idPedido, int formaEnvio) {
		//TODO
	}
	
	public void envioStatus(int idPedido) {
		//TODO
	}
}
