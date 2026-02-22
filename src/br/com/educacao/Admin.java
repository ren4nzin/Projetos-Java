package br.com.educacao;

import java.util.Vector;

class Admin {

    // ===== ALUNOS =====
    Vector<Alunos> alunos = new Vector<>();

    public void adicionarAlunos(Alunos a) {
        alunos.add(a);
    }

    public void imprimirAlunos() {
        for (Alunos a : alunos) {
            a.imprimir();
        }
    }

    // imprime UM aluno pela matrícula
    public void imprimirAlunoMT(int matricula) {
        for (Alunos a : alunos) {
            if (a.matricula == matricula) {
                a.imprimir();
                return;
            }
        }
        System.out.println("Aluno não encontrado");
    }

    // ===== PROFESSORES =====
    Vector<Professores> professores = new Vector<>();
    double custoTotalSalarios = 0;

    public void adicionarProfessor(Professores p) {
        professores.add(p);
        custoTotalSalarios += p.getSalario();
    }

    public void imprimirProfessores() {
        for (Professores p : professores) {
            p.imprimir();
        }
    }

    public void imprimirCustoTotal() {
        System.out.println("Custo total dos salários: R$ " + custoTotalSalarios);
    }
}