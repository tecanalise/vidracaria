package br.com.mjailton.vendasjsf.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Preco;
import br.com.mjailton.vendasjsf.util.JPAUtil;

public class PrecoDao {
	
	private EntityManager em;
	
	public PrecoDao(EntityManager em) {
		this.em = em;
		
	}
	
	public void inserir(Preco preco) {
		this.em.persist(preco);

	}
	
	public List<Preco> getLista(){
		Query q = this.em.createQuery("SELECT cli FROM Preco cli", Preco.class);
		List<Preco> precos = q.getResultList();
		
		return precos;
		
		

}
	
	public Preco buscaPorId(Long id) {
		
		return this.em.find(Preco.class, id);
	
	}
	
	public void atualizar(Preco preco) {
				
				
				
				em.getTransaction().begin();
				em.merge(preco);
				em.getTransaction().commit();
				em.close();

			}
	
	public void excluir(Preco preco) {
		
				this.em.remove(preco);

			}
	
}
