package br.edu.conversor.dao;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import br.edu.conversor.connection.CriarConexao;
import br.edu.conversor.entity.Vocabulo;





public class VocabuloDAO {
	private Session session;
	private Transaction tx;
	
    public VocabuloDAO () //Construtor realiza conexão com o banco
    {
    	session= CriarConexao.getSession();
    }
    
    
    public List Listar() //lista que, por meio de consultas Criteria, lista todos os registros da tabela
    {
    	Criteria consulta = session.createCriteria(Vocabulo.class); 
    	return consulta.list();
    }
    
    public List PesquisaVocabulo(String p) //lista que, por meio de consultas Criteria, retorna o termo pesquisado
    {
    	Criteria consulta = session.createCriteria(Vocabulo.class).add(Restrictions.like("nm_vocabulo_antigo","%" + p + "%")); 
    	return consulta.list();
    }
    
    public Vocabulo carregaVocabulo(int id)
    {
    		//Pegamos o objeto Vocabulo pelo seu código
    	return (Vocabulo) session.load(Vocabulo.class, id );
    }

}