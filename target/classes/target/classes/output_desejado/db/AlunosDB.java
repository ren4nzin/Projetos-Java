package br.com.superprof.db;

/**
 * To-do ajustar esses comentarios
 * Para se basear, usar o AutorizacoesDB
 * Armazenamento e relação das ...
 */
public class AlunosDB implements Alunos
{
    public SQLiteConnection db;

    private SQLiteQuery queryEnumerador = null;

    public AlunosDB(SQLiteConnection dataBase)
    {
    	this.db = dataBase;
    }

    /** Preparacoes da tabela ALUNO -caso ela nao exista- antes do uso no programa (e.g. criacao de tabelas, setar parametros, etc). */
    @Override
    public void setup()
    {
    	
    }

    /** Metodo que insere um novo registro de aluno na tabela ALUNOS */
    @Override
    public void adicionar(Aluno aluno)
    {
        try
        {
			String insertSql = "INSERT INTO ALUNOS (" +
								"NOME_PAIS, TELEFONE_PAIS, EMAIL_PAIS, IMAGEM_PAIS, " +
								"VALOR_HORA_AVULSA, VALOR_PACOTE5, VALOR_PACOTE10, PACOTE_PRINCIPAL, MODO_PAGAMENTO, " +
								"DATA_PREFERIDA_PAGAMENTO, DATA_ACEITE_PEDIDO, DATA_PRIMEIRO_CONTATO, DATA_PRIMEIRA_AULA, " +
								"OBSERVACOES_PRIMEIRA_AULA, NOME_ALUNO, IDADE_ALUNO, SERIE_ANO, TURNO_ALUNO, TELEFONE_ALUNO, " +
								"EMAIL_ALUNO, IMAGEM_ALUNO, DISCIPLINA, " +
								"DATA_PRIMEIRA_PROVA, CONTEUDO_PRIMEIRA_PROVA, NOTA_PRIMEIRA_PROVA, DATA_SEGUNDA_PROVA, CONTEUDO_SEGUNDA_PROVA, NOTA_SEGUNDA_PROVA, " +
								"DATA_TERCEIRA_PROVA, CONTEUDO_TERCEIRA_PROVA, NOTA_TERCEIRA_PROVA, DATA_QUARTA_PROVA, CONTEUDO_QUARTA_PROVA, NOTA_QUARTA_PROVA, " +
								"DATA_RECUPERACAO_PROVA, CONTEUDO_RECUPERACAO_PROVA, NOTA_RECUPERACAO_PROVA, DISPOSITIVO_ASSISTIR_AULA, POSSUI_IMPRESSORA, " +
								"NECESSIDADES_ESPECIAIS, MOTIVO_AULAS, CONTATO_MARCACAO, FORMA_PASSAR_LINK) " +
								"VALUES (" +
								":nomePais, :telefonePais, :emailPais, :imagemPais, " +
								":valorHoraAvulsa, :valorPacote5, :valorPacote10, :pacotePrincipal, :modoPagamento, " +
								":dataPreferidaPagamento, :dataAceitePedido, :dataPrimeiroContato, :dataPrimeiraAula, " +
								":observacoesPrimeiraAula, :nomeAluno, :idadeAluno, :serieAno, :turnoAluno, :telefoneAluno, " +
								":emailAluno, :imagemAluno, :disciplina, " +
								":dataPrimeiraProva, :conteudoPrimeiraProva, :notaPrimeiraProva, " +
								":dataSegundaProva, :conteudoSegundaProva, :notaSegundaProva, " +
								":dataTerceiraProva, :conteudoTerceiraProva, :notaTerceiraProva, " +
								":dataQuartaProva, :conteudoQuartaProva, :notaQuartaProva, " +
								":dataRecuperacaoProva, :conteudoRecuperacaoProva, :notaRecuperacaoProva, " +
								":dispositivoAssistirAula, :possuiImpressora, " +
								":necessidadesEspeciais, :motivoAulas, :contatoMarcacao, :formaPassarLink" +
								")";
			SQLiteQuery query = new SQLiteQuery(db, insertSql);
            query.bindByName(":nomePais").setValue(aluno.nome_pais);
			query.bindByName(":telefonePais").setValue(aluno.telefone_pais);
			query.bindByName(":emailPais").setValue(aluno.email_pais);
			query.bindByName(":imagemPais").setValue(aluno.imagem_pais);
			query.bindByName(":valorHoraAvulsa").setValue(aluno.valor_hora_avulsa);
			query.bindByName(":valorPacote5").setValue(aluno.valor_pacote5);
			query.bindByName(":valorPacote10").setValue(aluno.valor_pacote10);
			query.bindByName(":pacotePrincipal").setValue(aluno.pacote_principal);
			query.bindByName(":modoPagamento").setValue(aluno.modo_pagamento);
			query.bindByName(":dataPreferidaPagamento").setValue(new Time().toString("Y-m-d"));
			query.bindByName(":dataAceitePedido").setValue(new Time().toString("Y-m-d"));
			query.bindByName(":dataPrimeiroContato").setValue(new Time().toString("Y-m-d"));
			query.bindByName(":dataPrimeiraAula").setValue(new Time().toString("Y-m-d H:i:s"));
			query.bindByName(":observacoesPrimeiraAula").setValue(aluno.observacoes_primeira_aula);
			query.bindByName(":nomeAluno").setValue(aluno.nome_aluno);
			query.bindByName(":idadeAluno").setValue(aluno.idade_aluno);
			query.bindByName(":serieAno").setValue(aluno.serie_ano);
			query.bindByName(":turnoAluno").setValue(aluno.turno_aluno);
			query.bindByName(":telefoneAluno").setValue(aluno.telefone_aluno);
			query.bindByName(":emailAluno").setValue(aluno.email_aluno);
			query.bindByName(":imagemAluno").setValue(aluno.imagem_aluno);
			query.bindByName(":disciplina").setValue(aluno.disciplina);
			query.bindByName(":possuiImpressora").setValue(aluno.data_primeira_prova);
			query.bindByName(":dispositivoAssistirAula").setValue(aluno.conteudo_primeira_prova);
			query.bindByName(":notaRecuperacaoProva").setValue(aluno.nota_primeira_prova);
			query.bindByName(":conteudoRecuperacaoProva").setValue(aluno.data_segunda_prova);
			query.bindByName(":dataRecuperacaoProva").setValue(aluno.conteudo_segunda_prova);
			query.bindByName(":notaQuartaProva").setValue(aluno.nota_segunda_prova);
			query.bindByName(":conteudoQuartaProva").setValue(aluno.data_terceira_prova);
			query.bindByName(":dataQuartaProva").setValue(aluno.conteudo_terceira_prova);
			query.bindByName(":notaTerceiraProva").setValue(aluno.nota_terceira_prova);
			query.bindByName(":conteudoTerceiraProva").setValue(aluno.data_quarta_prova);
			query.bindByName(":dataTerceiraProva").setValue(aluno.conteudo_quarta_prova);
			query.bindByName(":notaSegundaProva").setValue(aluno.nota_quarta_prova);
			query.bindByName(":conteudoSegundaProva").setValue(aluno.data_recuperacao_prova);
			query.bindByName(":dataSegundaProva").setValue(aluno.conteudo_recuperacao_prova);
			query.bindByName(":notaPrimeiraProva").setValue(aluno.nota_recuperacao_prova);
			query.bindByName(":conteudoPrimeiraProva").setValue(aluno.dispositivo_assistir_aula);
			query.bindByName(":dataPrimeiraProva").setValue(aluno.possui_impressora);
			query.bindByName(":necessidadesEspeciais").setValue(aluno.necessidades_especiais);
			query.bindByName(":motivoAulas").setValue(aluno.motivo_aulas);
			query.bindByName(":contatoMarcacao").setValue(aluno.contato_marcacao);
			query.bindByName(":formaPassarLink").setValue(aluno.forma_passar_link);
            query.execute();
        }
        catch (SQLiteException e)
        {
            //Vm.debugLog("Falha salvando transação " + aluno.chaveAcesso + ":" + e.getMessage());
            e.printStackTrace();
        }
    }

