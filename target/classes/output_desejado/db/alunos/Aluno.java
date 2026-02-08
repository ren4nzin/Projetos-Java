package br.com.superprof.db.util.alunos;

public class Aluno
{
	public static final int ALUNOS_VERSION = 1;
	
	/** Vetor contendo uma quantidade qualquer de campos que devem ser armazenados */
    public TreeMap<String, String> campos;
	
	/** Identificador inteiro único do registro de pais e alunos na tabela ALUNOS da base superprof, serve para controle */
	public int id_cliente;
	
	/** Nome da mae ou pai responsavel do aluno, caso seja o proprio aluno, coincide com aluno */
	public String nome_pais;
	
	/** Telefone da mae/pai responsavel padrao 0XX XXXXX-XXXX */
	public String telefone_pais;
	
	/** Email da mae/pai responsavel */
	public String email_pais;
	
	/** Path da imagem do pai/mae responsavel para facilitar a recordacao de quem estou conversando */
	public String imagem_pais;
	
	/** Valor da hora avulsa combinado para responsavel em questao */
	public String valor_hora_avulsa;
	
	/** Valor do pacote de 5 aulas combinado para responsavel em questao */
	public String valor_pacote5;
	
	/** Valor do pacote de 10 aulas combinado para responsavel em questao */
	public String valor_pacote10;
	
	/** Pacote preferido do responsavel: avulso, 5 ou 10 */
	public String pacote_principal;
	
	/** Forma de pagamento combinada: pix, dinheiro, credito, ... */
	public String modo_pagamento;
	
	/** Data de todo mês acordada com o responsavel para realizacao de pagamentos de pacotes */
	public String data_preferida_pagamento;
	
	/** Data de aceite do pedido de aula na plataforma */
	public String data_aceite_pedido;
	
	/** Data e horario de primeiro contato do professor com responsavel */
	public String data_primeiro_contato;
	
	/** Data e horario da realizacao da primeira aula */
	public String data_primeira_aula;
	
	/** Observacoes referentes às percepções do professor quanto as qualidades e pontos a corrigir do aluno feitas na primeira aula */
	public String observacoes_primeira_aula;
	
	/** Nome do aluno */
	public String nome_aluno;
	
	/** Idade do aluno */
	public String idade_aluno;
	
	/** Serie do aluno: 4 ano fundamental, 2 serie medio, ... */
	public String serie_ano;
	
	/** Turno que o aluno estuda: matutino, vespertino, noturno, integral, ... */
	public String turno_aluno;
	
	/** Telefone do aluno, caso o responsável autorize a comunicação direta entre o mesmo e o professor por whats */
	public String telefone_aluno;
	
	/** Email do aluno, caso o responsavel autorize a comunicação por email (alguns alunos gostam de receber links de aula e listas de exercício por email) */
	public String email_aluno;
	
	/** Path da imagem do aluno a fim de facilitar a recordacao de quem terá a aula */
	public String imagem_aluno;
	
	/** Disciplina que o aluno estuda: matematica, fisica, portugues, historia, .... */
	public String disciplina;
	
	/** Data que foi ou será realizada a prova do primeiro bimestre do aluno */
	public String data_primeira_prova;
	
	/** Conteudo programado para cair na primeira prova */
	public String conteudo_primeira_prova;
	
	/** Nota obtida na primeira prova: 5/10 */
	public String nota_primeira_prova;
	
	/** Data que foi ou será realizada a prova do segundo bimestre do aluno */
	public String data_segunda_prova; 
	
	/** Conteudo programado para cair na segunda prova */
	public String conteudo_segunda_prova;
	
	/** Nota obtida na segunda prova: 5/10 */
	public String nota_segunda_prova;
	
	/** Data que foi ou será realizada a prova do terceiro bimestre do aluno */
	public String data_terceira_prova;
	
	/** Conteudo programado para cair na terceira prova */
	public String conteudo_terceira_prova;
	
	/** Nota obtida na Terceira prova: 5/10 */
	public String nota_terceira_prova;
	
	/** Data que foi ou será realizada a prova do quarto bimestre do aluno */
	public String data_quarta_prova; 
	
	/** Conteudo programado para cair na quarta prova */
	public String conteudo_quarta_prova;
	
	/** Nota obtida na quarta prova: 5/10 */
	public String nota_quarta_prova;
	
	/** Data que foi ou será realizada a prova de recuperacao */
	public String data_recuperacao_prova; 
	
	/** Conteudo programado para cair na prova de recuperacao */
	public String conteudo_recuperacao_prova;
	
	/** Nota obtida na prova de recuperacao: 5/10 */
	public String nota_recuperacao_prova;
	
	/** Faz menção a qual dispositivo o aluno utiliza para assisir às aulas: celular, tablet, computador, ou mais de um */
	public String dispositivo_assistir_aula;
	
