package miprimerproyecto.Clase03;

public class CuestionarioClase03 {

	public static void main(String[] args) {
		
		
		String txt1 = "  \\  ";
		
		System.out.println(txt1);
		
		//Segunda pregunta del cuestionario
		
		String txt2 = "hola que tal?";
		
		System.out.println(txt2.toUpperCase().replace("hola","chau"));
		
		//Tercera pregunta
		
		int numeros[] = {1,37,16};
		
		System.out.println(numeros[2]);
		
		
		//Dada la siguiente sentencia: 
		//String[] separado = "3_tristes tigres_del_13".split("_") , indique la opción correcta:
		
				
		String[] separado = "3_tristes tigres_del_13".split("_"); 
		
		// separado = {"3" , "tristes tigres", "del", "13"};
		
		System.out.println(separado[1]);
		
		
		
		//Quinta pregunta
		
		char letras[] = {'a','b','c','d'};

		int numeros2[] = new int[]{1,37,16};

		for(int i=0;i<numeros2.length;i++){
			if (numeros2[i] < 30) {
				System.out.println(letras[i+1]);
			} else {
				System.out.println(numeros2[i]);
			}
		}

	}

}
