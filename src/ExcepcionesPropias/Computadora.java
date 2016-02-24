package ExcepcionesPropias;

public class Computadora {
	private String nombre;
	private double hd;
	private double ram;
	private String mac;
	/**
	 * @param nombre
	 * @param hd
	 * @param ram
	 * @param mac
	 * @throws NoMACCorrectaException 
	 */
	public Computadora(String nombre, double hd, double ram, String mac) throws NoMACCorrectaException {
		if (esValidaMAC(mac)){
			this.nombre = nombre;
			this.hd = hd;
			this.ram = ram;
			this.mac = mac;
		}
		else 
			throw new NoMACCorrectaException();
	}
	private boolean esValidaMAC(String mac){
		return mac.matches("[\\da-fA-F]{12}");
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Computadora [nombre=" + nombre + ", hd=" + hd + "GB, ram=" + ram + "GB, mac=" + formatearMAC() + "]";
	}
	private String formatearMAC(){
		String mac="";
		//lógica
		for (int i = 0; i < 12; i++) {
			if (i>0 && i%2 ==0)
				mac+=":";
			mac+=this.mac.charAt(i);
		}
		return mac;
	}
	
}
