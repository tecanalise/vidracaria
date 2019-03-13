package br.com.mjailton.vendasjsf.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Movimento;
import br.com.mjailton.vendasjsf.util.JPAUtil;

@ManagedBean
public class MovimentoBean {
	private Movimento movimento = new Movimento();
	
	private List<Movimento> movimentos;
	
	public void salva(){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(movimento);
		em.getTransaction().commit();
		em.close();
		
	}
	
	
	public void excluir(Movimento movimento){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		movimento = em.merge(movimento);
		em.remove(movimento);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public List<Movimento> getMovimentos(){
		if(this.movimentos==null) {
		EntityManager em = new JPAUtil().getEntityManager();
		Query q = em.createQuery("SELECT c FROM Movimento c" , Movimento.class);
		this.movimentos = q.getResultList();
		em.close();
		}
		return movimentos;
		
	}
	
	public Movimento getMovimento() {
		return movimento;
	}


	public void setMovimento(Movimento movimento) {
		this.movimento = movimento;
	}


}
