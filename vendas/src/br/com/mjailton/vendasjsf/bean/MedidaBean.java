package br.com.mjailton.vendasjsf.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Medida;
import br.com.mjailton.vendasjsf.util.JPAUtil;

@ManagedBean
public class MedidaBean {
	private Medida medida = new Medida();
	
	private List<Medida> medidas;
	
	public void salva(){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(medida);
		em.getTransaction().commit();
		em.close();
		
	}
	
	
	public void excluir(Medida medida){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		medida = em.merge(medida);
		em.remove(medida);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public List<Medida> getMedidas(){
		if(this.medidas==null) {
		EntityManager em = new JPAUtil().getEntityManager();
		Query q = em.createQuery("SELECT c FROM Medida c" , Medida.class);
		this.medidas = q.getResultList();
		em.close();
		}
		return medidas;
		
	}
	
	public Medida getMedida() {
		return medida;
	}


	public void setMedida(Medida medida) {
		this.medida = medida;
	}


}
