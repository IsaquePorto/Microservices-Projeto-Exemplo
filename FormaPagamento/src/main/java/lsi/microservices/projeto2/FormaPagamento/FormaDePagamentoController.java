package lsi.microservices.projeto2.FormaPagamento;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/formasdepagamento")
public class FormaDePagamentoController {
	
	FormaDePagamento forma = new FormaDePagamento();
	
	@GetMapping
	public String getFormasDePagamento() {
		return "Lista de todas as formas de pagamento";
	}
	
	@GetMapping("/add")
	public String addFormaPgto() {
		return forma.insereFormaPgto();
	}
	
	@GetMapping("/formaAtual")
	public String retornaFormaPgto() {
		return forma.retornaFormaPgto();
	}
	
	@GetMapping("/escolheForma")
	public String escolheFormaPgto() {
		return forma.escolheFormaPgto();
	}
	
	@GetMapping("/remover")
	public String removeFormaPgto() {
		return forma.removeFormaPgto();
	}
	
	@GetMapping("/enviarvalor")
	public String enviaValorPedido() {
		return forma.enviaValorPedido();
	}
	
}
