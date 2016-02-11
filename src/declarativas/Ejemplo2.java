package declarativas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ejemplo2 {
	public static void main(String[] args) {
		BufferedReader in =null;
		try {
			URL url = new URL("http://www.ideal.es/jaen");
			URLConnection conexion = url.openConnection();
		
			in =  new BufferedReader(
					new InputStreamReader(
							conexion.getInputStream()));
			String leido;
			while((leido=in.readLine())!=null)
				System.out.print(leido);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if (in !=null){
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
