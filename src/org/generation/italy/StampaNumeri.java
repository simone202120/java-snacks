package org.generation.italy;
import java.util.Scanner;

public class StampaNumeri {
	public static void main(String[] Args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		
		int numero = in.nextInt();
		
		if (numero %2 == 0) {
			System.out.println(numero);
		}else {
			System.out.println(numero + 1 );
		}
	}
	
}
