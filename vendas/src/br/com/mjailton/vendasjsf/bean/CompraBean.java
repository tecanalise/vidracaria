package br.com.mjailton.vendasjsf.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Compra;
import br.com.mjailton.vendasjsf.util.JPAUtil;

@ManagedBean
public class CompraBean {
	private Compra compra = new Compra();
	
	private List<Compra> compras;
	
	public void salva(){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(compra);
		em.getTransaction().commit();
		em.close();
		
	}
	
	
	public void excluir(Compra compra){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		compra = em.merge(compra);
		em.remove(compra);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public List<Compra> getCompras(){
		if(this.compras==null) {
		EntityManager em = new JPAUtil().getEntityManager();
		Query q = em.createQuery("SELECT c FROM Compra c" , Compra.class);
		this.compras = q.getResultList();
		em.close();
		}
		return compras;
		
	}
	
	public Compra getCompra() {
		return compra;
	}


	public void setCompra(Compra compra) {
		this.compra = compra;
	}


}
