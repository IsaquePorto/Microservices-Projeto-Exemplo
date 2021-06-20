package lsi.microservices.projeto2.FormaEnvio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/formasdeenvio")
public class FormaDeEnvioController {

	FormaDeEnvio forma = new FormaDeEnvio();
	
	@GetMapping
	public String getFormas() {
		return "Lista de todas as formas de envio.";
	}
	
	
}