	/** Metodo que atualiza um registro da tabela ALUNOS para todos atributos do parametro aluno que nao forem nulos
	 * retorna true se a operação foi concluida com sucesso, ou false caso contrário */
	@Override
	public boolean atualizar(String nome_pais, Aluno aluno)
	{
		String sql = "";
		
		//verifica se o que foi passado procede
		if ((nome_pais == null) || (nome_pais.equals("")) || (aluno == null))
			return false;
		
		try
        {
            sql += "UPDATE ALUNOS SET " +
                "NOME_PAIS=:nomePais, " +
                "TELEFONE_PAIS=:telefonePais, " +
                "EMAIL_PAIS=:emailPais, " +
                "IMAGEM_PAIS=:imagemPais, " +
                "VALOR_HORA_AVULSA=:valorHoraAvulsa, " +
                "VALOR_PACOTE5=:valorPacote5, " +
                "VALOR_PACOTE10=:valorPacote10, " +
                "PACOTE_PRINCIPAL=:pacotePrincipal, " +
                "MODO_PAGAMENTO=:modoPagamento, " +
                "DATA_PREFERIDA_PAGAMENTO=:dataPreferidaPagamento, " +
                "DATA_ACEITE_PEDIDO=:dataAceitePedido, " +
                "DATA_PRIMEIRO_CONTATO=:dataPrimeiroContato, " +
                "DATA_PRIMEIRA_AULA=:dataPrimeiraAula, " +
                "OBSERVACOES_PRIMEIRA_AULA=:observacoesPrimeiraAula, " +
                "NOME_ALUNO=:nomeAluno, " +
                "IDADE_ALUNO=:idadeAluno, " +
                "SERIE_ANO=:serieAno, " +
                "TURNO_ALUNO=:turnoAluno, " +
                "TELEFONE_ALUNO=:telefoneAluno, " +
                "EMAIL_ALUNO=:emailAluno, " +
                "IMAGEM_ALUNO=:imagemAluno, " +
                "DISCIPLINA=:disciplina, " +
                "DATA_PRIMEIRA_PROVA=:dataPrimeiraProva, " +
                "CONTEUDO_PRIMEIRA_PROVA=:conteudoPrimeiraProva, " +
                "NOTA_PRIMEIRA_PROVA=:notaPrimeiraProva, " +
                "DATA_SEGUNDA_PROVA=:dataSegundaProva, " +
                "CONTEUDO_SEGUNDA_PROVA=:conteudoSegundaProva, " +
                "NOTA_SEGUNDA_PROVA=:notaSegundaProva, " +
                "DATA_TERCEIRA_PROVA=:dataTerceiraProva, " +
                "CONTEUDO_TERCEIRA_PROVA=:conteudoTerceiraProva, " +
                "NOTA_TERCEIRA_PROVA=:notaTerceiraProva, " +
                "DATA_QUARTA_PROVA=:dataQuartaProva, " +
                "CONTEUDO_QUARTA_PROVA=:conteudoQuartaProva, " +
                "NOTA_QUARTA_PROVA=:notaQuartaProva, " +
                "DATA_RECUPERACAO_PROVA=:dataRecuperacaoProva, " +
                "CONTEUDO_RECUPERACAO_PROVA=:conteudoRecuperacaoProva, " +
                "NOTA_RECUPERACAO_PROVA=:notaRecuperacaoProva, " +
                "DISPOSITIVO_ASSISTIR_AULA=:dispositivoAssistirAula, " +
                "POSSUI_IMPRESSORA=:possuiImpressora, " +
                "NECESSIDADES_ESPECIAIS=:necessidadesEspeciais, " +
                "MOTIVO_AULAS=:motivoAulas, " +
                "CONTATO_MARCACAO=:contatoMarcacao, " +
                "FORMA_PASSAR_LINK=:formaPassarLink " +
                "WHERE NOME_PAIS=:nomePais";
            SQLiteQuery query = new SQLiteQuery(db, sql);
            query.bindByName(":nomePais").setValue(nome_pais);
			if (aluno.telefone_pais != null)
				query.bindByName(":telefonePais").setValue(aluno.telefone_pais);
			if (aluno.email_pais != null)
				query.bindByName(":emailPais").setValue(aluno.email_pais);
			if (aluno.imagem_pais != null)
				query.bindByName(":imagemPais").setValue(aluno.imagem_pais);
			if (aluno.valor_hora_avulsa != null)
				query.bindByName(":valorHoraAvulsa").setValue(aluno.valor_hora_avulsa);
			if (aluno.valor_pacote5 != null)
				query.bindByName(":valorPacote5").setValue(aluno.valor_pacote5);
			if (aluno.valor_pacote10 != null)
				query.bindByName(":valorPacote10").setValue(aluno.valor_pacote10);
			if (aluno.pacote_principal != null)
				query.bindByName(":pacotePrincipal").setValue(aluno.pacote_principal);
			if (aluno.modo_pagamento != null)
				query.bindByName(":modoPagamento").setValue(aluno.modo_pagamento);
			if (aluno.data_preferida_pagamento != null)
				query.bindByName(":dataPreferidaPagamento").setValue(aluno.data_preferida_pagamento);
			if (aluno.data_aceite_pedido != null)
				query.bindByName(":dataAceitePedido").setValue(aluno.data_aceite_pedido);
			if (aluno.data_primeiro_contato != null)
				query.bindByName(":dataPrimeiroContato").setValue(aluno.data_primeiro_contato);
			if (aluno.data_primeira_aula != null)
				query.bindByName(":dataPrimeiraAula").setValue(aluno.data_primeira_aula);
			if (aluno.observacoes_primeira_aula != null)
				query.bindByName(":observacoesPrimeiraAula").setValue(aluno.observacoes_primeira_aula);
			if (aluno.nome_aluno != null)
				query.bindByName(":nomeAluno").setValue(aluno.nome_aluno);
			if (aluno.idade_aluno != null)
				query.bindByName(":idadeAluno").setValue(aluno.idade_aluno);
			if (aluno.serie_ano != null)
				query.bindByName(":serieAno").setValue(aluno.serie_ano);
			if (aluno.turno_aluno != null)
				query.bindByName(":turnoAluno").setValue(aluno.turno_aluno);
			if (aluno.telefone_aluno != null)
				query.bindByName(":telefoneAluno").setValue(aluno.telefone_aluno);
			if (aluno.email_aluno != null)
				query.bindByName(":emailAluno").setValue(aluno.email_aluno);
			if (aluno.imagem_aluno != null)
				query.bindByName(":imagemAluno").setValue(aluno.imagem_aluno);
			if (aluno.disciplina != null)
				query.bindByName(":disciplina").setValue(aluno.disciplina);
			if (aluno.data_primeira_prova != null)
				query.bindByName(":dataPrimeiraProva").setValue(aluno.data_primeira_prova);
			if (aluno.conteudo_primeira_prova != null)
				query.bindByName(":conteudoPrimeiraProva").setValue(aluno.conteudo_primeira_prova);
			if (aluno.nota_primeira_prova != null)
				query.bindByName(":notaPrimeiraProva").setValue(aluno.nota_primeira_prova);
			if (aluno.data_segunda_prova != null)
				query.bindByName(":dataSegundaProva").setValue(aluno.data_segunda_prova);
			if (aluno.conteudo_segunda_prova != null)
				query.bindByName(":conteudoSegundaProva").setValue(aluno.conteudo_segunda_prova);
			if (aluno.nota_segunda_prova != null)
				query.bindByName(":notaSegundaProva").setValue(aluno.nota_segunda_prova);
			if (aluno.data_terceira_prova != null)
				query.bindByName(":dataTerceiraProva").setValue(aluno.data_terceira_prova);
			if (aluno.conteudo_terceira_prova != null)
				query.bindByName(":conteudoTerceiraProva").setValue(aluno.conteudo_terceira_prova);
			if (aluno.nota_terceira_prova != null)
				query.bindByName(":notaTerceiraProva").setValue(aluno.nota_terceira_prova);
			if (aluno.data_quarta_prova != null)
				query.bindByName(":dataQuartaProva").setValue(aluno.data_quarta_prova);
			if (aluno.conteudo_quarta_prova != null)
				query.bindByName(":conteudoQuartaProva").setValue(aluno.conteudo_quarta_prova);
			if (aluno.nota_quarta_prova != null)
				query.bindByName(":notaQuartaProva").setValue(aluno.nota_quarta_prova);
			if (aluno.data_recuperacao_prova != null)
				query.bindByName(":dataRecuperacaoProva").setValue(aluno.data_recuperacao_prova);
			if (aluno.conteudo_recuperacao_prova != null)
				query.bindByName(":conteudoRecuperacaoProva").setValue(aluno.conteudo_recuperacao_prova);
			if (aluno.nota_recuperacao_prova != null)
				query.bindByName(":notaRecuperacaoProva").setValue(aluno.nota_recuperacao_prova);
			if (aluno.dispositivo_assistir_aula != null)
				query.bindByName(":dispositivoAssistirAula").setValue(aluno.dispositivo_assistir_aula);
			if (aluno.possui_impressora != null)
				query.bindByName(":possuiImpressora").setValue(aluno.possui_impressora);
			if (aluno.necessidades_especiais != null)
				query.bindByName(":necessidadesEspeciais").setValue(aluno.necessidades_especiais);
			if (aluno.motivo_aulas != null)
				query.bindByName(":motivoAulas").setValue(aluno.motivo_aulas);
			if (aluno.contato_marcacao != null)
				query.bindByName(":contatoMarcacao").setValue(aluno.contato_marcacao);
			if (aluno.forma_passar_link != null)
				query.bindByName(":formaPassarLink").setValue(aluno.forma_passar_link);
            query.execute();
        }
        catch (SQLiteException e)
        {
            Vm.debugLog("Falha ao atualizar registro do pai/mae " + nome_pais + ":" + e.getMessage());
            e.printStackTrace();
			return false;
        }
		return true;
	}

