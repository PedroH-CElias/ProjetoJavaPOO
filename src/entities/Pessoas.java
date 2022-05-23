package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import application.Cpf;

//Classe mãe
public class Pessoas {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");// Formato pré definido para as datas
	Cpf cpfaux = new Cpf();
	protected Date dataAtual = new Date();
	protected String nome;
	protected long cpf;
	protected Date dataNasc;
	protected String telefone;
	protected String aux;
	
	public Pessoas(){
		
	}
	public Pessoas(String nome, long cpf, String dataNasc, String telefone) throws ParseException {
		aux = dataNasc;
		
		this.nome = nome;
		this.cpf=cpf;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.aux = dataNasc;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//Método para calcular a idade atual de acordo com a data atual e data de nascimento cadastrada
	public long idadeAtual() {
		long diff = dataAtual.getTime() - dataNasc.getTime();
		TimeUnit time = TimeUnit.DAYS;
		
		return (time.convert(diff,TimeUnit.MILLISECONDS))/365; 
	}
	
	//Método para validação de datas, de acordo com o formato, se ela é uma data existente e válida
	public boolean validaData() {
		sdf.setLenient(false);
		try {
			this.dataNasc = sdf.parse(aux);
			sdf.parse(aux);
			return true;
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "ERRO! Data inválida.","ERRO!",JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}

	//Método para mostrar os atributos de pessoas
	@Override
	public String toString() {
		return "Nome: " + nome + "\nCPF: " + cpf + "\nData de Nascimento: " + sdf.format(dataNasc) + "\nTelefone: "
				+ telefone + "\nIdade atual: " + idadeAtual();
	}
}
