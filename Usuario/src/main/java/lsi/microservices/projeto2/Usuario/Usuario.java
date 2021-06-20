package lsi.microservices.projeto2.Usuario;

import lombok.Data;

@Data
public class Usuario {
	
	private int idUsuario;
	private String nomeUsuario;
	private String senhaUsuario;
	private String emailUsuario;
	
	public String cadastraUsuario() {
		return "Usuário cadastrado.";
	}
	
	public String removeUsuario() {
		return "Usuário removido.";
	}
}
