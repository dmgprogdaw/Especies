package Especies.inicio;

import Especies.modelo.especie.CreateEspecie;
import Especies.modelo.individuos.CreateIndividuo;
import Especies.modelo.util.ConnectionEntityManagerFactory;
import Especies.negocio.EspecieBean;
import Especies.negocio.IndividuoBean;

public class Start {

	public static void main(String[] args) {
	
		/**** INTRODUCIMOS LAS ESPECIES ****/
		EspecieBean inu = new EspecieBean();
		inu.setCodEspecie(0001);
		inu.setNombre("Perro");
		inu.setPeriodosMigratorios("No migran");
		inu.setTipo("Canino");
		inu.setCaracteristicasPrincipales("Te violan las piernas");
		
		EspecieBean neko = new EspecieBean();
		neko.setCodEspecie(0002);
		neko.setNombre("Gato");
		neko.setPeriodosMigratorios("No migran");
		neko.setTipo("Felino");
		neko.setCaracteristicasPrincipales("Son mascotas de las brujas");
		
		/**** INTRODUCIMOS LOS INDIVIDUOS ****/
		IndividuoBean individuo1 = new IndividuoBean();
		individuo1.setCodigo(0001);
		individuo1.setPeso(60);
		individuo1.setDimensiones("3 Dimensiones");
		
		
		/**** CREAMOS LAS ESPECIES ****/
		CreateEspecie especies = new CreateEspecie();
		especies.create(inu);
		especies.create(neko);
		
		/**** CREAMOS LAS ESPECIES ****/
		CreateIndividuo individuos = new CreateIndividuo();
		individuos.create(individuo1);
		
		ConnectionEntityManagerFactory.getEntityManagerFactory().close();
	}

}
