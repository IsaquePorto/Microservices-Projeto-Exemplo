package lsi.microservices.projeto2.Cliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClientesController {
	
	Cliente cliente = new Cliente();
	
	@GetMapping
	public String getClientes() {
		return "Lista com todos os clientes";
	}
	
	@GetMapping("/add")
	public String addCliente() {
		return cliente.cadastraCliente();
	}
	
	@GetMapping("/alterar")
	public String alteraCliente() {
		return cliente.alteraCliente(0);
	}
	
	
}
