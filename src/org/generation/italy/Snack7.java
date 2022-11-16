package org.generation.italy;
import java.util.Stack;

public class Snack7 {
	public static void main(String[] args) {
		String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };
		String concatenazione=" ";
		String concatenazioneInversa=" ";
		
		for(int x=0; x<words.length; x++) {
			concatenazione += words[x]+ " " ;
		}
		for(int x=7; x>0; x--) {
			concatenazioneInversa += words[x]+ " " ;
		}
		
		System.out.println(concatenazione);
		System.out.println(concatenazioneInversa);
	}

}
