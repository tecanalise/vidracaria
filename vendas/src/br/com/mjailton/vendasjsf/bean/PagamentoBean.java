package br.com.mjailton.vendasjsf.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Pagamento;
import br.com.mjailton.vendasjsf.util.JPAUtil;

@ManagedBean
public class PagamentoBean {
	private Pagamento pagamento = new Pagamento();
	
	private List<Pagamento> pagamentos;
	
	public void salva(){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(pagamento);
		em.getTransaction().commit();
		em.close();
		
	}
	
	
	public void excluir(Pagamento pagamento){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		pagamento = em.merge(pagamento);
		em.remove(pagamento);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public List<Pagamento> getPagamentos(){
		if(this.pagamentos==null) {
		EntityManager em = new JPAUtil().getEntityManager();
		Query q = em.createQuery("SELECT c FROM Pagamento c" , Pagamento.class);
		this.pagamentos = q.getResultList();
		em.close();
		}
		return pagamentos;
		
	}
	
	public Pagamento getPagamento() {
		return pagamento;
	}


	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}


}
