package br.com.mjailton.vendasjsf.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Cliente;
import br.com.mjailton.vendasjsf.util.JPAUtil;

@ManagedBean
public class ClienteBean {
	private Cliente cliente = new Cliente();
	
	private List<Cliente> clientes;
	private List<Cliente> client;
	
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}


	public void setClient(List<Cliente> client) {
		this.client = client;
	}


	public void salva(){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		em.close();
		
	}
	
	
	public void excluir(Cliente cliente){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		cliente = em.merge(cliente);
		em.remove(cliente);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public List<Cliente> getClientes(){
		if(this.clientes==null) {
		EntityManager em = new JPAUtil().getEntityManager();
		Query q = em.createQuery("SELECT c FROM Cliente c" , Cliente.class);
		this.clientes = q.getResultList();
		em.close();
		}
		return clientes;
		
	}
	
	public List<Cliente> busca(){
			EntityManager em = new JPAUtil().getEntityManager();
			Query q = em.createQuery("select u from Cliente u where nome like :nome", Cliente.class);
			q.setParameter("nome", cliente.getNome());
			this.clientes = q.getResultList();
			em.close();
			return clientes;
			}
	
	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


}
