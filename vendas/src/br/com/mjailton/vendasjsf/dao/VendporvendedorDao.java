package br.com.mjailton.vendasjsf.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Vendporvendedor;
import br.com.mjailton.vendasjsf.util.JPAUtil;

public class VendporvendedorDao {
	
	private EntityManager em;
	
	public VendporvendedorDao(EntityManager em) {
		this.em = em;
		
	}
	
	public void inserir(Vendporvendedor vendporvendedor) {
		this.em.persist(vendporvendedor);

	}
	
	public List<Vendporvendedor> getLista(){
		Query q = this.em.createQuery("SELECT cli FROM Vendporvendedor cli", Vendporvendedor.class);
		List<Vendporvendedor> vendporvendedors = q.getResultList();
		
		return vendporvendedors;
		
		

}
	
	public Vendporvendedor buscaPorId(Long id) {
		
		return this.em.find(Vendporvendedor.class, id);
	
	}
	
	public void atualizar(Vendporvendedor vendporvendedor) {
				
				
				
				em.getTransaction().begin();
				em.merge(vendporvendedor);
				em.getTransaction().commit();
				em.close();

			}
	
	public void excluir(Vendporvendedor vendporvendedor) {
		
				this.em.remove(vendporvendedor);

			}
	
}
