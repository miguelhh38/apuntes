import java.util.Scanner;
import javax.swing.JOptionPane;

public class Estructuraswitch {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectángulo \n3 Triangulo \n4 Circulo");
		
		int figura = entrada.nextInt();
		
		switch (figura) {
			
		case 1:
			
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			
			
			System.out.println("El area del cuadrado es " + Math.pow(lado, 2));
			
			break;
			
		case 2:
			
			// ect
		}
	}

}
