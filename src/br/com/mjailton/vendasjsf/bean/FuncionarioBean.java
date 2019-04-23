package br.com.mjailton.vendasjsf.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Cliente;
import br.com.mjailton.vendasjsf.modelo.Funcionario;
import br.com.mjailton.vendasjsf.util.JPAUtil;

@ManagedBean
public class FuncionarioBean {
	private Funcionario funcionario = new Funcionario();
	
	private List<Funcionario> funcionarios;
	
	public void salva(){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(funcionario);
		em.getTransaction().commit();
		em.close();
		
	}
	
	
	public void excluir(Funcionario funcionario){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		funcionario = em.merge(funcionario);
		em.remove(funcionario);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public List<Funcionario> getFuncionarios(){
		if(this.funcionarios==null) {
		EntityManager em = new JPAUtil().getEntityManager();
		Query q = em.createQuery("SELECT c FROM Funcionario c" , Funcionario.class);
		this.funcionarios = q.getResultList();
		em.close();
		}
		return funcionarios;
		
	}
	public List<Funcionario> busca(){
		EntityManager em = new JPAUtil().getEntityManager();
		Query q = em.createQuery("select u from Funcionario u where nome like :nome", Funcionario.class);
		q.setParameter("nome", funcionario.getNome());
		this.funcionarios = q.getResultList();
		em.close();
		return funcionarios;
		}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}


}