	/** Metodo que roda um select * de ALUNOS e retorna um Vector povoado de instancias de Aluno */
	@Override
	public Vector<Aluno> obterTodos()
	{
		Vector<Aluno> alunos = new Vector<Aluno>();
		
		try
        {
            String sql = "SELECT * FROM ALUNOS";
            SQLiteQuery query = new SQLiteQuery(db, sql);
            query.open();

            if (!query.eof())
            {
                alunos.add(new Aluno(query.columnByName("ID_CLIENTE").getInteger(),
									query.columnByName("NOME_PAIS").getText(),
									query.columnByName("TELEFONE_PAIS").getText(),
									query.columnByName("EMAIL_PAIS").getText(),
									query.columnByName("IMAGEM_PAIS").getText(),
									query.columnByName("VALOR_HORA_AVULSA").getText(),
									query.columnByName("VALOR_PACOTE5").getText(),
									query.columnByName("VALOR_PACOTE10").getText(),
									query.columnByName("PACOTE_PRINCIPAL").getText(),
									query.columnByName("MODO_PAGAMENTO").getText(),
									query.columnByName("DATA_PREFERIDA_PAGAMENTO").getText(),
									query.columnByName("DATA_ACEITE_PEDIDO").getText(),
									query.columnByName("DATA_PRIMEIRO_CONTATO").getText(),
									query.columnByName("DATA_PRIMEIRA_AULA").getText(),
									query.columnByName("OBSERVACOES_PRIMEIRA_AULA").getText(),
									query.columnByName("NOME_ALUNO").getText(),
									query.columnByName("IDADE_ALUNO").getText(),
									query.columnByName("SERIE_ANO").getText(),
									query.columnByName("TURNO_ALUNO").getText(),
									query.columnByName("TELEFONE_ALUNO").getText(),
									query.columnByName("EMAIL_ALUNO").getText(),
									query.columnByName("IMAGEM_ALUNO").getText(),
									query.columnByName("DISCIPLINA").getText(),
									query.columnByName("DATA_PRIMEIRA_PROVA").getText(),
									query.columnByName("CONTEUDO_PRIMEIRA_PROVA").getText(),
									query.columnByName("NOTA_PRIMEIRA_PROVA").getText(),
									query.columnByName("DATA_SEGUNDA_PROVA").getText(),
									query.columnByName("CONTEUDO_SEGUNDA_PROVA").getText(),
									query.columnByName("NOTA_SEGUNDA_PROVA").getText(),
									query.columnByName("DATA_TERCEIRA_PROVA").getText(),
									query.columnByName("CONTEUDO_TERCEIRA_PROVA").getText(),
									query.columnByName("NOTA_TERCEIRA_PROVA").getText(),
									query.columnByName("DATA_QUARTA_PROVA").getText(),
									query.columnByName("CONTEUDO_QUARTA_PROVA").getText(),
									query.columnByName("NOTA_QUARTA_PROVA").getText(),
									query.columnByName("DATA_RECUPERACAO_PROVA").getText(),
									query.columnByName("CONTEUDO_RECUPERACAO_PROVA").getText(),
									query.columnByName("NOTA_RECUPERACAO_PROVA").getText(),
									query.columnByName("DISPOSITIVO_ASSISTIR_AULA").getText(),
									query.columnByName("POSSUI_IMPRESSORA").getText(),
									query.columnByName("NECESSIDADES_ESPECIAIS").getText(),
									query.columnByName("MOTIVO_AULAS").getText(),
									query.columnByName("CONTATO_MARCACAO").getText(),
									query.columnByName("FORMA_PASSAR_LINK").getText()
									));
            }
            query.close();
        }
        catch (SQLiteException e)
        {
            Vm.debugLog("Falha em obterTodos para aluno:" + e.getMessage());
            e.printStackTrace();
			return null;
        }
		return alunos;
	}
	
