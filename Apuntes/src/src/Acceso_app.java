import javax.swing.*;

// BUCLE WHILE

public class Acceso_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave="Miguel";
		String pass="";
		
		while (clave.equals(pass)==false) {
			pass=JOptionPane.showInputDialog("Introduce la contrase�a: ");
			
			if (clave.equals(pass)==false) {
				System.out.println("Contrase�a incorrecta");	
			}
			
		}
		System.out.println("contrase�a correcta. Acceso permitido");
		
	}

}
