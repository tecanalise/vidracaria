package br.com.mjailton.vendasjsf.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Produto;
import br.com.mjailton.vendasjsf.modelo.Venda;
import br.com.mjailton.vendasjsf.modelo.Produto;
import br.com.mjailton.vendasjsf.util.JPAUtil;

@ManagedBean
public class VendaBean {
	private Produto produto = new Produto();
	private Venda venda = new Venda();
	
	private List<Produto> produtos;
	
	public void salva(){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction().commit();
		em.close();
		
	}
	
	
	public void excluir(Produto produto){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		produto = em.merge(produto);
		em.remove(produto);
		em.getTransaction().commit();
		em.close();
		
	}
	public List<Produto> busca(){
		EntityManager em = new JPAUtil().getEntityManager();
		Query q = em.createQuery("select u from Produto u where nome like :categoria", Produto.class);
		q.setParameter("nome", produto.getCategoria());
		this.produtos = q.getResultList();
		em.close();
		return produtos;
		}

	
	public List<Produto> getProdutos(){
		if(this.produtos==null) {
		EntityManager em = new JPAUtil().getEntityManager();
		Query q = em.createQuery("SELECT c FROM Produto c" , Produto.class);
		this.produtos = q.getResultList();
		em.close();
		}
		return produtos;
		
	}
	
	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


}
