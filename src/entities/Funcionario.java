package entities;

import java.text.ParseException;

public class Funcionario extends Pessoas{
	private int codFuncional;
	private String categoria;
	private double salario;

	public Funcionario() {
		
	}
	public Funcionario(String nome, long cpf, String dataNasc, String telefone, int codFuncional, String categoria,
			double salario) throws ParseException {
		super(nome, cpf, dataNasc, telefone);
		this.codFuncional = codFuncional;
		this.categoria = categoria;
		this.salario = salario;
	}

	public int getCodFuncional() {
		return codFuncional;
	}

	public void setCodFuncional(int codFuncional) {
		this.codFuncional = codFuncional;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return super.toString() +  "\nCodigo: " + codFuncional + "\nCategoria: " + categoria + "\nSalario: R$" + salario;
	}
	
	
}
