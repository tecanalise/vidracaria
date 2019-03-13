package br.com.mjailton.vendasjsf.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mjailton.vendasjsf.modelo.Usuario;
import br.com.mjailton.vendasjsf.util.JPAUtil;

@ManagedBean
public class UsuarioBean {
	private Usuario usuario = new Usuario();
	
	private List<Usuario> usuarios;
	
	public void salva(){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		em.close();
		
	}
	
	
	public void excluir(Usuario usuario){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		usuario = em.merge(usuario);
		em.remove(usuario);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public List<Usuario> getUsuarios(){
		if(this.usuarios==null) {
		EntityManager em = new JPAUtil().getEntityManager();
		Query q = em.createQuery("SELECT c FROM Usuario c" , Usuario.class);
		this.usuarios = q.getResultList();
		em.close();
		}
		return usuarios;
		
	}
	
	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


}