    /** Busca e devolve o registro Aluno aluno completo identificado pelo nome do responsavel ou null caso não seja localizada */
    @Override
    public Aluno obter(String nome_pais)
    {
        Aluno aluno = null;
		
		if ((nome_pais == null) || (nome_pais.equals("")))
			return null;

        try
        {
            String sql = "SELECT * " +
                "FROM ALUNOS " +
                "WHERE NOME_PAIS=:nomePais ";
            SQLiteQuery query = new SQLiteQuery(db, sql);
            query.bindByName(":nomePais").setValue(nome_pais);
            query.open();

            if (!query.eof())
            {
                aluno = new Aluno(query.columnByName("ID_CLIENTE").getInteger(),
									query.columnByName("NOME_PAIS").getText(),
									query.columnByName("TELEFONE_PAIS").getText(),
									query.columnByName("EMAIL_PAIS").getText(),
									query.columnByName("IMAGEM_PAIS").getText(),
									query.columnByName("VALOR_HORA_AVULSA").getText(),
									query.columnByName("VALOR_PACOTE5").getText(),
									query.columnByName("VALOR_PACOTE10").getText(),
									query.columnByName("PACOTE_PRINCIPAL").getText(),
									query.columnByName("MODO_PAGAMENTO").getText(),
									query.columnByName("DATA_PREFERIDA_PAGAMENTO").getText(),
									query.columnByName("DATA_ACEITE_PEDIDO").getText(),
									query.columnByName("DATA_PRIMEIRO_CONTATO").getText(),
									query.columnByName("DATA_PRIMEIRA_AULA").getText(),
									query.columnByName("OBSERVACOES_PRIMEIRA_AULA").getText(),
									query.columnByName("NOME_ALUNO").getText(),
									query.columnByName("IDADE_ALUNO").getText(),
									query.columnByName("SERIE_ANO").getText(),
									query.columnByName("TURNO_ALUNO").getText(),
									query.columnByName("TELEFONE_ALUNO").getText(),
									query.columnByName("EMAIL_ALUNO").getText(),
									query.columnByName("IMAGEM_ALUNO").getText(),
									query.columnByName("DISCIPLINA").getText(),
									query.columnByName("DATA_PRIMEIRA_PROVA").getText(),
									query.columnByName("CONTEUDO_PRIMEIRA_PROVA").getText(),
									query.columnByName("NOTA_PRIMEIRA_PROVA").getText(),
									query.columnByName("DATA_SEGUNDA_PROVA").getText(),
									query.columnByName("CONTEUDO_SEGUNDA_PROVA").getText(),
									query.columnByName("NOTA_SEGUNDA_PROVA").getText(),
									query.columnByName("DATA_TERCEIRA_PROVA").getText(),
									query.columnByName("CONTEUDO_TERCEIRA_PROVA").getText(),
									query.columnByName("NOTA_TERCEIRA_PROVA").getText(),
									query.columnByName("DATA_QUARTA_PROVA").getText(),
									query.columnByName("CONTEUDO_QUARTA_PROVA").getText(),
									query.columnByName("NOTA_QUARTA_PROVA").getText(),
									query.columnByName("DATA_RECUPERACAO_PROVA").getText(),
									query.columnByName("CONTEUDO_RECUPERACAO_PROVA").getText(),
									query.columnByName("NOTA_RECUPERACAO_PROVA").getText(),
									query.columnByName("DISPOSITIVO_ASSISTIR_AULA").getText(),
									query.columnByName("POSSUI_IMPRESSORA").getText(),
									query.columnByName("NECESSIDADES_ESPECIAIS").getText(),
									query.columnByName("MOTIVO_AULAS").getText(),
									query.columnByName("CONTATO_MARCACAO").getText(),
									query.columnByName("FORMA_PASSAR_LINK").getText()
									);
            }
            query.close();
        }
        catch (SQLiteException e)
        {
            Vm.debugLog("Falha recuperando registro aluno de pai com nome " + nome_pais + ":" + e.getMessage());
            e.printStackTrace();
			return null;
        }
        return aluno;
    }

