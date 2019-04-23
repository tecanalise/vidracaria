package br.com.mjailton.vendasjsf.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.util.JPAUtil;

public class Profornecedor {
	
	private EntityManager em;
	
	public Profornecedor(EntityManager em) {
		this.em = em;
		
	}
	
	public void inserir(Profornecedor profornecedor) {
		this.em.persist(profornecedor);

	}
	
	public List<Profornecedor> getLista(){
		Query q = this.em.createQuery("SELECT cli FROM Profornecedor cli", Profornecedor.class);
		List<Profornecedor> profornecedors = q.getResultList();
		
		return profornecedors;
		
		

}
	
	public Profornecedor buscaPorId(Long id) {
		
		return this.em.find(Profornecedor.class, id);
	
	}
	
	public void atualizar(Profornecedor profornecedor) {
				
				
				
				em.getTransaction().begin();
				em.merge(profornecedor);
				em.getTransaction().commit();
				em.close();

			}
	
	public void excluir(Profornecedor profornecedor) {
		
				this.em.remove(profornecedor);

			}
	
}
