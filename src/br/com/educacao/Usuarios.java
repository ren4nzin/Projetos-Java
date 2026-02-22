package br.com.educacao;

import java.util.Scanner;

public class Usuarios {

	public static void main(String args[]) {

		Admin admin = new Admin();
		admin.adicionarAlunos(new Alunos(1, "PEDRO", 0));
		admin.adicionarAlunos(new Alunos(2, "DANIEl", 1));
		admin.adicionarAlunos(new Alunos(3, "MARCOS", 2));
		admin.adicionarAlunos(new Alunos(4, "JOÃO", 3));

								 //adiciona alunos no Vector Alunos //

        admin.adicionarProfessor(new Professores("108-A", "BRENO", 140));
        admin.adicionarProfessor(new Professores("109-A", "LUCAS", 138));
        admin.adicionarProfessor(new Professores("110-A", "RODOLFO", 142));
        admin.adicionarProfessor(new Professores("101-B", "PLINIO", 142));

							//adiciona professores no vector professores//


		//admin.imprimirAlunoMT(2);
		//↑↑↑↑↑↑↑↑↑↑↑imprimir aluno usando a matricula ↑↑↑↑↑↑↑↑↑↑↑
			admin.imprimirProfessorNm("LUCAS");
		 //admin.imprimirProfessores(); 
		//↑↑↑↑↑↑↑↑↑↑↑imprime todos os professores↑↑↑↑↑↑↑↑↑↑↑
	}
       // admin.imprimirCustoTotal();
	   //↑↑↑↑↑↑↑↑↑↑↑imprime o custo total do salario de todos os professores↑↑↑↑↑↑↑↑↑↑↑
	}