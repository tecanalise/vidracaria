package br.com.mjailton.vendasjsf.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
  
import br.com.mjailton.vendasjsf.modelo.Usuario;
import br.com.mjailton.vendasjsf.util.JPAUtil;

public class UsuarioDAO {
  
	EntityManager em = new JPAUtil().getEntityManager();
  
      public Usuario getUsuario(String nomeUsuario, String senha) {
  
            try {
                  Usuario usuario = (Usuario) em
                             .createQuery(
                                         "SELECT u from Usuario u where u.nomeUsuario = :name and u.senha = :senha")
                             .setParameter("name", nomeUsuario)
                             .setParameter("senha", senha).getSingleResult();
  
                  return usuario;
            } catch (NoResultException e) {
                  return null;
            }
      }
  
  
}