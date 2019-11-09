package Especies.inicio;

import Especies.modelo.biologos.CreateBiologo;
import Especies.modelo.especie.CreateEspecie;
import Especies.modelo.individuos.CreateIndividuo;
import Especies.modelo.informes.CreateInforme;
import Especies.modelo.movimientos.CreateMovimiento;
import Especies.modelo.torreta.CreateTorreta;
import Especies.modelo.util.ConnectionEntityManagerFactory;
import Especies.negocio.BiologoBean;
import Especies.negocio.EspecieBean;
import Especies.negocio.IndividuoBean;
import Especies.negocio.InformeBean;
import Especies.negocio.MovimientoBean;
import Especies.negocio.TorretaBean;

public class Start {

	public static void main(String[] args) {
	
		/**** INTRODUCIMOS LAS ESPECIES ****/
		EspecieBean inu = new EspecieBean();
		inu.setCodEspecie(1L);
		inu.setNombre("Perro");
		inu.setPeriodosMigratorios("No migran");
		inu.setTipo("Canino");
		inu.setCaracteristicasPrincipales("Te violan las piernas");
		
		EspecieBean neko = new EspecieBean();
		neko.setCodEspecie(2L);
		neko.setNombre("Gato");
		neko.setPeriodosMigratorios("No migran");
		neko.setTipo("Felino");
		neko.setCaracteristicasPrincipales("Son mascotas de las brujas");
		
		/**** INTRODUCIMOS LOS INDIVIDUOS ****/
		IndividuoBean individuo1 = new IndividuoBean();
		individuo1.setCodIndividuo(1L);
		individuo1.setPeso(60);
		individuo1.setDimensiones("3 Dimensiones");
		individuo1.setEspecie(inu);
		
		IndividuoBean individuo2 = new IndividuoBean();
		individuo2.setCodIndividuo(2L);
		individuo2.setPeso(80);
		individuo2.setDimensiones("2 Dimensiones");
		individuo2.setEspecie(neko);
		
		/**** INTRODUCIMOS LAS TORRETAS ****/
		TorretaBean torreta1 = new TorretaBean();
		torreta1.setCodTorreta(1L);
		torreta1.setNombre("Torreta1");
		torreta1.setUbicacion("Aller");
		
		/**** INTRODUCIMOS LOS MOVIMIENTOS ****/
		MovimientoBean movimiento1 = new MovimientoBean();
		movimiento1.setCodMovimiento(1L);
		movimiento1.setFecha("30-12-19");
		movimiento1.setHora("14:05:36");
		movimiento1.setIndividuoMovimiento(individuo1);
		movimiento1.setTorreta(torreta1);
		
		/**** INTRODUCIMOS LOS INFORMES ****/
		InformeBean informe1 = new InformeBean();
		informe1.setCodInforme(1L);
		informe1.setFecha("25-10-2020");
		
		/**** INTRODUCIMOS LOS BIOLOGOS ****/
		BiologoBean pedro = new BiologoBean();
		pedro.setCodBiologo(1L);
		pedro.setNombre("Pedro");
		pedro.setDireccion("Su casa");
		pedro.setProvincia("Asturias");
		pedro.setFechaTitulacion("05-06-1990");
		
		
		inu.addIndividuo(individuo1);
		neko.addIndividuo(individuo2);
		individuo1.addMovimientos(movimiento1);
		torreta1.addMovimientoTorreta(movimiento1);
		informe1.addInformeMovimientos(movimiento1);
		pedro.addInformes(informe1);
		
		/**** CREAMOS LAS ESPECIES ****/
		CreateEspecie especies = new CreateEspecie();
		especies.create(inu);
		especies.create(neko);
		
		/**** CREAMOS LAS ESPECIES ****/
		CreateIndividuo individuos = new CreateIndividuo();
		individuos.create(individuo1);
		individuos.create(individuo2);
		
		/**** CREAMOS LAS TORRETAS ****/
		CreateTorreta torretas = new CreateTorreta();
		torretas.create(torreta1);
		
		/**** CREAMOS LOS MOVIMIENTOS ****/
		CreateMovimiento movimientos = new CreateMovimiento();
		movimientos.create(movimiento1);
		
		/**** CREAMOS LOS INFORMES ****/
		CreateInforme informes = new CreateInforme();
		informes.create(informe1);
		
		/**** CREAMOS LOS BIOLOGOS ****/
		CreateBiologo biologos = new CreateBiologo();
		biologos.create(pedro);
		
		
		ConnectionEntityManagerFactory.getEntityManagerFactory().close();
	}

}
