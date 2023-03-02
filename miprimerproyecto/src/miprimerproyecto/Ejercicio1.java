package miprimerproyecto;

public class Ejercicio1 {

// Java - Sintaxis Básica - Variables y Tipos de datos primitivos
	
	char unaLetra = 'a';   
	boolean unValorBooleano = false;
	int miPrimerContador = 66;
	double unValor = 1.70;
	float otroNum = 2.344f;
	
	public static void main(String[] args) {
		
		//char unaLetra = 'a';
//		 boolean unValorBooleano = true;
//		 int miPrimerContador = 66;
//		 double unValor = 1.68;
//		 float otroNum = 2.344f;

		
		
		// OPERACIONES BASICAS
		int i      = 13;
		int j      = 10;

		int suma   = 10 + 20;
		int resta  = 15 - 12;
		int mult   = 10 * 3;
		int div    = 8 / 3;
		int modulo = 8 % 3;
		
		System.out.print("Suma :");
		System.out.println(suma );
		System.out.print("Resta :");
		System.out.println(resta);
		System.out.print("Multiplicacion :");
		System.out.println(mult);
		System.out.print("Division :");
		System.out.println(div);
		System.out.print("Modulo :");
		System.out.println(modulo);	
		
		// PRECEDENCIA
		int precedencia1 = 3 * 2 +  3;
		System.out.println(precedencia1);
		int precedencia2 = (3 * 2) +  3;
		System.out.println(precedencia2);
		int precedencia3 = 3 + 3 * 2;
		System.out.println(precedencia3);
		
		//Operaciones y predicados
		boolean unBooleano = true;
		boolean otroBooleano = false;
		
		boolean booleandoPrueba = 10 > 20;
		System.out.println(booleandoPrueba);
		booleandoPrueba = 15 >= 12;
	    System.out.println(booleandoPrueba);
	    booleandoPrueba = 10 == 3;
	    System.out.println(booleandoPrueba);
	    booleandoPrueba = 8 != 3;
	    System.out.println(booleandoPrueba);

				   
	    System.out.println("NOT:"+!unBooleano); // false
	    System.out.println("AND:"+ (unBooleano && otroBooleano));// false
	    System.out.println("OR:"+ (unBooleano || otroBooleano ));// true SE ANALIZAN AMBOS OPERANDOS
	    System.out.println("Múltiple:"+ (unBooleano && (otroBooleano || true)));// true   
				
        int x = 0;
        int y = 2;
        boolean b = ( x != 0 ) && ( ( y / x ) != 0 );
        System.out.println("Complejo: "+b);
        
        // Bucles

        int unValor = 1;
        int otroNum = 5;
        int otroValor = 2;
        if(unValor < otroNum) {
            //una accion
          }
        
          if(unValor < otroNum) {
             //una accion
          } else {
            //otra accion
          }

          
          char unaLetra = 'a';
          switch (unaLetra){
            case 'b':
              //Hacer A
              break;
            case 'a':
              //Hacer B
              break;
            default:
              //Hacer Z
          }

          //unBooleano && (otroBooleano || true)
          if(unValor < otroNum) {
               //una accion
             }


          boolean unaCond = unValor == (otroValor + 1);

          if(unaCond) {
          	// hacer algo
          }

          
          double ingreso = 100; // en $
          int superficio = 30;  // en m2
          int energia = 10000; // en KW
          
          //Primero analizo ingresos para el A, de menor a mayor
          
          
          double ingresosCatA = 748382.07;
          int superficieCatA = 30;
          int energiaCatA = 3330;
          
          double ingresosCatB = 1112459.83;
          int superficieCatB = 45;
          int energiaCatB = 5000;
          
          double ingresosCatC = 1557443.75;
          int superficieCatC = 60;
          int energiaCatC = 6700;
          
          double ingresosCatD = 1934273.04;
          int superficieCatD = 85;
          int energiaCatD = 10000;
          
          double ingresosCatE = 2277684.56;
          int superficieCatE = 110;
          int energiaCatE = 13000;
          
          double ingresosCatF = 2847105.70;
          int superficieCatF = 150;
          int energiaCatF = 16500;
          
          double ingresosCatG = 3416526.83;
          int superficieCatG = 200;
          int energiaCatG = 20000;
          
          double ingresosCatH = 4229985.60;
          int superficieCatH = 200;
          int energiaCatH = 20000;
          
          
          boolean condicionX = true;
          while(condicionX){
        	     //Una Accion
        	//En algun momento se tiene 
        	// modificar la condicionX 
        	   }

        	for(i = 0;i<=10;i++){
        	  //Una Accion
        	}

        	
        	int unNum = 10;
        	while(unNum > 0){
        	     System.out.println(unNum);
        	     unNum = unNum -1;
        	   }

        	   for(int otroNum1=0;otroNum1<10;otroNum1++){
        	     System.out.println(otroNum1);
        	   }

          
        
        
		System.out.println("Hola mundo");
	}

}
