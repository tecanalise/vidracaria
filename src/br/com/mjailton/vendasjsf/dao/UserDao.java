package br.com.mjailton.vendasjsf.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.User;
import br.com.mjailton.vendasjsf.util.JPAUtil;

public class UserDao {
	
	private EntityManager em;
	
	public UserDao(EntityManager em) {
		this.em = em;
		
	}
	
	public void inserir(User user) {
		this.em.persist(user);

	}
	
	public List<User> getLista(){
		Query q = this.em.createQuery("SELECT cli FROM User cli", User.class);
		List<User> users = q.getResultList();
		
		return users;
		
		

}
	
	public User buscaPorId(Long id) {
		
		return this.em.find(User.class, id);
	
	}
	
	public void atualizar(User user) {
				
				
				
				em.getTransaction().begin();
				em.merge(user);
				em.getTransaction().commit();
				em.close();

			}
	
	public void excluir(User user) {
		
				this.em.remove(user);

			}
	
}
