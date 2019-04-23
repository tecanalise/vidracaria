package br.com.mjailton.vendasjsf.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Profornecedor;
import br.com.mjailton.vendasjsf.util.JPAUtil;

@ManagedBean
public class ProfornecedorBean {
	private Profornecedor profornecedor = new Profornecedor();
	
	private List<Profornecedor> profornecedors;
	
	public void salva(){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(profornecedor);
		em.getTransaction().commit();
		em.close();
		
	}
	
	
	public void excluir(Profornecedor profornecedor){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		profornecedor = em.merge(profornecedor);
		em.remove(profornecedor);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public List<Profornecedor> getProfornecedors(){
		if(this.profornecedors==null) {
		EntityManager em = new JPAUtil().getEntityManager();
		Query q = em.createQuery("SELECT c FROM Profornecedor c" , Profornecedor.class);
		this.profornecedors = q.getResultList();
		em.close();
		}
		return profornecedors;
		
	}
	
	public Profornecedor getProfornecedor() {
		return profornecedor;
	}


	public void setProfornecedor(Profornecedor profornecedor) {
		this.profornecedor = profornecedor;
	}


}
