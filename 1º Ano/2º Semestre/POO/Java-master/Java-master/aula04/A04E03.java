package aula04;

import java.util.*;

public class A04E03 {

	public static void main(String[] args) {
		
		//----------------------------------NOTAS---------------------------------//
		// 1 - Utilizei listas para armazenar os objetos criados ao longo do programa, 
		//     pois considerei ser mais facil e dinamico
		// 2 - Ao ler strings do teclado, por favor utilize apenas uma palavra.
		//     Nao sei porque, mas o metodo sc.nextLine(); nao estava a funcionar corretamente,
		//     por isso utilizei o metodo sc.next();
		// 3 - Criei uma classe adicional, a classe "Emprestimo", para averiguar se a organizacao dos dados
		//     ficaria mais simplificada
		
		
		Scanner sc = new Scanner(System.in);
		
		// inicializacao de variaveis
		int nAlunos = 0, nLivros = 0, nEmprestimos = 0;
		
		// lista para os livros
		List<Livro> catalogo = new ArrayList<Livro>();
				
		// lista para os alunos
		List<Utilizador> alunos = new ArrayList<Utilizador>();
		
		List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
		
		// lista para os emprestimos
		
		// atribuicao de variaveis
		String nome, curso, titulo, tipo;
		int nMec, id;
		boolean controlo = false;
		
		int op = 0;
		while(op != 9) {
			op = menu();
			
			switch(op) {
			case 9:
				System.out.println("\nObrigado por utilizar a nossa biblioteca!");
				break;
				
			case 1:
				
				System.out.println("\nInscrever utilizador: ");
				// leitura de dados do teclado
				System.out.print("Nome: ");
				nome = sc.next();
				
				System.out.print("Curso: ");
				curso = sc.next();
				
				System.out.print("N mec: ");
				nMec = sc.nextInt();
				
				// adicionar o novo aluno ao array
				alunos.add(new Utilizador(nome, nMec, curso)); 
				System.out.println("Aluno adicionado! " + alunos.get(nAlunos));
				nAlunos++;
				
				break;
				
			case 2:
				
				if(alunos.size() > 0) {
					System.out.println("\nRemover aluno:");
					System.out.print("N Mec: ");
					nMec = sc.nextInt();
					controlo = false;
					for(int i = 0; i < alunos.size(); i++) {
						if(alunos.get(i).getnMec() == nMec) {
							alunos.remove(i);
							nAlunos--;
							controlo = true;
							break;
						}
					}
					if(controlo) {
						System.out.println("\nAluno removido com sucesso!");
					} else {
						System.out.println("\nN Mec nao registado!");
					}
				} else {
					System.out.println("\nNenhum utilizador registado.");
				}
				break;
					
			case 3:
				
				if(alunos.size() > 0) {
					System.out.println("\nLista de utilizadores:");
					for(int i = 0 ; i < alunos.size() ; i++) {
						System.out.println("Aluno " + (i+1) + " " + alunos.get(i));
					}
				} else {
					System.out.println("\nNenhum utilizador registado!");
				}
				break;
				
			case 4:
				
				System.out.println("\nRegistar novo livro:");
				
				System.out.print("Titulo: ");
				titulo = sc.next();
				
				System.out.print("Tipo (NORMAL ou CONDICIONAL): ");
				tipo = sc.next().toUpperCase();
				
				// adicionar livro a lista de livros
				catalogo.add(new Livro(titulo, tipo));
				System.out.println("Livro adicionado! " + catalogo.get(nLivros).toString());
				nLivros++;
				break;
				
			case 5:
				
				System.out.println("\nLista de Livros");
				if(catalogo.size() > 0) {
					for(int i = 0; i < catalogo.size(); i++) {
						System.out.println("Livro " + catalogo.get(i).getMyId() + ": " + catalogo.get(i));
					}
				} else {
					System.out.println("\nNao existem livros registados.");
				}
				break;
				
			case 6:
				
				controlo = false;
				if(catalogo.size() == 0 && alunos.size() == 0) {
					System.out.println("\nNao existem livros nem alunos registados.");
				} else if (catalogo.size() == 0) {
					System.out.println("\nNao existem livros registados.");
				} else if (alunos.size() == 0) {
					System.out.println("\nNao existem alunos registados.");
				} else {
					System.out.println("\nRegistar livro:");
					
					System.out.print("N Mec: ");
					nMec = sc.nextInt();
					
					System.out.print("ID do livro: ");
					id = sc.nextInt();
					
					for(Utilizador aluno : alunos) {
						if(aluno.getnMec() == nMec && aluno.getLivrosEmprestados() < 3) {
							for(Livro manual : catalogo) {
								if(manual.getMyId() == id & manual.isBorrowed() == false) {
									emprestimos.add(new Emprestimo(nMec, id));
									System.out.println("\nLivro emprestado!");
									aluno.emprestaLivros(1);
									manual.setBorrowed(true);
									nEmprestimos++;
									controlo = true;
								} else if(manual.getMyId() == id & manual.isBorrowed() == true) {
									System.out.println("\nLivro Indisponivel.");
									controlo = true;
								}
							}
						} else if (aluno.getnMec() == nMec && aluno.getLivrosEmprestados() >= 3) {
							System.out.println("\nO aluno ja requisitou 3 livros.");
							controlo = true;
						}
					}
					if (controlo == false) {
						System.out.println("\nDados invalidos!");
					}
				
					}
				break;
				
			case 7:
				if(emprestimos.size() == 0) {
					System.out.println("\nNao existem emprestimos.");
				} else {
					controlo = false;
					System.out.println("\nRemover livro:");
					
					System.out.print("N Mec: ");
					nMec = sc.nextInt();
					
					System.out.print("ID do Livro: ");
					id = sc.nextInt();
					
					for(int i = 0 ; i < emprestimos.size(); i++) {
						if(emprestimos.get(i).getnMec() == nMec && emprestimos.get(i).getId() == id) {
							controlo = true;
							emprestimos.remove(i);
							for(Utilizador aluno : alunos) {
								if(aluno.getnMec() == nMec) {
									aluno.emprestaLivros(-1);
								}
							}
							for(Livro manual : catalogo) {
								if(manual.getMyId() == id) {
									manual.setBorrowed(false);
								}
							}
							System.out.println("\nLivro devolvido com sucesso!");
						}
					}
					if(controlo == false) {
						System.out.println("\nDados invalidos!");
					}
					
				}
				break;
				
			case 8:
				if(catalogo.size() == 0) {
					System.out.println("\nNao existem livros registados.");
				} else if (catalogo.size() > 0){
					System.out.println();
					for(Livro manual : catalogo) {
						if(manual.isBorrowed() == false) {
							System.out.println("Livro " + manual.getMyId() + ": Disponivel");
						} else if(manual.getTipo().equals("CONDICIONAL")) {
							System.out.println("Livro " + manual.getMyId() + ": Indisponivel [Tipo: CONDICIONAL]");
						}
						
					}
					if(emprestimos.size() > 0) {
						for(int i = 0 ; i < emprestimos.size() ; i++) {
							System.out.println("Livro " + emprestimos.get(i).getId() + ": Emprestado [N Mec: " + emprestimos.get(i).getnMec() + "]");
						}
					}
				}
				break;
			default:
				System.out.println("\nNao implementado!");
				break;
				
			}
		}
		
		sc.close();
	}
	
	public static int menu() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nBiblioteca de POO\n");
		System.out.println("1 - inscrever aluno");
		System.out.println("2 - remover aluno");
		System.out.println("3 - imprimir lista de utilizadores");
		System.out.println("4 - registar um novo livro");
		System.out.println("5 - imprimir lista de livros");
		System.out.println("6 - emprestar");
		System.out.println("7 - devolver");
		System.out.println("8 - verificar disponibilidade");
		System.out.println("9 - sair");
		System.out.print("Opcao? ");
		int op = sc.nextInt();
		return op;		
	}

}
