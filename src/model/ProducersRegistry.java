package model;

import java.util.ArrayList;
import java.util.List;

public class ProducersRegistry {
	
	private List<Producer> producers = new ArrayList<>();
	
	/**
	  * Registrar un vendedor: Se indica el nombre del vendedor y su dirección. Se agrega el vendedor y se lo retorna. 
	  * 
	  * @param nombre
	  * @param direccion
	  * @return
	  */
	public Producer addProducer(String name, String direccion) {
		Producer prod = new Producer(name);
		this.producers.add(prod);
		return prod;
	}
	
	/**
	* Buscar un vendedor: Se indica el nombre del vendedor que se desea buscar/recuperar. Si existe lo retorna.
	* Si no, retorna null. Asuma que no hay nombres repetidos.
	* 
	* @param name
	* @return
	*/
	public Producer findProducerByName(String name) {
		for (Producer prod : producers) {
			if ( prod.getName().equals(name)) {
				return prod;
			}
		}
		return null;
	}

}
