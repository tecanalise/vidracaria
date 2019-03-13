package br.com.mjailton.vendasjsf.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Vendporvendedor;
import br.com.mjailton.vendasjsf.util.JPAUtil;

@ManagedBean
public class VendporvendedorBean {
	private Vendporvendedor vendporvendedor = new Vendporvendedor();
	
	private List<Vendporvendedor> vendporvendedors;
	
	public void salva(){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(vendporvendedor);
		em.getTransaction().commit();
		em.close();
		
	}
	
	
	public void excluir(Vendporvendedor vendporvendedor){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		vendporvendedor = em.merge(vendporvendedor);
		em.remove(vendporvendedor);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public List<Vendporvendedor> getVendporvendedors(){
		if(this.vendporvendedors==null) {
		EntityManager em = new JPAUtil().getEntityManager();
		Query q = em.createQuery("SELECT c FROM Vendporvendedor c" , Vendporvendedor.class);
		this.vendporvendedors = q.getResultList();
		em.close();
		}
		return vendporvendedors;
		
	}
	
	public Vendporvendedor getVendporvendedor() {
		return vendporvendedor;
	}


	public void setVendporvendedor(Vendporvendedor vendporvendedor) {
		this.vendporvendedor = vendporvendedor;
	}


}
