package br.com.mjailton.vendasjsf.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Movimento;
import br.com.mjailton.vendasjsf.util.JPAUtil;

public class MovimentoDao {
	
	private EntityManager em;
	
	public MovimentoDao(EntityManager em) {
		this.em = em;
		
	}
	
	public void inserir(Movimento movimento) {
		this.em.persist(movimento);

	}
	
	public List<Movimento> getLista(){
		Query q = this.em.createQuery("SELECT cli FROM Movimento cli", Movimento.class);
		List<Movimento> movimentos = q.getResultList();
		
		return movimentos;
		
		

}
	
	public Movimento buscaPorId(Long id) {
		
		return this.em.find(Movimento.class, id);
	
	}
	
	public void atualizar(Movimento movimento) {
				
				
				
				em.getTransaction().begin();
				em.merge(movimento);
				em.getTransaction().commit();
				em.close();

			}
	
	public void excluir(Movimento movimento) {
		
				this.em.remove(movimento);

			}
	
}
