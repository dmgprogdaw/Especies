package Especies.modelo.movimientos;

import javax.persistence.EntityManager;
import Especies.modelo.util.ConnectionEntityManagerFactory;
import Especies.negocio.MovimientoBean;

public class CreateMovimiento {

	
	public void create(MovimientoBean movimiento) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(movimiento);
		entityManager.getTransaction().commit();
	}
	
	
}
