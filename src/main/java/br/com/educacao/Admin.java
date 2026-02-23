package br.com.educacao;

import java.util.Vector;

class Admin {
    // vector da classe alunos e funçoes
    Vector<Alunos> alunos = new Vector<>();

    public void adicionarAlunos(Alunos a) {
        alunos.add(a);
    }

    // função que adiciona alunos ↑↑↑↑↑↑↑↑↑↑↑
    public void imprimirAlunos() {
        for (Alunos a : alunos) {
            a.imprimir();
        }
    }

    // função que imprime todos os alunos ↑↑↑↑↑↑↑↑↑↑↑
    public void imprimirAlunoMT(int matricula) {
        for (Alunos a : alunos) {
            if (a.matricula == matricula) {
                a.imprimir();
                return;
            } // função que imprime UM aluno pela matrícula ↑↑↑↑↑↑↑↑↑↑↑
        }
        System.out.println("Aluno não encontrado");
    }

    // vector da classe professores e funçoes
    Vector<Professores> professores = new Vector<>();
    double custoTotalSalarios = 0;

    public void adicionarProfessor(Professores p) {
        professores.add(p);
        custoTotalSalarios += p.getSalario();
    }

    public void imprimirProfessorNm(String nome) {
        for (Professores p : professores) {
            if (p.nome == nome) {
                p.imprimir();
                return;
            } // função que imprime UM Professor pelo nome          
        }
        System.out.println("Professor não encontrado");
    }

    public void imprimirProfessores() {
        for (Professores p : professores) {
            p.imprimir();
        }
    }
    // a função imprimir esta em Professores aqui estamos apenas chamando ela

    public void imprimirCustoTotal() {
        System.out.println("Custo total dos salários: R$ " + custoTotalSalarios);
    }
}