package org.generation.italy;

import java.util.Random;

public class Snack4 {
	public static void main(String[] args) {
		
		int [] array1 = {10, 12, 11, 5, 4, 45, 39, 2, 9, 32, 25};
		int [] array2 = {10, 12, 11, 5, 4, 45};
		
		int numeroElemntiDaAggiungere = array1.length - array2.length;
		
		for (int x=0; x<numeroElemntiDaAggiungere; x++) {
			
			Random numeroRandom = new Random();
			int number = numeroRandom.nextInt(500);
			System.out.println(number);
			
		}

	}
}
