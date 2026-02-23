package br.com.educacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoSQLite {

    private static final String URL = "jdbc:sqlite:educacao.db";

    public static Connection conectar() {
        try {
            Class.forName("org.sqlite.JDBC"); // 👈 LINHA CRÍTICA
            return DriverManager.getConnection(URL);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao conectar ao SQLite", e);
        }
    }
}