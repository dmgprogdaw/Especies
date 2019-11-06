package Especies.modelo.especie;

import javax.persistence.EntityManager;

import Especies.modelo.util.ConnectionEntityManagerFactory;
import Especies.negocio.EspecieBean;

public class CreateEspecie {

	
	public void create(EspecieBean especie) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		
		entityManager.getTransaction().begin();
		entityManager.persist(especie);
		entityManager.getTransaction().commit();
	}
}
