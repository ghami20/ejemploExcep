package Ejemplo;

import java.util.LinkedList;

public class Stock {

	private static LinkedList<Producto> productos;
	
	private Stock() {
		productos = new  LinkedList<Producto> ();
	}
	
	public static LinkedList<Producto> getInstancia(){
		if (productos==null) {
			new Stock();
		}else {
			//System.out.println("Ya existe");
		}
		return productos;
	}
}
