package br.com.mjailton.vendasjsf.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Produto;
import br.com.mjailton.vendasjsf.util.JPAUtil;

public class ProdutoDao {
	
	private EntityManager em;
	
	public ProdutoDao(EntityManager em) {
		this.em = em;
		
	}
	
	public void inserir(Produto produto) {
		this.em.persist(produto);

	}
	
	public List<Produto> getLista(){
		Query q = this.em.createQuery("SELECT cli FROM Produto cli", Produto.class);
		List<Produto> produtos = q.getResultList();
		
		return produtos;
		
		

}
	
	public Produto buscaPorId(Long id) {
		
		return this.em.find(Produto.class, id);
	
	}
	
	public void atualizar(Produto produto) {
				
				
				
				em.getTransaction().begin();
				em.merge(produto);
				em.getTransaction().commit();
				em.close();

			}
	
	public void excluir(Produto produto) {
		
				this.em.remove(produto);

			}
	
}
