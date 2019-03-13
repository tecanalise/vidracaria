package br.com.mjailton.vendasjsf.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Saidadinheiro;
import br.com.mjailton.vendasjsf.util.JPAUtil;

@ManagedBean
public class SaidadinheiroBean {
	private Saidadinheiro saidadinheiro = new Saidadinheiro();
	
	private List<Saidadinheiro> saidadinheiros;
	
	public void salva(){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(saidadinheiro);
		em.getTransaction().commit();
		em.close();
		
	}
	
	
	public void excluir(Saidadinheiro saidadinheiro){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		saidadinheiro = em.merge(saidadinheiro);
		em.remove(saidadinheiro);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public List<Saidadinheiro> getSaidadinheiros(){
		if(this.saidadinheiros==null) {
		EntityManager em = new JPAUtil().getEntityManager();
		Query q = em.createQuery("SELECT c FROM Saidadinheiro c" , Saidadinheiro.class);
		this.saidadinheiros = q.getResultList();
		em.close();
		}
		return saidadinheiros;
		
	}
	
	public Saidadinheiro getSaidadinheiro() {
		return saidadinheiro;
	}


	public void setSaidadinheiro(Saidadinheiro saidadinheiro) {
		this.saidadinheiro = saidadinheiro;
	}


}
