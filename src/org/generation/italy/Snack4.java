package org.generation.italy;

import java.util.Random;

public class Snack4 {
	public static void main(String[] args) {
		
		int [] array1 = new int [10];
		int [] array2 = new int [5];
		
		for ( int z=0; z < array1.length; z++) {
			Random numeroRandom = new Random();
			int numeriArray = numeroRandom.nextInt(100);
		}
		
		
		int numeroElemntiDaAggiungere = array1.length - array2.length;
		
		for (int x=0; x<numeroElemntiDaAggiungere; x++) {
			
			Random numeroRandom2 = new Random();
			int number = numeroRandom2.nextInt(100);
			System.out.println(number);
			
		}

	}
}
