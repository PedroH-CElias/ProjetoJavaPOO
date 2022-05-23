package application;

import java.text.SimpleDateFormat;
import java.util.Date;

// Classe para cria��o e valida��o de senha
public class Senha {
	SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");

	private Date dataAtual = new Date();
	private String usuario;
	private String senha;

	public Senha(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	//M�todo para gera��o de senha no formato de acordo com usu�rio e data
	public void geraSenha() {
		String[] aux = getUsuario().split(" ");
		this.senha = aux[0].toUpperCase() + sdf.format(dataAtual);
	}
	
	//M�todo para verific��o de senha ap�s tentativa de login, verifica se a senha est� correta
	public boolean verificaSenha(String senha) {
		if (this.getSenha().compareTo(senha) == 0) {
			return true;
		}
		return false;
	}
}
