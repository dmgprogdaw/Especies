package Especies.modelo.biologos;

import javax.persistence.EntityManager;

import Especies.modelo.util.ConnectionEntityManagerFactory;
import Especies.negocio.BiologoBean;

public class CreateBiologo {

public void create(BiologoBean biologo) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		
		entityManager.getTransaction().begin();
		entityManager.persist(biologo);
		entityManager.getTransaction().commit();
	}
}
