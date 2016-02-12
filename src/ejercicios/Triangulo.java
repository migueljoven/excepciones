package ejercicios;
/**
 * 
 * @author progrmacion
 * @version 1.0
 */
public class Triangulo {
	//atributos: los tres lados
	private int lado1;
	private int lado2;
	private int lado3;
	/**
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 * @throws IlegalTrianguloExcepcion 
	 */
	public Triangulo(int lado1, int lado2, int lado3) throws IlegalTrianguloExcepcion {
		if (esTriangulo(lado1, lado2, lado3)){
			this.lado1 = lado1;
			this.lado2 = lado2;
			this.lado3 = lado3;
		}
		else throw new IlegalTrianguloExcepcion();
	}
	private boolean esTriangulo(int lado1, int lado2, int lado3){
		return lado1+lado2 > lado3 && lado1+lado3 > lado2 
				&& lado2 +lado3 > lado1 ;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Triangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + "]";
	}
	
}
