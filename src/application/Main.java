/*
 * Programa: Manuten��o de Pessoas (Alunos e Funcionarios)
 * Autoria: Pedro Henrique Cardoso Elias e Bruno Dion�sio ALves
 * Data: maio de 2022
 * Programa para realizar cadastros, edi��o e consultas de dados de Pessoas (Alunos e Funcion�rios)
 * */
package application;

import java.awt.HeadlessException;
import java.text.ParseException;

public class Main {

	public static void main(String[] args) throws HeadlessException, NumberFormatException, ParseException {
		Auxiliar aux = new Auxiliar();
		aux.criaSenha();
		aux.application(aux);
	}
}