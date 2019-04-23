package br.com.mjailton.vendasjsf.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Fornecedor;
import br.com.mjailton.vendasjsf.util.JPAUtil;

@ManagedBean
public class FornecedorBean {
	private Fornecedor fornecedor = new Fornecedor();
	
	private List<Fornecedor> fornecedors;
	
	public void salva(){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(fornecedor);
		em.getTransaction().commit();
		em.close();
		
	}
	
	
	public void excluir(Fornecedor fornecedor){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		fornecedor = em.merge(fornecedor);
		em.remove(fornecedor);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public List<Fornecedor> getFornecedors(){
		if(this.fornecedors==null) {
		EntityManager em = new JPAUtil().getEntityManager();
		Query q = em.createQuery("SELECT c FROM Fornecedor c" , Fornecedor.class);
		this.fornecedors = q.getResultList();
		em.close();
		}
		return fornecedors;
		
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}


	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}


}
