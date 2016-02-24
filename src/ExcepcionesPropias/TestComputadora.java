package ExcepcionesPropias;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestComputadora {

	public static void main(String[] args) {
		// Guardamos en una colección de 3 computadors
		List<Computadora> lista = new ArrayList<Computadora>();
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce datos:");
		while (in.hasNextLine() && lista.size()!=3){
			String nombre = in.next();
			double hd = in.nextDouble();
			double ram = in.nextDouble();
			String mac = in.next();
			try {
				Computadora c = new Computadora(nombre, hd, ram, mac);
				lista.add(c);
			} catch (NoMACCorrectaException e) {
				// TODO Auto-generated catch block
				System.out.println("Dirección MAC errónea");
			}
		}
		System.out.println(lista);

	}

}
