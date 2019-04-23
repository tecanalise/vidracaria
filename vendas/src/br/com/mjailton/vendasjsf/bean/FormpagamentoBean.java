package br.com.mjailton.vendasjsf.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Formpagamento;
import br.com.mjailton.vendasjsf.util.JPAUtil;

@ManagedBean
public class FormpagamentoBean {
	private Formpagamento formpagamento = new Formpagamento();
	
	private List<Formpagamento> formpagamentos;
	
	public void salva(){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(formpagamento);
		em.getTransaction().commit();
		em.close();
		
	}
	
	
	public void excluir(Formpagamento formpagamento){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		formpagamento = em.merge(formpagamento);
		em.remove(formpagamento);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public List<Formpagamento> getFormpagamentos(){
		if(this.formpagamentos==null) {
		EntityManager em = new JPAUtil().getEntityManager();
		Query q = em.createQuery("SELECT c FROM Formpagamento c" , Formpagamento.class);
		this.formpagamentos = q.getResultList();
		em.close();
		}
		return formpagamentos;
		
	}
	
	public Formpagamento getFormpagamento() {
		return formpagamento;
	}


	public void setFormpagamento(Formpagamento formpagamento) {
		this.formpagamento = formpagamento;
	}


}