    /** Inicia a lista de todos alunos para tambem inicializar a queryEnumerador, retornando a primeira instancia de aluno ou null se não existir nenhum */
    @Override
    public Aluno enumerarPrimeiro()
    {
        Aluno aluno = null;
		
		try
        {
            if (queryEnumerador != null)
            {
                queryEnumerador.close();
                queryEnumerador = null;
            }

            String sql = "SELECT * FROM ALUNOS";
            queryEnumerador = new SQLiteQuery(db, sql);
            queryEnumerador.open();

            if (!queryEnumerador.eof())
            {
                aluno = new Aluno(queryEnumerador.columnByName("ID_CLIENTE").getInteger(),
							queryEnumerador.columnByName("NOME_PAIS").getText(),
							queryEnumerador.columnByName("TELEFONE_PAIS").getText(),
							queryEnumerador.columnByName("EMAIL_PAIS").getText(),
							queryEnumerador.columnByName("IMAGEM_PAIS").getText(),
							queryEnumerador.columnByName("VALOR_HORA_AVULSA").getText(),
							queryEnumerador.columnByName("VALOR_PACOTE5").getText(),
							queryEnumerador.columnByName("VALOR_PACOTE10").getText(),
							queryEnumerador.columnByName("PACOTE_PRINCIPAL").getText(),
							queryEnumerador.columnByName("MODO_PAGAMENTO").getText(),
							queryEnumerador.columnByName("DATA_PREFERIDA_PAGAMENTO").getText(),
							queryEnumerador.columnByName("DATA_ACEITE_PEDIDO").getText(),
							queryEnumerador.columnByName("DATA_PRIMEIRO_CONTATO").getText(),
							queryEnumerador.columnByName("DATA_PRIMEIRA_AULA").getText(),
							queryEnumerador.columnByName("OBSERVACOES_PRIMEIRA_AULA").getText(),
							queryEnumerador.columnByName("NOME_ALUNO").getText(),
							queryEnumerador.columnByName("IDADE_ALUNO").getText(),
							queryEnumerador.columnByName("SERIE_ANO").getText(),
							queryEnumerador.columnByName("TURNO_ALUNO").getText(),
							queryEnumerador.columnByName("TELEFONE_ALUNO").getText(),
							queryEnumerador.columnByName("EMAIL_ALUNO").getText(),
							queryEnumerador.columnByName("IMAGEM_ALUNO").getText(),
							queryEnumerador.columnByName("DISCIPLINA").getText(),
							queryEnumerador.columnByName("DATA_PRIMEIRA_PROVA").getText(),
							queryEnumerador.columnByName("CONTEUDO_PRIMEIRA_PROVA").getText(),
							queryEnumerador.columnByName("NOTA_PRIMEIRA_PROVA").getText(),
							queryEnumerador.columnByName("DATA_SEGUNDA_PROVA").getText(),
							queryEnumerador.columnByName("CONTEUDO_SEGUNDA_PROVA").getText(),
							queryEnumerador.columnByName("NOTA_SEGUNDA_PROVA").getText(),
							queryEnumerador.columnByName("DATA_TERCEIRA_PROVA").getText(),
							queryEnumerador.columnByName("CONTEUDO_TERCEIRA_PROVA").getText(),
							queryEnumerador.columnByName("NOTA_TERCEIRA_PROVA").getText(),
							queryEnumerador.columnByName("DATA_QUARTA_PROVA").getText(),
							queryEnumerador.columnByName("CONTEUDO_QUARTA_PROVA").getText(),
							queryEnumerador.columnByName("NOTA_QUARTA_PROVA").getText(),
							queryEnumerador.columnByName("DATA_RECUPERACAO_PROVA").getText(),
							queryEnumerador.columnByName("CONTEUDO_RECUPERACAO_PROVA").getText(),
							queryEnumerador.columnByName("NOTA_RECUPERACAO_PROVA").getText(),
							queryEnumerador.columnByName("DISPOSITIVO_ASSISTIR_AULA").getText(),
							queryEnumerador.columnByName("POSSUI_IMPRESSORA").getText(),
							queryEnumerador.columnByName("NECESSIDADES_ESPECIAIS").getText(),
							queryEnumerador.columnByName("MOTIVO_AULAS").getText(),
							queryEnumerador.columnByName("CONTATO_MARCACAO").getText(),
							queryEnumerador.columnByName("FORMA_PASSAR_LINK").getText()
							);
            }
            else
            {
                queryEnumerador.close();
                queryEnumerador = null;
				return null;
            }
        }
        catch (SQLiteException e)
        {
            Vm.debugLog("Falha recuperando primeiro registro aluno:" + e.getMessage());
            e.printStackTrace();
			return null;
        }
        return aluno;
    }

