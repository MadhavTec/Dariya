package com.tutorial.first;
import java.io.IOException;
import java.util.Scanner;
public class InTheFuture {
	static int minNum(int A, int K, int P) {
		if(A >= K) {
			return -1;
		}
		int count = 0;
		int Adup = A; 
		int kdup = K;
		while(true){
			count++;
			if(Adup+P < kdup){
				return count;
			}
			Adup+=A;
			kdup+=K; 
		}
	}
	
	public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int k = sc.nextInt();
		int p = sc.nextInt();
		sc.close();
		System.out.println(minNum(A,k,p));
	}
}
