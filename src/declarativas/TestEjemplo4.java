package declarativas;

import java.io.File;
import java.io.FileNotFoundException;

public class TestEjemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int longitud=115;
        File inFile = new File("/home/progrmacion/Descargas/nombres_mujer.txt");
        try {
			String nombreBuscado = Ejemplo4.buscarPalabra(inFile, longitud);
			System.out.println("Nombre buscado: "+nombreBuscado);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Fichero no encontrado");
		}
	}

}
