package Ejemplo;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		Empleado yo = new Empleado("ghami");
		yo.AgregarProducto();
		int producto = Integer.parseInt(
				JOptionPane.showInputDialog("Ingresar indice de producto"));
		JOptionPane.showMessageDialog(null, 
				yo.buscar(producto)==null?"No existe":yo.buscar(producto)
				);
		
		
	}

}
