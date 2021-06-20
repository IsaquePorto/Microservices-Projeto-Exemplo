package lsi.microservices.projeto2.Pedido;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {
	
	@GetMapping
	public String listarPedidos(){
		return "Lista de todos os Pedidos";
	}
	
}
