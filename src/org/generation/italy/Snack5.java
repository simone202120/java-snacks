package org.generation.italy;

public class Snack5 {
	public static void main(String[] args) {
		
		int[] arr = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		
		int valMax=0;
		int valMin=80;
		int avg=0;
		int somma=0;
		
		for (int i=0; i<arr.length; i++) {
			if(valMax < arr[i]) {
				valMax= arr[i];
			}
			if(arr[i] < valMin) {
				valMin= arr[i];
			}
			somma += arr[i];
		}
		avg=somma/arr.length;
		System.out.println("il valore minimo e: " + valMin);
		System.out.println("il valore massimo e: " + valMax);
		System.out.println("la media è: " + avg);
		System.out.println("La somma è: " + somma);
	}
}
