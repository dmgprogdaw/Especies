package Especies.modelo.informes;

import javax.persistence.EntityManager;

import Especies.modelo.util.ConnectionEntityManagerFactory;
import Especies.negocio.InformeBean;

public class CreateInforme {

public void create(InformeBean informe) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		
		entityManager.getTransaction().begin();
		entityManager.persist(informe);
		entityManager.getTransaction().commit();
	}
}
