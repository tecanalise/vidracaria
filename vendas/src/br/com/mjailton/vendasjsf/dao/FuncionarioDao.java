package br.com.mjailton.vendasjsf.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Funcionario;
import br.com.mjailton.vendasjsf.util.JPAUtil;

public class FuncionarioDao {
	
	private EntityManager em;
	
	public FuncionarioDao(EntityManager em) {
		this.em = em;
		
	}
	
	public void inserir(Funcionario funcionario) {
		this.em.persist(funcionario);

	}
	
	public List<Funcionario> getLista(){
		Query q = this.em.createQuery("SELECT cli FROM Funcionario cli", Funcionario.class);
		List<Funcionario> funcionarios = q.getResultList();
		
		return funcionarios;
		
		

}
	
	public Funcionario buscaPorId(Long id) {
		
		return this.em.find(Funcionario.class, id);
	
	}
	
	public void atualizar(Funcionario funcionario) {
				
				
				
				em.getTransaction().begin();
				em.merge(funcionario);
				em.getTransaction().commit();
				em.close();

			}
	
	public void excluir(Funcionario funcionario) {
		
				this.em.remove(funcionario);

			}
	
}
