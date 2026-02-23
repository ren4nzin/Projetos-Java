package br.com.educacao;

import java.sql.*;
import java.util.Vector;

public class AlunoDAO {

    // ===== CRIAR TABELA =====
    public void criarTabela() {

        String sql =
            "CREATE TABLE IF NOT EXISTS alunos (" +
            "matricula INTEGER PRIMARY KEY, " +
            "nome TEXT NOT NULL, " +
            "nota REAL" +
            ")";

        try (
            Connection conn = ConexaoSQLite.conectar();
            Statement stmt = conn.createStatement()
        ) {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ===== INSERT =====
    public void inserir(Alunos aluno) {

        String sql = "INSERT INTO alunos (matricula, nome, nota) VALUES (?, ?, ?)";

        try (
            Connection conn = ConexaoSQLite.conectar();
            PreparedStatement ps = conn.prepareStatement(sql)
        ) {

            ps.setInt(1, aluno.matricula);
            ps.setString(2, aluno.nome);
            ps.setDouble(3, aluno.notalunos);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ===== SELECT TODOS =====
    public Vector<Alunos> listarTodos() {

        Vector<Alunos> lista = new Vector<>();
        String sql = "SELECT * FROM alunos";

        try (
            Connection conn = ConexaoSQLite.conectar();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)
        ) {

            while (rs.next()) {
                lista.add(new Alunos(
                    rs.getInt("matricula"),
                    rs.getString("nome"),
                    rs.getDouble("nota")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    // ===== BUSCAR POR MATRÍCULA =====
    public Alunos buscarPorMatricula(int matricula) {

        String sql = "SELECT * FROM alunos WHERE matricula = ?";

        try (
            Connection conn = ConexaoSQLite.conectar();
            PreparedStatement ps = conn.prepareStatement(sql)
        ) {

            ps.setInt(1, matricula);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Alunos(
                    rs.getInt("matricula"),
                    rs.getString("nome"),
                    rs.getDouble("nota")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    // ===== UPDATE =====
    public void atualizarNota(int matricula, double novaNota) {

        String sql = "UPDATE alunos SET nota = ? WHERE matricula = ?";

        try (
            Connection conn = ConexaoSQLite.conectar();
            PreparedStatement ps = conn.prepareStatement(sql)
        ) {

            ps.setDouble(1, novaNota);
            ps.setInt(2, matricula);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ===== DELETE =====
    public void remover(int matricula) {

        String sql = "DELETE FROM alunos WHERE matricula = ?";

        try (
            Connection conn = ConexaoSQLite.conectar();
            PreparedStatement ps = conn.prepareStatement(sql)
        ) {

            ps.setInt(1, matricula);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}