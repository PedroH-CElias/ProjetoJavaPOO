package entities;

import java.text.ParseException;

public class FuncionarioProfessor extends Funcionario {
	private String areaDeAtuacao;

	public FuncionarioProfessor(String nome, long cpf, String dataNasc, String telefone, int codFuncional,
			String categoria, double salario, String areaDeAtuacao) throws ParseException {
		super(nome, cpf, dataNasc, telefone, codFuncional, categoria, salario);
		this.areaDeAtuacao = areaDeAtuacao;
	}

	public FuncionarioProfessor() {
		super();
	}

	public String getAreaDeAtuacao() {
		return areaDeAtuacao;
	}

	public void setAreaDeAtuacao(String areaDeAtuacao) {
		this.areaDeAtuacao = areaDeAtuacao;
	}

	@Override
	public String toString() {
		return super.toString() + "\nArea de atuação: " + areaDeAtuacao;
	}

}
