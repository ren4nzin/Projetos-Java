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

        professor1 =new Professores("","BRENO",10.20);
		professor2 =new Professores();
		professor3 =new Professores();
		professor4 =new Professores();

		//aluno1.aumentarnota(5.1);
		//aluno1.ajustarnota(5.0);
        //aluno1.diminuinota(5.1);
		//aluno1.alterarmatricula(6);
		//aluno1.corrigirnome(nome "BRENO");
		
		aluno1.imprimir();
		professor1.imprimir();
		
	}
}