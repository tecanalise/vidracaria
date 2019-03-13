package br.com.mjailton.vendasjsf.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mj-vendas");
	
	public EntityManager getEntityManager() {
		return fabrica.createEntityManager();
	}

}
