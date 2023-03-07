package miprimerproyecto;

public class HolaMundo {

	public static void main(String[] args) {
		
		System.out.println("Hola mundo!!!");

			
		char unaLetra = 'a';   
		boolean unValorBooleano = true; //true o false
		int miPrimerContador = 66;
		double unValor = 1.68;
		float otroNum = 2.344f;
		
		// OPERACIONES BASICAS
		int suma   = 10 + 20;
		int resta  = 15 - 12;
		int mult   = 10 * 3;
		int div    = 8 / 3;
		int modulo = 8 % 3;
		
		System.out.println(resta);
		
		resta = 15 - 10;
		
		System.out.println(resta);
		
		double variableFloat = 10.10;
		
		resta = (int) variableFloat; //Castear una variable: Transformar el valor de una variable a un tipo de dato distinto
		
		System.out.println(resta);
		
		// PRECEDENCIA
		int precedencia1 = 3 * 2 +  3;
		System.out.println(precedencia1);
		int precedencia2 = (3 * 2) +  3;
		System.out.println(precedencia2);
		int precedencia3 = 3 + 3 * 2;
		System.out.println(precedencia3);
		
		boolean booleanoPrueba = 10>20;
		System.out.println(booleanoPrueba);
		
		booleanoPrueba = 15 >= 12;
		System.out.println(booleanoPrueba);
		
		boolean unBooleano = true;
		boolean otroBooleano = false;
		
	    System.out.println("NOT:"+!unBooleano); // false
	    System.out.println("AND:"+ (unBooleano && otroBooleano));// false
	    System.out.println("OR:"+ (unBooleano || otroBooleano ));// true SE ANALIZAN AMBOS OPERANDOS
	    System.out.println("Múltiple:"+ (unBooleano && (otroBooleano || true)));// true   
				
	    
	    
	    
	}

}
