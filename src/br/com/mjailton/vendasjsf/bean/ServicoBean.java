package br.com.mjailton.vendasjsf.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Servico;
import br.com.mjailton.vendasjsf.util.JPAUtil;

@ManagedBean
public class ServicoBean {
	private Servico servico = new Servico();
	
	private List<Servico> servicos;
	
	public void salva(){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(servico);
		em.getTransaction().commit();
		em.close();
		
	}
	
	
	public void excluir(Servico servico){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		servico = em.merge(servico);
		em.remove(servico);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public List<Servico> getServicos(){
		if(this.servicos==null) {
		EntityManager em = new JPAUtil().getEntityManager();
		Query q = em.createQuery("SELECT c FROM Servico c" , Servico.class);
		this.servicos = q.getResultList();
		em.close();
		}
		return servicos;
		
	}
	
	public Servico getServico() {
		return servico;
	}


	public void setServico(Servico servico) {
		this.servico = servico;
	}


}
