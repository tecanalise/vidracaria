package br.com.mjailton.vendasjsf.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Servico;
import br.com.mjailton.vendasjsf.util.JPAUtil;

public class ServicoDao {
	
	private EntityManager em;
	
	public ServicoDao(EntityManager em) {
		this.em = em;
		
	}
	
	public void inserir(Servico servico) {
		this.em.persist(servico);

	}
	
	public List<Servico> getLista(){
		Query q = this.em.createQuery("SELECT cli FROM Servico cli", Servico.class);
		List<Servico> servicos = q.getResultList();
		
		return servicos;
		
		

}
	
	public Servico buscaPorId(Long id) {
		
		return this.em.find(Servico.class, id);
	
	}
	
	public void atualizar(Servico servico) {
				
				
				
				em.getTransaction().begin();
				em.merge(servico);
				em.getTransaction().commit();
				em.close();

			}
	
	public void excluir(Servico servico) {
		
				this.em.remove(servico);

			}
	
}
