package declarativas;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ejemplo3{
        public static void main(String[] arg){
                File inFile = new File("/home/progrmacion/Descargas/nombres_mujer.txt");
                try (Scanner in = new Scanner(inFile);){
                        while(in.hasNext())
                                System.out.print(in.next()+"--");
                } catch (FileNotFoundException e){
                        System.out.println("No existe el fichero");
                }
        }
} 