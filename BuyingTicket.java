package com.tutorial.first;

import java.io.IOException;
import java.util.Scanner;

public class BuyingTicket {
	
	static long waitingTime(int[] tickets, int p) {
		long ticCount = 0;
		int repeatTime = tickets.length * tickets[p];		
		while(repeatTime > 0){
			for(int i=0; i<tickets.length; i++){
				if(tickets[i] > 0){
					tickets[i]--;
					ticCount++;	
					if( i == p && tickets[i] == 0){
						return ticCount;
					}
				}
			}
			repeatTime--;
		}
		return ticCount;
	}
	
	
	public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] tickets = new int[t];
		for(int i = 0; i<t; i++) {
			tickets[i] = sc.nextInt();
		}
		int p = sc.nextInt();
		sc.close();
		System.out.println(waitingTime(tickets, p));
	}
}
