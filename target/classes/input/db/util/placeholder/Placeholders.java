package br.com.superprof.db.util.alunos;

/** Armazenamento e relação das informações referentes aos responsaveis e alunos, bem como informacoes de primeiros contatos */
public interface Alunos
{
	/** Preparacoes da tabela PLACEHOLDERS -caso ela nao exista- antes do uso no programa (e.g. criacao de tabelas, setar parametros, etc). */
    public void setup();
	
    /** Metodo que insere um novo registro de aluno na tabela ALUNOS */
    public void adicionar(Placeholder placeholder);

    /** Metodo que atualiza um registro da tabela ALUNOS para todos atributos do parametro aluno que nao forem nulos
	 * retorna true se a operação foi concluida com sucesso, ou false caso contrário */
    public boolean atualizar(String nome_pais, Placeholder placeholder);

	/** Metodo que roda um select * de ALUNOS e retorna um Vector povoado de instancias de Aluno */
    public Vector<Placeholder> obterTodos();
	
    /** Busca e devolve o registro Aluno aluno completo identificado pelo nome do responsavel ou null caso não seja localizada */
    public Placeholder obter(String origem);

    /** Inicia a lista de todos alunos para tambem inicializar a queryEnumerator, retornando a primeira instancia de aluno ou null se não existir nenhum */
    public Placeholder enumerarPrimeiro();

    /** Recupera o próximo aluno contido na queryEnumerador e retorna a instancia desse Aluno aluno, ou retorna null se não existir mais nenhum */
    public Placeholder enumerarProximo();

    /** Finaliza a listagem de alunos */
    public void enumerarConcluir();

    /** Exclui o registro identificado de aluno da tabela ALUNOS */
    public void removerAntigos(String origem, int diasCorte);

    /** Exclui os registros identificados de aluno da tabela ALUNOS */
    public void limpar(String origem);
}