	/** Recupera o próximo aluno contido na queryEnumerador e retorna a instancia desse Aluno aluno, ou retorna null se não existir mais nenhum */
	@Override
	public Aluno enumerarProximo()
	{
		Aluno aluno = null;
		
		try
		{
			if (queryEnumerador == null)
				return null;
			
			queryEnumerador.next();
			
			if (!queryEnumerador.eof())
			{
				aluno = new Aluno(queryEnumerador.columnByName("ID_CLIENTE").getInteger(),
							queryEnumerador.columnByName("NOME_PAIS").getText(),
							queryEnumerador.columnByName("TELEFONE_PAIS").getText(),
							queryEnumerador.columnByName("EMAIL_PAIS").getText(),
							queryEnumerador.columnByName("IMAGEM_PAIS").getText(),
							queryEnumerador.columnByName("VALOR_HORA_AVULSA").getText(),
							queryEnumerador.columnByName("VALOR_PACOTE5").getText(),
							queryEnumerador.columnByName("VALOR_PACOTE10").getText(),
							queryEnumerador.columnByName("PACOTE_PRINCIPAL").getText(),
							queryEnumerador.columnByName("MODO_PAGAMENTO").getText(),
							queryEnumerador.columnByName("DATA_PREFERIDA_PAGAMENTO").getText(),
							queryEnumerador.columnByName("DATA_ACEITE_PEDIDO").getText(),
							queryEnumerador.columnByName("DATA_PRIMEIRO_CONTATO").getText(),
							queryEnumerador.columnByName("DATA_PRIMEIRA_AULA").getText(),
							queryEnumerador.columnByName("OBSERVACOES_PRIMEIRA_AULA").getText(),
							queryEnumerador.columnByName("NOME_ALUNO").getText(),
							queryEnumerador.columnByName("IDADE_ALUNO").getText(),
							queryEnumerador.columnByName("SERIE_ANO").getText(),
							queryEnumerador.columnByName("TURNO_ALUNO").getText(),
							queryEnumerador.columnByName("TELEFONE_ALUNO").getText(),
							queryEnumerador.columnByName("EMAIL_ALUNO").getText(),
							queryEnumerador.columnByName("IMAGEM_ALUNO").getText(),
							queryEnumerador.columnByName("DISCIPLINA").getText(),
							queryEnumerador.columnByName("DATA_PRIMEIRA_PROVA").getText(),
							queryEnumerador.columnByName("CONTEUDO_PRIMEIRA_PROVA").getText(),
							queryEnumerador.columnByName("NOTA_PRIMEIRA_PROVA").getText(),
							queryEnumerador.columnByName("DATA_SEGUNDA_PROVA").getText(),
							queryEnumerador.columnByName("CONTEUDO_SEGUNDA_PROVA").getText(),
							queryEnumerador.columnByName("NOTA_SEGUNDA_PROVA").getText(),
							queryEnumerador.columnByName("DATA_TERCEIRA_PROVA").getText(),
							queryEnumerador.columnByName("CONTEUDO_TERCEIRA_PROVA").getText(),
							queryEnumerador.columnByName("NOTA_TERCEIRA_PROVA").getText(),
							queryEnumerador.columnByName("DATA_QUARTA_PROVA").getText(),
							queryEnumerador.columnByName("CONTEUDO_QUARTA_PROVA").getText(),
							queryEnumerador.columnByName("NOTA_QUARTA_PROVA").getText(),
							queryEnumerador.columnByName("DATA_RECUPERACAO_PROVA").getText(),
							queryEnumerador.columnByName("CONTEUDO_RECUPERACAO_PROVA").getText(),
							queryEnumerador.columnByName("NOTA_RECUPERACAO_PROVA").getText(),
							queryEnumerador.columnByName("DISPOSITIVO_ASSISTIR_AULA").getText(),
							queryEnumerador.columnByName("POSSUI_IMPRESSORA").getText(),
							queryEnumerador.columnByName("NECESSIDADES_ESPECIAIS").getText(),
							queryEnumerador.columnByName("MOTIVO_AULAS").getText(),
							queryEnumerador.columnByName("CONTATO_MARCACAO").getText(),
							queryEnumerador.columnByName("FORMA_PASSAR_LINK").getText()
							);
			}
			else
			{
				queryEnumerador.close();
				queryEnumerador = null;
				return null;
			}
		}
		catch (SQLiteException e)
		{
			Vm.debugLog("Exceção enumerando transações:" + e.getMessage());
			e.printStackTrace();
			return null;
		}
		return aluno;
    }

