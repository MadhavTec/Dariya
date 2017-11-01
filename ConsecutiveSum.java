package com.tutorial.first;

import java.io.IOException;
import java.util.Scanner;

public class ConsecutiveSum {
	
	static int consecutive(long num) {
		int count = 0;
		for(int i = 1; (i*(i+1)/2) < num; i++){
			float a = (float)((2 * num)-(i * (i+1))) / (2 * (i+1));
			if(a-(int)a == 0.0){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		long num = sc.nextInt();
		sc.close();
		System.out.println(consecutive(num));
	}
}
