package org.generation.italy;
import java.util.ArrayList;
import java.util.List;

public class Snack6 {
	public static void main(String[] args) {
		
		int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
		int ValMaxArr1=0;
		int ValMaxArr2=0;
		int ValMax=0;
		int ValMinArr1=100;
		int ValMinArr2=100;
		int ValMin=100;
		int media=0;
		int avg=0;
		int sommaTot=0;
		
		List<String> SommaArray= new ArrayList<String>();
		
		for(int x=0; x<arr1.length;x++) {
			 
			int somma = arr1[x] + arr2[x];
			String somma2=String.valueOf(somma);
			SommaArray.add(somma2);
			
			if(ValMaxArr1 < arr1[x]) {
				ValMaxArr1 = arr1[x];
			}
			if(ValMaxArr2 < arr2[x]) {
				ValMaxArr2 = arr2[x];
			}
			if(ValMaxArr1 > ValMaxArr2 ) {
				ValMax=ValMaxArr1;
			}else {
				ValMax=ValMaxArr2;
			}
			if(ValMinArr1 > arr1[x]) {
				ValMinArr1 = arr1[x];
			}
			if(ValMinArr2 > arr2[x]) {
				ValMinArr2 = arr2[x];
			}
			if(ValMaxArr1 < ValMaxArr2 ) {
				ValMin=ValMinArr1;
			}else {
				ValMin=ValMinArr2;
			}
			avg = arr1[x] + arr2[x];
			media=avg/20;
			sommaTot += arr1[x] + arr2[x];
		}
		
		
		
		
		System.out.println("Array contenente somme degli array precedenti: " + SommaArray);
		System.out.println(ValMax);
		System.out.println(ValMin);
		System.out.println(media);
		System.out.println(sommaTot);


		
	}

}
