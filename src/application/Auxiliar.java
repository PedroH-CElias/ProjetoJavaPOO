package application;

import java.awt.HeadlessException;
import java.text.ParseException;

import javax.swing.JOptionPane;

import entities.Alunos;
import entities.Funcionario;
import entities.FuncionarioProfessor;
import entities.FuncionarioTecnicoAdministrativo;
import entities.Pessoas;

public class Auxiliar {
	Cpf cpf = new Cpf();
	//Cadastra aluno
	public Alunos cadastraAluno() throws HeadlessException, NumberFormatException, ParseException {
		JOptionPane.showMessageDialog(null, "Cadastro de alunos!");
		Pessoas aluno = new Alunos(JOptionPane.showInputDialog("Digite seu nome: "),
				Long.parseLong(JOptionPane.showInputDialog("Digite seu cpf (Apenas números): ")),
				JOptionPane.showInputDialog("Digite sua data de nascimento (dd/mm/yyyy): "),
				JOptionPane.showInputDialog("Digite seu telefone: "),
				JOptionPane.showInputDialog("Digite seu RA: "),
				Float.parseFloat(JOptionPane.showInputDialog("Digite seu CORA: ")));
		while (!cpf.validaCpf(aluno.getCpf())) {
			aluno.setCpf(Long.parseLong(JOptionPane.showInputDialog("Digite seu cpf novamente (XXXXXXXXXXX): ")));
		}
		while (!aluno.validaData()) {
			aluno.setDataNasc(JOptionPane.showInputDialog("Digite a data de nascimento novamente (dd/mm/yyyy): "));
		}
		JOptionPane.showMessageDialog(null, "Cadastro de aluno realizado com sucesso!");
		return (Alunos) aluno;
	}
	//Cadastro de professor
	public FuncionarioProfessor cadastraProfessor() throws HeadlessException, NumberFormatException, ParseException {
		JOptionPane.showMessageDialog(null, "Cadastro de Professor!");
		FuncionarioProfessor fp = new FuncionarioProfessor(JOptionPane.showInputDialog("Digite seu nome: "),
				Long.parseLong(JOptionPane.showInputDialog("Digite seu cpf (Apenas números): ")),
				JOptionPane.showInputDialog("Digite sua data de nascimento (dd/mm/yyyy): "),
				JOptionPane.showInputDialog("Digite seu telefone: "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o código do funcionario: ")),
				JOptionPane.showInputDialog("Digite a categoria: "),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o sálario ")),
				JOptionPane.showInputDialog("Digite a área de atuação: "));
		while (!cpf.validaCpf(fp.getCpf())) {
			fp.setCpf(Long.parseLong(JOptionPane.showInputDialog("Digite seu cpf novamente: ")));
		}
		while (!fp.validaData()) {
			fp.setDataNasc(JOptionPane.showInputDialog("Digite a data novamente: "));
		}
		JOptionPane.showMessageDialog(null, "Cadastro de professor realizado com sucesso!");
		return fp;
	}
	
	//Cadastro de funcionario tecnico administrativo
	public FuncionarioTecnicoAdministrativo cadastraTecnicoadministrativo() throws HeadlessException, NumberFormatException, ParseException {
		JOptionPane.showMessageDialog(null, "Cadastro de Técnico Administrativo!");
		FuncionarioTecnicoAdministrativo fta = new FuncionarioTecnicoAdministrativo(JOptionPane.showInputDialog("Digite seu nome: "),
				Long.parseLong(JOptionPane.showInputDialog("Digite seu cpf (Apenas números): ")),
				JOptionPane.showInputDialog("Digite sua data de nascimento (dd/mm/yyyy): "),
				JOptionPane.showInputDialog("Digite seu telefone: "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o código do funcionario: ")),
				JOptionPane.showInputDialog("Digite a categoria: "),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o sálario ")),
				JOptionPane.showInputDialog("Digite o departamento: "));
		while (!cpf.validaCpf(fta.getCpf())) {
			fta.setCpf(Long.parseLong(JOptionPane.showInputDialog("Digite seu cpf novamente: ")));
		}
		while (!fta.validaData()) {
			fta.setDataNasc(JOptionPane.showInputDialog("Digite a data novamente: "));
		}
		JOptionPane.showMessageDialog(null, "Cadastro de Tecnico Administrativo realizado com sucesso!");
		return fta;
	}
	
	//Consulta
	public void consultaAluno(Pessoas aluno) {
		JOptionPane.showMessageDialog(null,"----------------- ALUNO ----------------- \n" + aluno );
	}
	public void consultaProfessor(Funcionario fp) {
		JOptionPane.showMessageDialog(null, "----------------- PROFESSOR ----------------- \n" + fp);
	}
	public void consultaTecnicoAdministrativo(Funcionario fta) {
		JOptionPane.showMessageDialog(null, "----------------- TECNICO ADMINISTRATIVO ----------------- \n" + fta);
	}
	
	//Cria senha
	public void criaSenha() {
		  Senha senha = new
				  Senha(JOptionPane.showInputDialog("Digite seu nome completo: "));
				  senha.geraSenha(); JOptionPane.showMessageDialog(null, "Usuário: " +
				 senha.getUsuario() +
				  "\nSenha gerada! \nPrimeiro nome do usuário em maiusculo + Data atual(ddMMyyyy)\nExemplo: JOAO20032001"
				 ); String senhaDigitada = JOptionPane.showInputDialog("Usuario: " +
				 senha.getUsuario() + "\nSenha: "); while(!senha.verificaSenha(senhaDigitada))
				 { JOptionPane.showMessageDialog(null, "Senha inválida", "ERRO",
				 JOptionPane.ERROR_MESSAGE); senhaDigitada =
				  JOptionPane.showInputDialog("Usuario: " + senha.getUsuario() + "\nSenha: ");
				  } JOptionPane.showMessageDialog(null, "Usuario " + senha.getUsuario() +
				  " logado com sucesso!", "CORRETO", JOptionPane.PLAIN_MESSAGE);
				 
	}
	//Todos os menus do programa e incluindo funcoes de cadastro, edicao e consulta
	public void application(Auxiliar aux) throws HeadlessException, NumberFormatException, ParseException {
		int opcao = 1;
		Alunos aluno = new Alunos();
		FuncionarioProfessor fp = new FuncionarioProfessor();
		FuncionarioTecnicoAdministrativo fta = new FuncionarioTecnicoAdministrativo();
		
		Cpf cpf = new Cpf();

		while (opcao != 0) {
			opcao = Integer.parseInt(
					JOptionPane.showInputDialog("TELA INICIAL\n(1) - Cadastrar\n(2) - Editar\n(3) - Consultar\n(0) - Encerrar", "Digite..."));
			switch (opcao) {
			case 0: {
				break;
			}
			case 1: {
				JOptionPane.showMessageDialog(null, "Cadastro de pessoas!");
				int escolha = 1;
				while (escolha != 0) {
					escolha = Integer.parseInt(
							JOptionPane.showInputDialog("CADASTRO\n(1) - Aluno\n(2) - Professor\n(3) - Técnico administrativo\n(0) - Voltar", "Digite..."));
					switch (escolha) {
					case 0: {
						break;
					}
					case 1: {
						aluno = aux.cadastraAluno();
						break;
					}
					case 2: {
						fp = aux.cadastraProfessor();
						break;
					}
					case 3: {
						fta= aux.cadastraTecnicoadministrativo();
						break;
					}
					default: {
						JOptionPane.showMessageDialog(null, "ERRO! Opção inválida!", "ERRO!",
								JOptionPane.ERROR_MESSAGE);
						break;
					}
					}
				}
				break;
			}
			case 2: {
				int opcao2 = 1;
				while (opcao2 != 0) {
					opcao2 = Integer.parseInt(JOptionPane.showInputDialog(
							"EDITAR\n(1) - Aluno\n(2) - Professor\n(3) - Técnico Administrativo\n(0) - Voltar", "Digite..."));
					int opcao3 = 1;
					switch (opcao2) {
					case 1: {
						while (opcao3 != 0) {
							try {
								System.out.println(aluno);
								opcao3 = Integer.parseInt(JOptionPane.showInputDialog(
										"EDITAR ALUNO\n(1) - Nome\n(2) - " + "Cpf\n(3) - Data de Nascimento\n(4) - Telefone\n(5) "
												+ "- R.A\n(6) - CORA\n(0) - Voltar"));
								switch (opcao3) {
								case 1: {
									aluno.setNome(JOptionPane.showInputDialog("Digite o novo nome: "));
									break;
								}
								case 2:{
									aluno.setCpf(Long.parseLong(JOptionPane.showInputDialog("Digite o novo cpf: ")));
									while (!cpf.validaCpf(aluno.getCpf())) {
										aluno.setCpf(Long.parseLong(JOptionPane.showInputDialog("Digite seu cpf novamente: ")));
									}
									break;
								}
								case 3: {
									aluno.setDataNasc(JOptionPane.showInputDialog("Digite a nova data de nascimento: "));
									while (!aluno.validaData()) {
										aluno.setDataNasc(JOptionPane.showInputDialog("Digite a data novamente: "));
									}
									break;
								}
								case 4: {
									aluno.setTelefone(JOptionPane.showInputDialog("Digite o novo telefone: "));
									break;
								}
								case 5: {
									aluno.setRa(JOptionPane.showInputDialog("Digite o novo RA: "));
									break;
								}
								case 6: {
									aluno.setCora(Float.parseFloat(JOptionPane.showInputDialog("Digite o novo CORA: ")));
									break;
								}
								case 0: {
									break;
								}
								default: {
									JOptionPane.showMessageDialog(null, "ERRO! Opção inválida!", "ERRO!",
											JOptionPane.ERROR_MESSAGE);
									break;
								}
								}
							}catch (Exception e) {
								JOptionPane.showMessageDialog(null, "ERRO! Aluno não cadastrado!", "ERRO!",
										JOptionPane.ERROR_MESSAGE);
								break;
							}
						}

						break;
					}
					case 2: {
						while (opcao3 != 0) {
							try {
								System.out.println(fp);
								opcao3 = Integer.parseInt(JOptionPane.showInputDialog("EDITAR PROFESSOR\n(1) - Nome\n(2) - "
										+ "Cpf\n(3) - Data de Nascimento\n(4) - Telefone\n(5) - Código\n(6) - Categoria\n"
										+ "(7) - Sálario\n(8) - Área de atuação\n(0) - Voltar"));
								switch (opcao3) {
								case 1: {
									fp.setNome(JOptionPane.showInputDialog("Digite o novo nome: "));
									break;
								}
								case 2:{
									fp.setCpf(Long.parseLong(JOptionPane.showInputDialog("Digite o novo cpf: ")));
									while (!cpf.validaCpf(fp.getCpf())) {
										fp.setCpf(Long.parseLong(JOptionPane.showInputDialog("Digite seu cpf novamente: ")));
									}
									break;
								}
								case 3: {
									fp.setDataNasc(JOptionPane.showInputDialog("Digite a nova data de nascimento: "));
									while (!fp.validaData()) {
										fp.setDataNasc(JOptionPane.showInputDialog("Digite a data novamente: "));
									}
									break;
								}
								case 4: {
									fp.setTelefone(JOptionPane.showInputDialog("Digite o novo telefone: "));
									break;
								}
								case 5: {
									fp.setCodFuncional(Integer.parseInt(JOptionPane.showInputDialog("Digite o novo código: ")));
									break;
								}
								case 6: {
									fp.setCategoria(JOptionPane.showInputDialog("Digite a nova categoria: "));
									break;
								}
								case 7: {
									fp.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Digite o novo salário: ")));
									break;
								}
								case 8: {
									fp.setAreaDeAtuacao(JOptionPane.showInputDialog("Digite a nova área de atuação: "));
									break;
								}
								case 0: {
									break;
								}
								default: {
									JOptionPane.showMessageDialog(null, "ERRO! Opção inválida!", "ERRO!",
											JOptionPane.ERROR_MESSAGE);
									break;
								}
								}
							}catch (Exception e) {
								JOptionPane.showMessageDialog(null, "ERRO! Professor não cadastrado!", "ERRO!",
										JOptionPane.ERROR_MESSAGE);
								break;
							}
						}
						break;
					}
					case 3: {
						while (opcao3 != 0) {
							try {
								System.out.println(fta);
								opcao3 = Integer.parseInt(JOptionPane.showInputDialog("EDITAR TÉCNICO ADMINISTRATIVO\n(1) - Nome\n(2) - "
										+ "Cpf\n(3) - Data de Nascimento\n(4) - Telefone\n(5) - Código\n(6) - Categoria\n"
										+ "(7) - Sálario\n(8) - Departamento\n(0) - Voltar"));
								switch (opcao3) {
								case 1: {
									fta.setNome(JOptionPane.showInputDialog("Digite o novo nome: "));
									break;
								}
								case 2: {
									fta.setCpf(Long.parseLong(JOptionPane.showInputDialog("Digite o novo cpf: ")));
									while (!cpf.validaCpf(fta.getCpf())) {
										fta.setCpf(Long.parseLong(JOptionPane.showInputDialog("Digite seu cpf novamente: ")));
									}
									break;
								}
								case 3: {
									fta.setDataNasc(JOptionPane.showInputDialog("Digite a nova data de nascimento: "));
									while (!fta.validaData()) {
										fta.setDataNasc(JOptionPane.showInputDialog("Digite a data novamente: "));
									}
									break;
								}
								case 4: {
									fta.setTelefone(JOptionPane.showInputDialog("Digite o novo telefone: "));
									break;
								}
								case 5: {
									fta.setCodFuncional(Integer.parseInt(JOptionPane.showInputDialog("Digite o novo código: ")));
									break;
								}
								case 6: {
									fta.setCategoria(JOptionPane.showInputDialog("Digite a nova categoria: "));
									break;
								}
								case 7: {
									fta.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Digite o novo salário: ")));
									break;
								}
								case 8: {
									fta.setDepartamento(JOptionPane.showInputDialog("Digite o novo departamento: "));
									break;
								}
								case 0: {
									break;
								}
								default: {
									JOptionPane.showMessageDialog(null, "ERRO! Opção inválida!", "ERRO!",
											JOptionPane.ERROR_MESSAGE);
									break;
								}
								}
								
							}catch (Exception e) {
								JOptionPane.showMessageDialog(null, "ERRO! Técnico administrativo não cadastrado!", "ERRO!",
										JOptionPane.ERROR_MESSAGE);
								break;
							}

						}
						break;
					}
					}
				}
				break;
			}
			case 3: {
				int escolha2 = 1;
				while (escolha2 != 0) {
					escolha2 = Integer.parseInt(JOptionPane.showInputDialog(
							"CONSULTA PESSOA\n(1) - Consultar Aluno\n(2) - Consultar Professor\n(3) - Consultar Técnico Admistrativo\n(0) - Voltar", "Digite..."));
					switch (escolha2) {
					case 0: {
						break;
					}
					case 1: {
						try {
							aux.consultaAluno(aluno);
							break;
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "ERRO! Aluno não cadastrado!", "ERRO!",
									JOptionPane.ERROR_MESSAGE);
							break;
						}

					}
					case 2: {
						try {
							aux.consultaProfessor(fp);
							break;
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "ERRO! Professor não cadastrado!", "ERRO!",
									JOptionPane.ERROR_MESSAGE);
							break;
						}

					}
					case 3: {
						try {
							aux.consultaTecnicoAdministrativo(fta);
							break;
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "ERRO! Técnico Admistrativo não cadastrado!", "ERRO!",
									JOptionPane.ERROR_MESSAGE);
							break;
						}
					}
					default:{
						JOptionPane.showMessageDialog(null, "ERRO! Opção inválida!", "ERRO!", JOptionPane.ERROR_MESSAGE);
					}
					}
				}
				break;
			}
			default: {
				JOptionPane.showMessageDialog(null, "ERRO! Opção inválida!", "ERRO!", JOptionPane.ERROR_MESSAGE);
			}
			}

		}
	}
}
