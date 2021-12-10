import java.util.Scanner;

public class Uso_arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//String paises[]=new String[8];
		
		/*paises[0]="España";
		paises[1]="Ecuador";
		paises[2]="Chile";
		paises[3]="Argentina";
		paises[4]="Colombia";
		paises[5]="Alemania";
		paises[6]="Japon";
		paises[7]="China";
		*/
		/*for(int i=0; i<paises.length; i++) {
			System.out.println("Pais " + (i+1) + " " + paises[i]);
			
			
		}
		*/
		
		//BUCLE FOR MEJORADO
		//for(String elemento:paises) {
		//	System.out.println("Pais: " + elemento);
			
		
		//}
		
		// para almacenar datos en arrays:
		
		Scanner entrada = new Scanner(System.in);
		
		String lista_paises[] = new String[10];
		
		
		for(int i=0; i<lista_paises.length; i++) {
			System.out.println("Introduce pais:");
			lista_paises[i] = entrada.nextLine();
		}
		
		for(String lista:lista_paises) {
			System.out.println("PAIS: " + lista);
		}
		
	}

}
