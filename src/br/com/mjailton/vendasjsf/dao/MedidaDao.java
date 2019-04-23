package br.com.mjailton.vendasjsf.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Medida;
import br.com.mjailton.vendasjsf.util.JPAUtil;

public class MedidaDao {
	
	private EntityManager em;
	
	public MedidaDao(EntityManager em) {
		this.em = em;
		
	}
	
	public void inserir(Medida medida) {
		this.em.persist(medida);

	}
	
	public List<Medida> getLista(){
		Query q = this.em.createQuery("SELECT cli FROM Medida cli", Medida.class);
		List<Medida> medidas = q.getResultList();
		
		return medidas;
		
		

}
	
	public Medida buscaPorId(Long id) {
		
		return this.em.find(Medida.class, id);
	
	}
	
	public void atualizar(Medida medida) {
				
				
				
				em.getTransaction().begin();
				em.merge(medida);
				em.getTransaction().commit();
				em.close();

			}
	
	public void excluir(Medida medida) {
		
				this.em.remove(medida);

			}
	
}
