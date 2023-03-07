package miprimerproyecto.Clase03;

import java.util.Arrays;

public class ClaseConStrings {

	public static void main(String[] args) {
		
		
		String txt1 = "Hola clase!";
		
		System.out.println(txt1);
		
		String stringQueQuieroImprimir = "Longitud de la variable String:" + txt1.length();
		System.out.println(stringQueQuieroImprimir);
		
		System.out.println("Imprimir el primer elemento: \""+txt1.charAt(4)+"\"");
		
		System.out.println(txt1.contains("CL"));
		
		String txt2 = "Hola\t clase!";
		
		if(txt1.equals(txt2)) {
			System.out.println("Si, los strings almacenan lo mismo");
		}
		
		System.out.println("Pruebas de UpperCase");
		
		System.out.println(txt2.toUpperCase());
		
		System.out.println(txt2);
		
		System.out.println("Voy a reemplazar el Hola con el Chau");
		
		System.out.println(txt2.replace("Hola","chau")); //Prestar atención a las mayúsculas y minúsculas
		
		String nombreYApellido = "Ramirez, Nahuel";
		
		String[] nombreYApellidoSeparados = nombreYApellido.split(",");
		
		String apellido = nombreYApellidoSeparados[0];
		String nombre = nombreYApellidoSeparados[1];
		
		
		System.out.println(nombre);
		
		String muchasPalabras = "casa arbol semilla casa";
		
		String[] muchasPalabrasSeparadas = muchasPalabras.split(" ");
		
		for(String unaPalabra : muchasPalabrasSeparadas) {
			
			System.out.println(unaPalabra);
		}
	
		
	}

}
