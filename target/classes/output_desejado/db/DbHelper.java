package br.com.superprof.db;

public class DbHelper extends DatabaseHelper
{
	public static final int DATABASE_VERSION = 10;
	public static final String DATABASE_NAME = "superprof.db";
	//public static AlunosDB alunosDB;

	private static String[] parametrosAmbienteProducao = {
			//"ARGS.ONE", "01"
	};

	private static String[] parametrosAmbienteDesenvolvimento = {
			//"ARGS.UM", "01"
	};

	public boolean open()
	{
		if (!open(DATABASE_NAME, DATABASE_VERSION))
			return false;

		setReferentialIntegrity(true);
		setDefaultCacheSize(0);

		return true;
	}

	@Override
	public void onDatabaseCreate()
	{
		String sql;
		SQLiteQuery query = new SQLiteQuery(connection);

		/**
		* CRIACAO DA TABLE DE ALUNOS
		*/
		sql = "CREATE TABLE ALUNOS " +
				"(ID_CLIENTE INTEGER PRIMARY KEY AUTOINCREMENT, " +
				"NOME_PAIS VARCHAR(255), " +
				"TELEFONE_PAIS VARCHAR(20), " +
				"EMAIL_PAIS VARCHAR(255), " +
				"IMAGEM_PAIS VARCHAR(255), " +
				"VALOR_HORA_AVULSA VARCHAR(10), " +
				"VALOR_PACOTE5 VARCHAR(10), " +
				"VALOR_PACOTE10 VARCHAR(10), " +
				"PACOTE_PRINCIPAL VARCHAR(50), " +
				"MODO_PAGAMENTO VARCHAR(50), " +
				"DATA_PREFERIDA_PAGAMENTO VARCHAR(25), " +
				"DATA_ACEITE_PEDIDO VARCHAR(25), " +
				"DATA_PRIMEIRO_CONTATO VARCHAR(25), " +
				"DATA_PRIMEIRA_AULA VARCHAR(25), " +
				"OBSERVACOES_PRIMEIRA_AULA VARCHAR(300), " +
				"NOME_ALUNO VARCHAR(255) NOT NULL, " +
				"IDADE_ALUNO VARCHAR(10), " +
				"SERIE_ANO VARCHAR(50), " +
				"TURNO_ALUNO VARCHAR(50), " +
				"TELEFONE_ALUNO VARCHAR(20), " +
				"EMAIL_ALUNO VARCHAR(255), " +
				"IMAGEM_ALUNO VARCHAR(255), " +
				"DISCIPLINA VARCHAR(100), " +
				"DATA_PRIMEIRA_PROVA VARCHAR(20), " +
				"CONTEUDO_PRIMEIRA_PROVA VARCHAR(200), " +
				"NOTA_PRIMEIRA_PROVA VARCHAR(10), " +
				"DATA_SEGUNDA_PROVA VARCHAR(20), " +
				"CONTEUDO_SEGUNDA_PROVA VARCHAR(200), " +
				"NOTA_SEGUNDA_PROVA VARCHAR(10), " +
				"DATA_TERCEIRA_PROVA VARCHAR(20), " +
				"CONTEUDO_TERCEIRA_PROVA VARCHAR(200), " +
				"NOTA_TERCEIRA_PROVA VARCHAR(10), " +
				"DATA_QUARTA_PROVA VARCHAR(20), " +
				"CONTEUDO_QUARTA_PROVA VARCHAR(200), " +
				"NOTA_QUARTA_PROVA VARCHAR(10), " +
				"DATA_RECUPERACAO_PROVA VARCHAR(20), " +
				"CONTEUDO_RECUPERACAO_PROVA VARCHAR(200), " +
				"NOTA_RECUPERACAO_PROVA VARCHAR(10), " +
				"DISPOSITIVO_ASSISTIR_AULA VARCHAR(40), " +
				"POSSUI_IMPRESSORA VARCHAR(30), " +
				"NECESSIDADES_ESPECIAIS VARCHAR(50), " +
				"MOTIVO_AULAS VARCHAR(100), " +
				"CONTATO_MARCACAO VARCHAR(100), " +
				"FORMA_PASSAR_LINK VARCHAR(100))";
		new SQLiteQuery(connection, sql).execute();

		/**
		* CRIACAO DA TABLE DE AULAS
		*/
		

		/**
		* CRIACAO DA TABLE DE PAGAMENTOS
		*/
		
		
		/**
		* CRIACAO DA TABLE DE LISTAS
		*/


		//for (int iDefault = 0; iDefault < defaults.length; iDefault += 2)
		//{
		//	sql = "INSERT INTO MODPAGTO_CONFIGURACOES " +
		//			"(NOME,VALOR) VALUES (:nome,:valor)";
		//	query = new SQLiteQuery(connection, sql);
		//	query.bindByName(":nome").setValue(defaults[iDefault]);
		//	query.bindByName(":valor").setValue(defaults[iDefault + 1]);
		//	query.execute();
		//}

        sql = "PRAGMA USER_VERSION="+Convert.toString(DATABASE_VERSION);
        new SQLiteQuery(connection, sql).execute();
    }

	public void configurarAmbienteDesenvolvimento()
	{
		/*
		//for (int iDefault = 0; iDefault < parametrosAmbienteDesenvolvimento.length; iDefault += 2)
		//{
		//	String sql = "UPDATE MODPAGTO_CONFIGURACOES " +
		//			"SET VALOR=:valor " +
		//			"WHERE NOME=:nome ";
		//	SQLiteQuery query = new SQLiteQuery(connection, sql);
		//	query.bindByName(":nome").setValue(parametrosAmbienteDesenvolvimento[iDefault]);
		//	query.bindByName(":valor").setValue(parametrosAmbienteDesenvolvimento[iDefault + 1]);
		//	query.execute();
		//}
		*/
	}

	@Override
	public void onDatabaseUpgrade(int oldVersion, int newVersion)
	{
		//String sql;
		return;
	}

	public void vacuum()
	{
		String sql = "vacuum";
		new SQLiteQuery(connection, sql).execute();
	}
}
