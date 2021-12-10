
public class Uso_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mi_matriz[] = new int [5];
		
		mi_matriz[0]=5;
		mi_matriz[1]=2;
		mi_matriz[2]=3;
		mi_matriz[3]=92;
		mi_matriz[4]=6;
		
		System.out.println(mi_matriz[3]);
		System.out.println(mi_matriz[0]);
		//ect
		
		//para recorrer arrays mayores:
		for(int i=0; i<5; i++) {
			System.out.println(mi_matriz[i]);
		}
		
		
		//otra forma de declarar matrices
		
		int mi_matriz2[]= {5, 30, 92, 5};
		
		System.out.println(mi_matriz2[0]);
		
		for(int i=0; i<mi_matriz2.length; i++) {
			System.out.println(mi_matriz2[i]);
		}

	}

}
