package noDeclarativas;

import java.util.Scanner;

public class Ejemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Leer un entero y un decimal: ");
		String enteroCadena = sc.next();
		int entero=0;
		if (enteroCadena.matches("[\\d]+"))
			entero = Integer.parseInt(enteroCadena);
		
		double decimal=0;
		String doubleCadena = sc.next();
		if (doubleCadena.matches("[\\d]+(\\.[\\d]+)?"))
			decimal = Double.parseDouble(doubleCadena);
		
		sc.close();
		System.out.println("Entero: "+entero);
		System.out.println("Decimal: "+decimal);

	}

}
