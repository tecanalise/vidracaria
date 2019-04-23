package br.com.mjailton.vendasjsf.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Pagamento;
import br.com.mjailton.vendasjsf.util.JPAUtil;

public class PagamentoDao {
	
	private EntityManager em;
	
	public PagamentoDao(EntityManager em) {
		this.em = em;
		
	}
	
	public void inserir(Pagamento pagamento) {
		this.em.persist(pagamento);

	}
	
	public List<Pagamento> getLista(){
		Query q = this.em.createQuery("SELECT cli FROM Pagamento cli", Pagamento.class);
		List<Pagamento> pagamentos = q.getResultList();
		
		return pagamentos;
		
		

}
	
	public Pagamento buscaPorId(Long id) {
		
		return this.em.find(Pagamento.class, id);
	
	}
	
	public void atualizar(Pagamento pagamento) {
				
				
				
				em.getTransaction().begin();
				em.merge(pagamento);
				em.getTransaction().commit();
				em.close();

			}
	
	public void excluir(Pagamento pagamento) {
		
				this.em.remove(pagamento);

			}
	
}
