import java.util.Scanner;

public class Uso_bucle_for {
	
	public static void main(String[] args) {
		
		// for(int i=0; i<10; i++) {
		//	System.out.println("Juan");
		//}
		
		// esto solo seria posible para una arroba, si aparecieran más tambien daria correcto, la solucion seria muy sencilla
		
		System.out.println("Introduce tu email");
		Scanner entrada = new Scanner(System.in);
		boolean arroba=false;
		
		String mail = entrada.nextLine();
		
		for (int i=0; i<mail.length(); i++) {
			if(mail.charAt(i)=='a') {
				arroba=true;
			}	
		}
		
		if(arroba==true) {
			System.out.println("El mail es correcto");

		}
		
		else {
			System.out.println("El mail es incorrecto");
		}
		
	}
	
	
}
