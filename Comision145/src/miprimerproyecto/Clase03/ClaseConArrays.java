package miprimerproyecto.Clase03;

public class ClaseConArrays {

	public static void main(String[] args) {
		
		//Una forma de crear un array
		int numeros[] = {1,23,32};
		
//		numeros[0] = 1;
//		numeros[1] = 23;
//		numeros[2] = 32;
		
		
		// i++   ->   i = i  + 1;
		// i--    ->   i = i - 1;
		
		for(int i = (numeros.length - 1); i >= 0 ; i--) {
			System.out.println(numeros[i]);
		}
		
		//Prueba de que sucede cuando queremos imprimir la variable del array
		System.out.println(numeros);
		
		System.out.println("Ejemplo de un array con Char:");
		
		float numerosFloat[] = new float[10];
		
		char letras[] = {'a','b','c'};
				
		for (char letra : letras){
			 System.out.println(letra);
		}
		
		for (int unNum : numeros){
			 System.out.println(unNum);
		}
		
	}
	
	

}
