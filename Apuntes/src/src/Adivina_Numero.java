import java.util.*;

// BUCLE WHILE

public class Adivina_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio=(int)(Math.random()*100); //refundicion
		System.out.println(aleatorio);   
		//Math.random genera numeros aleatorios entre 0 y 1
		// por tanto multiplicamos por 100 para obtener numero entre 0 y 100
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		int intentos=0;
		
		while(numero!=aleatorio) {
			intentos++;
			System.out.println("Introduce un numero: ");
			numero=entrada.nextInt();
		
			if(aleatorio<numero) {
				System.out.println("El numero introducido es mayor al aleatorio");
				
			}
			else if (aleatorio>numero) {
				System.out.println("El numero introducido es menor al aleatorio");
				
			}	
			
		}
	System.out.println("El numero es correcto");
	System.out.println("Has requerido de " + intentos + " intentos");
	}

}
