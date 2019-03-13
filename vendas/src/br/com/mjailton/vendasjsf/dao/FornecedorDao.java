package br.com.mjailton.vendasjsf.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.util.JPAUtil;

public class FornecedorDao {
	
	private EntityManager em;
	
	public FornecedorDao(EntityManager em) {
		this.em = em;
		
	}
	
	public void inserir(FornecedorDao fornecedor) {
		this.em.persist(fornecedor);

	}
	
	public List<FornecedorDao> getLista(){
		Query q = this.em.createQuery("SELECT cli FROM Fornecedor cli", FornecedorDao.class);
		List<FornecedorDao> fornecedors = q.getResultList();
		
		return fornecedors;
		
		

}
	
	public FornecedorDao buscaPorId(Long id) {
		
		return this.em.find(FornecedorDao.class, id);
	
	}
	
	public void atualizar(FornecedorDao fornecedor) {
				
				
				
				em.getTransaction().begin();
				em.merge(fornecedor);
				em.getTransaction().commit();
				em.close();

			}
	
	public void excluir(FornecedorDao fornecedor) {
		
				this.em.remove(fornecedor);

			}
	
}
