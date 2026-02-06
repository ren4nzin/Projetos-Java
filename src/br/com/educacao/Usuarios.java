import java.util.Scanner;

class Alunos {
	int matricula;
	String nome;
	double notalunos;
}

public class Usuarios {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===============================");
		
		System.out.println("Digite a matricula do aluno:");
		int matricula = sc.nextInt();
		
		
		Alunos  alunos1 = new Alunos(); 
		Alunos  alunos2 = new Alunos(); 
		Alunos  alunos3 = new Alunos(); 
		Alunos  alunos4 = new Alunos(); 
		
		
		alunos1.matricula = 1;
		alunos2.matricula = 2;
		alunos3.matricula = 3;
		alunos4.matricula = 4;
		
		alunos1.nome ="PEDRO";
		alunos2.nome ="DANIEl";
		alunos3.nome ="MARCOS";
		alunos4.nome ="JOÃO";
		
		double [] notalunos = new double[]{9,2.3,5,6,5.7,};
		
		alunos1.notalunos = notalunos[0];
		alunos2.notalunos = notalunos[1];
		alunos3.notalunos = notalunos[2];
		alunos4.notalunos = notalunos[3];
	
	
		if (matricula == 1) {
			System.out.println("A nota do aluno " + alunos1.nome + " é " + alunos1.notalunos);
		} else if (matricula == 2) {
			System.out.println("A nota do aluno " + alunos2.nome + " é " + alunos2.notalunos);
		} else if (matricula == 3) {
			System.out.println("A nota do aluno " + alunos3.nome + " é " + alunos3.notalunos);
		} else if (matricula == 4) {
			System.out.println("A nota do aluno " + alunos4.nome + " é " + alunos4.notalunos);
		} else {
			System.out.println("Aluno não encontrado");
		}
	}
}