package br.com.educacao;

class Alunos {
	int matricula;
	String nome;
	double notalunos;

	public Alunos() {
	}

	public Alunos(int matricula) {
		this.matricula = matricula;
	}

	public Alunos(String nome) {
		this.nome = nome;
	}

	public Alunos(double notalunos) {
		this.notalunos = notalunos;
	}

	public Alunos(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}

	public Alunos(int matricula, double notalunos) {
		this.matricula = matricula;
		this.notalunos = notalunos;
	}

	public Alunos(String nome, double notalunos) {
		this.nome = nome;
		this.notalunos = notalunos;
	}

	public Alunos(int matricula, String nome, double notalunos) {
		this.matricula = matricula;
		this.nome = nome;
		this.notalunos = notalunos;
	}

	public void imprimir() {
		System.out.println("===============================");
		System.out.println("Minha matricula é: " + this.matricula);
		System.out.println("Meu nome é: " + this.nome);
		System.out.println("Minha nota é: " + this.notalunos);
		System.out.println("===============================");
	}

	public void aumentarnota(double notalunos) {
		this.notalunos += notalunos;
	}

	public void diminuinota(double notalunos) {
		this.notalunos -= notalunos;
	}

	public void ajustarnota(double notalunos) {
		this.notalunos = notalunos;
	}

	public void alterarmatricula(int matricula) {
		this.matricula = matricula;
	}

	public void corrigirnome(string nome) {
		this.nome = nome;
	}

	// todo:
	// criar e usar a funcao aumenta nota *implementado e testado*
	// criar e usar a funcao diminui nota *implementado e testado*
	// criar e usar a funcao ajustar nota *implementado e testado*

	// criar e usar a funcao alterar matricula *implementado e testado*
	// criar e usar a funcao corrigir nome *implementado e testado*
	// ggeasy
}
