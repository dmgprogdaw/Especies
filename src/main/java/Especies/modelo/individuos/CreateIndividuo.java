package Especies.modelo.individuos;

import javax.persistence.EntityManager;

import Especies.modelo.util.ConnectionEntityManagerFactory;
import Especies.negocio.IndividuoBean;

public class CreateIndividuo {

	/**
	 * Metodo para crear los individuos
	 * @param individuo
	 */
	public void create(IndividuoBean individuo) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(individuo);
		entityManager.getTransaction().commit();
	}
}