    /** Finaliza a listagem de alunos */
    @Override
    public void enumerarConcluir()
    {
        if (queryEnumerador == null)
            return;

        try
        {
            if (queryEnumerador != null)
            {
                queryEnumerador.close();
                queryEnumerador = null;
            }
        }
        catch (SQLiteException e)
        {
            System.out.println("Falha concluindo fechamento de queryEnumerador:" + e.getMessage());
            e.printStackTrace();
        }
    }

    /** Exclui o registro identificado de aluno da tabela ALUNOS */
    @Override
    public void removerAntigos(String origem, int diasCorte)
    {
		/*try
        //{
        //    String sql = "DELETE FROM MODPAGTO_AUTORIZACOES " +
        //            "WHERE ORIGEM=:origem " +
        //            "AND DATA<DATE('now','-" + String.valueOf(diasCorte) + " day') ";
        //    SQLiteQuery query = new SQLiteQuery(db, sql);
        //    query.bindByName(":origem").setValue(origem);
        //    query.execute();
        //}
        //catch (SQLiteException e)
        //{
        //    Vm.debugLog("Falha removendo transações de " + origem + ":" + e.getMessage());
        //    e.printStackTrace();
        //}*/
    }

	/** Exclui os registros identificados de aluno da tabela ALUNOS */
    @Override
    public void limpar(String origem)
    {
		/*
        //try
        //{
        //    String sql = "DELETE FROM MODPAGTO_AUTORIZACOES " +
        //            "WHERE ORIGEM=:origem ";
        //    SQLiteQuery query = new SQLiteQuery(db, sql);
        //    query.bindByName(":origem").setValue(origem);
        //    query.execute();
        //}
        //catch (SQLiteException e)
        //{
        //    Vm.debugLog("Falha limpando autorizações de " + origem + ":" + e.getMessage());
        //    e.printStackTrace();
        //}
		*/
    }
}
