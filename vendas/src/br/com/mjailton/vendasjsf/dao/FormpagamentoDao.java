package br.com.mjailton.vendasjsf.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Formpagamento;
import br.com.mjailton.vendasjsf.util.JPAUtil;

public class FormpagamentoDao {
	
	private EntityManager em;
	
	public FormpagamentoDao(EntityManager em) {
		this.em = em;
		
	}
	
	public void inserir(Formpagamento formpagamento) {
		this.em.persist(formpagamento);

	}
	
	public List<Formpagamento> getLista(){
		Query q = this.em.createQuery("SELECT cli FROM Formpagamento cli", Formpagamento.class);
		List<Formpagamento> formpagamentos = q.getResultList();
		
		return formpagamentos;
		
		

}
	
	public Formpagamento buscaPorId(Long id) {
		
		return this.em.find(Formpagamento.class, id);
	
	}
	
	public void atualizar(Formpagamento formpagamento) {
				
				
				
				em.getTransaction().begin();
				em.merge(formpagamento);
				em.getTransaction().commit();
				em.close();

			}
	
	public void excluir(Formpagamento formpagamento) {
		
				this.em.remove(formpagamento);

			}
	
}
