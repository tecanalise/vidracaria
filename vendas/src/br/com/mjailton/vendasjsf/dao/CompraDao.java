package br.com.mjailton.vendasjsf.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Compra;
import br.com.mjailton.vendasjsf.util.JPAUtil;

public class CompraDao {
	
	private EntityManager em;
	
	public CompraDao(EntityManager em) {
		this.em = em;
		
	}
	
	public void inserir(Compra compra) {
		this.em.persist(compra);

	}
	
	public List<Compra> getLista(){
		Query q = this.em.createQuery("SELECT cli FROM Compra cli", Compra.class);
		List<Compra> compras = q.getResultList();
		
		return compras;
		
		

}
	
	public Compra buscaPorId(Long id) {
		
		return this.em.find(Compra.class, id);
	
	}
	
	public void atualizar(Compra compra) {
				
				
				
				em.getTransaction().begin();
				em.merge(compra);
				em.getTransaction().commit();
				em.close();

			}
	
	public void excluir(Compra compra) {
		
				this.em.remove(compra);

			}
	
}
