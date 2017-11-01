package com.tutorial.first;

import java.io.IOException;
import java.util.Scanner;

public class FindWinner {
	static String winner(int[] andrea, int[] maria, String s) {
		int person1Wins = 0;
		int person2Wins = 0;
		int inital = 0;
		if(s.equals("Odd")){
			inital = 1;
		}
		for(int i= inital; i< andrea.length; i+=2){
				person1Wins += andrea[i] - maria[i];
				person2Wins += maria[i] - andrea[i];
		}
		if(person1Wins > person2Wins){
			return "Andrea";
		}
		if(person1Wins < person2Wins){
			return "Maria";
		}
		return "Tie";
	}
	
	public static void main(String []args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] andrea = new int[t];
		for(int i = 0; i<t; i++) {
			andrea[i] = sc.nextInt();
		}
		t = sc.nextInt();
		int[] maria = new int[t];
		for(int i = 0; i<t; i++) {
			maria[i] = sc.nextInt();
		}
		String s = sc.next();
		sc.close();
		System.out.println(winner(andrea, maria, s));
	}
}
