package lsi.microservices.projeto2.Produto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/produtos")
@RestController
public class ProdutosController {
	
	Produto produto = new Produto();
	
	@GetMapping
	public String getProdutos() {
		return "Lista de todos os Produtos";
	}
	
	@GetMapping("/add")//Os end points estão Get só para fins de testes
	public String addProduto() {
		return produto.cadastraProduto();
	}
	
	@GetMapping("/deletar") //Os end points estão Get só para fins de testes
	public String deletaProduto() {
		return produto.removeProduto(0);
	}
	
}
