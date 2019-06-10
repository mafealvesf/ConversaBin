import java.util.*;
import java.io.*;

public class Conversao {
	
	public static Scanner leia = new Scanner (System.in);

	public static String binario ( int d ){

		String resp = "" ;
		int resto = 0;
		
		if ( d > 0 ){
		 	
			resto = d%2;
			resp = resp + resto + binario (d/2);
		}	
	   return ( resp );
	}
   public static void main ( String [ ] args ){
		int d = 0;
		System.out.println("Digite um número: ");
      d = leia.nextInt ( );
		String binario = binario ( d );
		String invert = ""; 
      
		for ( int i = binario.length( )-1; i >= 0; i-- ){

			invert = invert + binario.charAt(i);
		} 
	
		System.out.println ( "BINARIO: " +invert );
	}	


	}
