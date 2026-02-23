package br.com.educacao;

public class Usuarios {

    public static void main(String[] args) {

        AlunoDAO dao = new AlunoDAO();
        dao.criarTabela();

dao.inserir(new Alunos(9, "Pedro", 8.5));
         // função que adiciona UM aluno  ↑↑↑↑↑↑↑↑↑↑↑

       // dao.remover(2);
// função que deleta UM aluno do banco de dados  pela matrícula ↑↑↑↑↑↑↑↑↑↑↑

       // Alunos a = dao.buscarPorMatricula(2);
        //if (a != null) {
           // a.imprimir();
       // }
// função que buscar UM aluno do banco de dados  pela matrícula ↑↑↑↑↑↑↑↑↑↑↑
        //dao.atualizarNota(1, 9.5);

        for (Alunos aluno : dao.listarTodos()) {
            aluno.imprimir();
        }
// função que lista todos os alunos no banco de dados ↑↑↑↑↑↑↑↑↑↑↑


        System.out.println("FUNCIONANDO");
    }
}