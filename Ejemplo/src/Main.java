import javax.swing.JOptionPane;

public class Main {

	
	public static void main(String[] args) {
		
		try {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese num"));
			int result = 3/num;
			String []nombres = new String[1];
			JOptionPane.showMessageDialog(null, nombres[num]);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "No escribiò un nùmero entero");
		}catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "No se puede dividir por 0");
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Hubo un error");
		}
		
		
		JOptionPane.showMessageDialog(null, "Sigue");
	}
}
