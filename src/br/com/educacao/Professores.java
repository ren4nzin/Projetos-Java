package br.com.educacao;
class Professores {

    String salas;
    String nome;
    double horasTrabalhadas;

    public Professores() {
    }

    public Professores(String salas, String nome) {
        this.salas = salas;
        this.nome = nome;
    }

    public Professores(String salas, String nome, double horasTrabalhadas) {
        this.salas = salas;
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void imprimir() {
        System.out.println("Salas: " + salas);
        System.out.println("Nome do professor: " + nome);
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
    }
}
