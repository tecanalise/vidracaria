package br.com.mjailton.vendasjsf.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Cliente;
import br.com.mjailton.vendasjsf.modelo.Preco;
import br.com.mjailton.vendasjsf.util.JPAUtil;

@ManagedBean
public class PrecoBean {
	private Preco preco = new Preco();
	
	private List<Preco> precos;
	
	public void salva(){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(preco);
		em.getTransaction().commit();
		em.close();
		
	}
	
	
	public void excluir(Preco preco){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		preco = em.merge(preco);
		em.remove(preco);
		em.getTransaction().commit();
		em.close();
		
	}
	public List<Preco> busca(){
		EntityManager em = new JPAUtil().getEntityManager();
		Query q = em.createQuery("select u from Preco u where nome like :nome", Preco.class);
		q.setParameter("nome", preco.getNome());
		this.precos = q.getResultList();
		em.close();
		return precos;
		}
	
	public List<Preco> getPrecos(){
		if(this.precos==null) {
		EntityManager em = new JPAUtil().getEntityManager();
		Query q = em.createQuery("SELECT c FROM Preco c" , Preco.class);
		this.precos = q.getResultList();
		em.close();
		}
		return precos;
		
	}
	
	public Preco getPreco() {
		return preco;
	}


	public void setPreco(Preco preco) {
		this.preco = preco;
	}


}
