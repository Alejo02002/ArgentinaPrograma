package miprimerproyecto.Clase04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MiPrograma {

	public static void main(String[] args) {
		
		String archivoPathAbsoluto = "J:\\Documents\\GitHub\\ArgentinaPrograma2.0-145\\Comision145\\src\\miprimerproyecto\\ArchivoTexto.txt";
		
		String archivoPathRelativo = "recursos/ArchivoTexto.txt";
		
		try {
			
			for(String linea : Files.readAllLines(Paths.get(archivoPathAbsoluto))) {
				System.out.println(linea);
			}
			
		}catch(FileNotFoundException s){
			System.out.println("El archivo no existe.");
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
