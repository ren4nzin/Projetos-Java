package br.com.educacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProfessorDAO {
    
public void criarTabela() {

    String sql = "CREATE TABLE IF NOT EXISTS professores (" +
                 "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                 "nome TEXT," +
                 "salas TEXT," +
                 "horas REAL)";

    try (
        Connection conn = ConexaoSQLite.conectar();
        PreparedStatement ps = conn.prepareStatement(sql);
    ) {
        ps.execute();
    } catch (SQLException e) {
        throw new RuntimeException("Erro ao criar tabela professores", e);
    }
}
    public void inserir(Professores p) {

        String sql = "INSERT INTO professores (nome, salas, horas) VALUES (?, ?, ?)";

        try (
            Connection conn = ConexaoSQLite.conectar();
            PreparedStatement ps = conn.prepareStatement(sql);
        ) {

            ps.setString(1, p.nome);
            ps.setString(2, p.salas);
            ps.setDouble(3, p.horasTrabalhadas);

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir professor", e);
        }
    }
}