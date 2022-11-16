package org.generation.italy;

public class Snack3 {
	public static void main(String[] args) {
		
		int [] arrayNumeri = {10, 12, 11, 5, 4, 45, 39, 2, 9, 32, 25};
		int somma=0;
		
		for(int x=0; x < arrayNumeri.length; x++) {
			if(x%2==0) {
				somma += arrayNumeri[x];
			}
		}
		System.out.println(somma);
	}
}
