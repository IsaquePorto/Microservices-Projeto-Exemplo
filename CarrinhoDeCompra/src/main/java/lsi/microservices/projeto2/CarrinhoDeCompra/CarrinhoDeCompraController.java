package lsi.microservices.projeto2.CarrinhoDeCompra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carrinhosdecompra")
public class CarrinhoDeCompraController {
	
	CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
	
	@GetMapping("/alterar")
	public String alteraQuantidade() {
		return carrinho.alteraQuantidade(0);
	}
	
	@GetMapping("/transformar")
	public String transformaListaEmCarrinho() {
		 return carrinho.transformaListaEmCarrinho(0);
	 }
	 
	@GetMapping
	 public String listaProdutos() {
		 return carrinho.listaProdutos(0);
	 }
}	
