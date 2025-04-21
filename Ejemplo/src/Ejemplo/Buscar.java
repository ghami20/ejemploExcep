package Ejemplo;

import javax.swing.JOptionPane;

public interface Buscar {
	
	default Producto buscar(int index) {
		try {
			return Stock.getInstancia().get(index);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"No se encontró");
			return null;
		}
	}

}
