package br.com.educacao;

import java.util.Scanner;

public class Usuarios {

	public static void main(String args[]) {
		Alunos aluno1, aluno2, aluno3, aluno4;
		Professores professor1, professor2, professor3, professor4;

		aluno1 = new Alunos(1, "PEDRO", 0);
		aluno2 = new Alunos(2, "DANIEl", 1);
		aluno3 = new Alunos(3, "MARCOS", 2);
		aluno4 = new Alunos(4, "JOÃO", 3);

		professor1 = new Professores("108-A", "BRENO", 140.00);
		professor2 = new Professores("109-A", "LUCAS", 138.00);
		professor3 = new Professores("110-A", "RODOLFO", 142.00);
		professor4 = new Professores("101-B", "PLINIO", 142.00);

		// aluno1.ajustarnota(5.0);
		// aluno1.diminuinota(5.1);
		// aluno1.alterarmatricula(6);
		// aluno1.corrigirnome(nome "BRENO");

		aluno1.imprimir();
		professor1.imprimir();
	}
}