	/** Diz se o aluno possui impressora ou não para impressão de listas */
	public String possui_impressora;
	
	/** Campo reservado para informações de se o aluno tem alguma condição que demande atenção: problema de vista, audição, autismo, TDAH, questão intlectual, ... */
	public String necessidades_especiais;
	
	/** Razão que motivou o responsavel a entrar em contato em busca da aula: ajudar em prova iminente, acompanhamento breve, acompanhamento longo prazo, trabalho pontual, ... */
	public String motivo_aulas;
	
	/** Com quem o professor deve entrar em contato para marcar a aula (pai, mae, tio, avó ou proprio aluno) */
	public String contato_marcacao;
	
	/** Maneira ou meio em que responsavel e/ou aluno preferem receber o link da aula */
	public String forma_passar_link;
	
	/** Construtor simples para incluir campos */
	public Aluno()
	{
		this.campos = new TreeMap<String, String>();
	}
	
	public Aluno(int id_cliente,
	               String nome_pais, String telefone_pais, String email_pais,
	               String imagem_pais, String valor_hora_avulsa, String valor_pacote5,
	               String valor_pacote10, String pacote_principal, String modo_pagamento,
	               String data_preferida_pagamento, String data_aceite_pedido, String data_primeiro_contato,
	               String data_primeira_aula, String observacoes_primeira_aula, String nome_aluno,
	               String idade_aluno, String serie_ano, String turno_aluno,
	               String telefone_aluno, String email_aluno, String imagem_aluno,
	               String disciplina, String data_primeira_prova, String conteudo_primeira_prova,
                   String nota_primeira_prova, String data_segunda_prova, String conteudo_segunda_prova,
                   String nota_segunda_prova, String data_terceira_prova, String conteudo_terceira_prova,
                   String nota_terceira_prova, String data_quarta_prova, String conteudo_quarta_prova,
                   String nota_quarta_prova, String data_recuperacao_prova, String conteudo_recuperacao_prova,
                   String nota_recuperacao_prova, String dispositivo_assistir_aula, String possui_impressora,
	               String necessidades_especiais, String motivo_aulas, String contato_marcacao,
	               String forma_passar_link)
	{
		this.id_cliente                 = id_cliente;
		this.nome_pais                  = nome_pais;
		this.telefone_pais              = telefone_pais;
		this.email_pais                 = email_pais;
		this.imagem_pais                = imagem_pais;
		this.valor_hora_avulsa          = valor_hora_avulsa;
		this.valor_pacote5              = valor_pacote5;
		this.valor_pacote10             = valor_pacote10;
		this.pacote_principal           = pacote_principal;
		this.modo_pagamento             = modo_pagamento;
		this.data_preferida_pagamento   = data_preferida_pagamento;
		this.data_aceite_pedido         = data_aceite_pedido;
		this.data_primeiro_contato      = data_primeiro_contato;
		this.data_primeira_aula         = data_primeira_aula;
		this.observacoes_primeira_aula  = observacoes_primeira_aula;
		this.nome_aluno                 = nome_aluno;
		this.idade_aluno                = idade_aluno;
		this.serie_ano                  = serie_ano;
		this.turno_aluno                = turno_aluno;
		this.telefone_aluno             = telefone_aluno;
		this.email_aluno                = email_aluno;
		this.imagem_aluno               = imagem_aluno;
		this.disciplina                 = disciplina;
		this.data_primeira_prova        = data_primeira_prova;
		this.conteudo_primeira_prova    = conteudo_primeira_prova;
		this.nota_primeira_prova        = nota_primeira_prova;
		this.data_segunda_prova         = data_segunda_prova; 
		this.conteudo_segunda_prova     = conteudo_segunda_prova;
		this.nota_segunda_prova         = nota_segunda_prova;
		this.data_terceira_prova        = data_terceira_prova;
		this.conteudo_terceira_prova    = conteudo_terceira_prova;
		this.nota_terceira_prova        = nota_terceira_prova;
		this.data_quarta_prova          = data_quarta_prova; 
		this.conteudo_quarta_prova      = conteudo_quarta_prova;
		this.nota_quarta_prova          = nota_quarta_prova;
		this.data_recuperacao_prova     = data_recuperacao_prova; 
		this.conteudo_recuperacao_prova = conteudo_recuperacao_prova;
		this.nota_recuperacao_prova     = nota_recuperacao_prova;
		this.dispositivo_assistir_aula  = dispositivo_assistir_aula;
		this.possui_impressora          = possui_impressora;
		this.necessidades_especiais     = necessidades_especiais;
		this.motivo_aulas               = motivo_aulas;
		this.contato_marcacao           = contato_marcacao;
		this.forma_passar_link          = forma_passar_link;
		this.campos                     = new TreeMap<String, String>();
	}	

