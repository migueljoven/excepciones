package ejercicios;

public class TestConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(Conversion.convertirBinarioADecimal("111"));
			System.out.println(Conversion.convertirHexadecimalABinario("111j"));
		} catch (NoBinarioException e) {
			// TODO Auto-generated catch block
			System.out.println("No es un número binario");
		} catch (NoHexadecimalException e) {
			// TODO Auto-generated catch block
			System.out.println("No es un número hexadecimal");
		}

	}

}
