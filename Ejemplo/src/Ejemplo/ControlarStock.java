package Ejemplo;

import javax.swing.JOptionPane;

public interface ControlarStock {
	
	default void AgregarProducto() {
		String producto = JOptionPane.showInputDialog("Ingresar nombre");
		int precio=0;
		boolean flag ;
		do {
			flag = false;
			try {
				precio = Integer.parseInt(JOptionPane.showInputDialog("Ingresar precio"));
				flag = true;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error al ingresar precio");
			}
		} while (flag==false);
		Stock.getInstancia().add(
				new Producto(producto,precio)
				);
	}

}
