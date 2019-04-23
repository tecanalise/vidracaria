package br.com.mjailton.vendasjsf.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Saidadinheiro;
import br.com.mjailton.vendasjsf.util.JPAUtil;

public class SaidadinheiroDao {
	
	private EntityManager em;
	
	public SaidadinheiroDao(EntityManager em) {
		this.em = em;
		
	}
	
	public void inserir(Saidadinheiro saidadinheiro) {
		this.em.persist(saidadinheiro);

	}
	
	public List<Saidadinheiro> getLista(){
		Query q = this.em.createQuery("SELECT cli FROM Saidadinheiro cli", Saidadinheiro.class);
		List<Saidadinheiro> saidadinheiros = q.getResultList();
		
		return saidadinheiros;
		
		

}
	
	public Saidadinheiro buscaPorId(Long id) {
		
		return this.em.find(Saidadinheiro.class, id);
	
	}
	
	public void atualizar(Saidadinheiro saidadinheiro) {
				
				
				
				em.getTransaction().begin();
				em.merge(saidadinheiro);
				em.getTransaction().commit();
				em.close();

			}
	
	public void excluir(Saidadinheiro saidadinheiro) {
		
				this.em.remove(saidadinheiro);

			}
	
}
