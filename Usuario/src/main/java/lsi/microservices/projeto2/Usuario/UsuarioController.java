package lsi.microservices.projeto2.Usuario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	Usuario usuario = new Usuario();
	
	@GetMapping
	public String getUsuarios() {
		return "Lista de todos os usuários";
	}
	
	@GetMapping("/add")	//Os endPoints estão todos get só para fins de teste.
	public String addUsuario() {
		return usuario.cadastraUsuario();
	}
	
	@GetMapping("/remover")
	public String removeUsuario() {
		return usuario.removeUsuario();
	}
	
}
