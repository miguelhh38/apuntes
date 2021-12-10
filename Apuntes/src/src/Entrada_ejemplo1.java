import java.util.*;
public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce la edad: ");
		
		int edad=entrada.nextInt();
		
		System.out.println("Nombre: " + nombre_usuario + " Edad: " + edad);
	}

}