	/** Metodo tosco que printa todos os campos de um registro Aluno */
	public void alunoToString()
	{
		Vm.debugLog("id_cliente = "					+ this.id_cliente);
		Vm.debugLog("nome_pais = "					+ this.nome_pais);
		Vm.debugLog("telefone_pais = "				+ this.telefone_pais);
		Vm.debugLog("email_pais = "					+ this.email_pais);
		Vm.debugLog("imagem_pais = "				+ this.imagem_pais);
		Vm.debugLog("valor_hora_avulsa = "			+ this.valor_hora_avulsa);
		Vm.debugLog("valor_pacote5 = "				+ this.valor_pacote5);
		Vm.debugLog("valor_pacote10 = "				+ this.valor_pacote10);
		Vm.debugLog("pacote_principal = "			+ this.pacote_principal);
		Vm.debugLog("modo_pagamento = "				+ this.modo_pagamento);
		Vm.debugLog("data_preferida_pagamento = "	+ this.data_preferida_pagamento);
		Vm.debugLog("data_aceite_pedido = "			+ this.data_aceite_pedido);
		Vm.debugLog("data_primeiro_contato = "		+ this.data_primeiro_contato);
		Vm.debugLog("data_primeira_aula = "			+ this.data_primeira_aula);
		Vm.debugLog("observacoes_primeira_aula = "	+ this.observacoes_primeira_aula);
		Vm.debugLog("nome_aluno = "					+ this.nome_aluno);
		Vm.debugLog("idade_aluno = "				+ this.idade_aluno);
		Vm.debugLog("serie_ano = "					+ this.serie_ano);
		Vm.debugLog("turno_aluno = "				+ this.turno_aluno);
		Vm.debugLog("telefone_aluno = "				+ this.telefone_aluno);
		Vm.debugLog("email_aluno = "				+ this.email_aluno);
		Vm.debugLog("imagem_aluno = "				+ this.imagem_aluno);
		Vm.debugLog("disciplina = "					+ this.disciplina);
		Vm.debugLog("data_primeira_prova = "		+ this.data_primeira_prova);
		Vm.debugLog("conteudo_primeira_prova = "	+ this.conteudo_primeira_prova);
		Vm.debugLog("nota_primeira_prova = "		+ this.nota_primeira_prova);
		Vm.debugLog("data_segunda_prova = "			+ this.data_segunda_prova); 
		Vm.debugLog("conteudo_segunda_prova = "		+ this.conteudo_segunda_prova);
		Vm.debugLog("nota_segunda_prova = "			+ this.nota_segunda_prova);
		Vm.debugLog("data_terceira_prova = "		+ this.data_terceira_prova);
		Vm.debugLog("conteudo_terceira_prova = "	+ this.conteudo_terceira_prova);
		Vm.debugLog("nota_terceira_prova = "		+ this.nota_terceira_prova);
		Vm.debugLog("data_quarta_prova = "			+ this.data_quarta_prova); 
		Vm.debugLog("conteudo_quarta_prova = "		+ this.conteudo_quarta_prova);
		Vm.debugLog("nota_quarta_prova = "			+ this.nota_quarta_prova);
		Vm.debugLog("data_recuperacao_prova = "		+ this.data_recuperacao_prova); 
		Vm.debugLog("conteudo_recuperacao_prova = "	+ this.conteudo_recuperacao_prova);
		Vm.debugLog("nota_recuperacao_prova = "		+ this.nota_recuperacao_prova);
		Vm.debugLog("dispositivo_assistir_aula = "	+ this.dispositivo_assistir_aula);
		Vm.debugLog("possui_impressora = "			+ this.possui_impressora);
		Vm.debugLog("necessidades_especiais = "		+ this.necessidades_especiais);
		Vm.debugLog("motivo_aulas = "				+ this.motivo_aulas);
		Vm.debugLog("contato_marcacao = "			+ this.contato_marcacao);
		Vm.debugLog("forma_passar_link = "			+ this.forma_passar_link);
	}
	
	/** Converte o vetor de campos em uma string delimitada por pipe */
    public String camposToString()
    {
        StringBuilder strCampos = new StringBuilder();
        Vector<Map.Entry<String, String>> entrySet = campos.getAll();

        for (int i = 0; i < entrySet.size(); i++)
        {
            Map.Entry<String, String> entry = entrySet.get(i);
            if (entry.value != null && entry.value.length() > 0)
            {
                if (strCampos.length() > 0)
                    strCampos.append("|");
                strCampos.append(entry.key);
                strCampos.append("=");
                strCampos.append(entry.value);
            }
        }        

        return strCampos.toString();
    }
}

