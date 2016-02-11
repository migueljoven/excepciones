package declarativas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo4 {
	//devuelve la primera palabra de una longitud dada
	//de un fichero
	
	public static String buscarPalabra(File inFile, int longitud) throws FileNotFoundException{
		String palabra="";
		//lógica
		Scanner in = new Scanner(inFile);
		String auxiliar="";
		while(in.hasNextLine()){
			auxiliar = in.nextLine();
			if (auxiliar.length()==longitud){
				palabra = auxiliar;
				break;
			}
		}
		in.close();
		return palabra;
	}
}
