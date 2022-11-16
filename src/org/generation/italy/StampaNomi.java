package org.generation.italy;

public class StampaNomi {
	public static void main(String[] Args) {

		String[] nomi = {"Mario", "Giovanni", "Michele", "Antonio"};
		String[] cognomi = {"Giannattasio", "Puppa", "Topolino", "Paperino"};
		
		for (int x=0; x<nomi.length; x++) {
			System.out.println(nomi[x] + " " + cognomi[x]);
		}


	}
}
