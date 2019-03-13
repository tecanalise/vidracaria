package br.com.mjailton.vendasjsf.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Cliente;
import br.com.mjailton.vendasjsf.util.JPAUtil;

public class ClienteDao {
	
	private EntityManager em;
	
	public ClienteDao(EntityManager em) {
		this.em = em;
		
	}
	
	public void inserir(Cliente cliente) {
		this.em.persist(cliente);

	}
	
	public List<Cliente> getLista(){
		Query q = this.em.createQuery("SELECT cli FROM Cliente cli", Cliente.class);
		List<Cliente> clientes = q.getResultList();
		
		return clientes;
		
		

}
	
	public Cliente buscaPorNome(String nome) {
		
		return this.em.find(Cliente.class, nome);
	
	}
	
	public void atualizar(Cliente cliente) {
				
				
				
				em.getTransaction().begin();
				em.merge(cliente);
				em.getTransaction().commit();
				em.close();

			}
	
	public void excluir(Cliente cliente) {
		
				this.em.remove(cliente);

			}
	
}
