package miprimerproyecto.Clase05;

import miprimerproyecto.Entidades.Carrito;
import miprimerproyecto.Entidades.Persona;
import miprimerproyecto.Entidades.Producto;

public class IntroduccionAObjetos {

	public static void main(String[] args) {
		
		//Instancie una persona
		Persona nahuel = new Persona("Nahuel","Ramirez");
		
		//Instancie 3 productos
		Producto harina = new Producto("harina");
		Producto roastBeef = new Producto("roast beef","Carne de tenera",1200.5);
		Producto leche = new Producto("leche","Producto lacteo ultra pasteurizado",250.0);
		
		//InstancioUnCarrito
		Carrito unCarrito = new Carrito(nahuel,harina,roastBeef,leche);
		
		System.out.println(unCarrito.costoFinal());
		
	}

}
