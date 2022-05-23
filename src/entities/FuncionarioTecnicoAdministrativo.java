package entities;

import java.text.ParseException;

public class FuncionarioTecnicoAdministrativo extends Funcionario{

	private String departamento;

	public FuncionarioTecnicoAdministrativo(String nome, long cpf, String dataNasc, String telefone,
			int codFuncional,String categoria, double salario, String departamento) throws ParseException {
		super(nome, cpf, dataNasc, telefone, codFuncional, categoria, salario);
		this.departamento = departamento;
	}

	public FuncionarioTecnicoAdministrativo() {
		super();
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return super.toString() + "\nDepartamento: " + departamento;
	}
	
}
