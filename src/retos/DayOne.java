package retos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DayOne {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		
		    File archivo = new File("src/retos/datos1");
	        Scanner entrada = new Scanner(archivo);

	        String linea;//La variable línea contiene una linea del fichero SIN EL CARÁCTER SALTO (\n)
	        ArrayList<String> caracteres = new ArrayList();
	        int total = 0;
	        while (entrada.hasNext()) {
	        	linea = entrada.nextLine();
	        	System.out.println(linea);
	        	String array[]=linea.split("");
	        	int inicial = 0, ultimo = 0;
	        	for (int i=0;i<array.length;i++) {
	        		if (array[i].equals("1") || array[i].equals("2") ||array[i].equals("3") ||array[i].equals("4") ||array[i].equals("5") ||
	        				array[i].equals("6") ||array[i].equals("7") ||array[i].equals("8") ||array[i].equals("9") || array[i].equals("0") ) {
	        			
	        			String izq=array[i];
	        			inicial = Integer.parseInt(izq);
	        			break;
	        		}
	        	}

	        	for (int i=array.length-1;i>=0;i--) {
	        		if (array[i].equals("1") || array[i].equals("2") ||array[i].equals("3") ||array[i].equals("4") ||array[i].equals("5") ||
	        				array[i].equals("6") ||array[i].equals("7") ||array[i].equals("8") ||array[i].equals("9") || array[i].equals("0") ) {
	        			
	        			String der=array[i];
	        			ultimo = Integer.parseInt(der);
	        			break;
	        		}
	        	}
	        	//System.out.println(inicial+ " " + ultimo);
	        	
	        	String n1 = String.valueOf(inicial);
	        	
	        	String n2 = String.valueOf(ultimo);
	        	//System.out.println(n1 + " " + n2);
	        	
	        	String t = n1+n2;
	        	//System.out.println(t);
	        	int concatenados = Integer.parseInt(t);
	        	total = total + concatenados;
	        	System.out.println(total);
	        			
	        	
	        	
	        	
	        }
	        
	        
		
		
	}

}
