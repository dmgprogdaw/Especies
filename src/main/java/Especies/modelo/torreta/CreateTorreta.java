package Especies.modelo.torreta;

import javax.persistence.EntityManager;

import Especies.modelo.util.ConnectionEntityManagerFactory;
import Especies.negocio.TorretaBean;

public class CreateTorreta {

public void create(TorretaBean torreta) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		
		entityManager.getTransaction().begin();
		entityManager.persist(torreta);
		entityManager.getTransaction().commit();
	}
}
