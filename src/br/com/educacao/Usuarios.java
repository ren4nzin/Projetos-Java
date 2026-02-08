package br.com.educacao;

import java.util.Scanner;

public class Usuarios {

	public static void main(String args[]) {
		Alunos aluno1, aluno2, aluno3, aluno4;

		aluno1 = new Alunos(1, "PEDRO", );
		aluno2 = new Alunos(2, "DANIEl", 1);
		aluno3 = new Alunos(3, "MARCOS", 2);
		aluno4 = new Alunos(4, "JOÃO", 3);		

		//aluno1.aumentarnota(5.1);
		//aluno1.ajustarnota(5.0);
        //aluno1.diminuinota(5.1);
		//aluno1.alterarmatricula(6);
		//aluno1.corrigirnome(nome "BRENO");
		
		aluno1.imprimir();
		
	}
}