package com.tutorial.first;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class LargestSum {
	static long[] maxSubsetSum(int[] k) {
		long[] result=new long[k.length];
		for(int i =0; i<k.length; i++){
			result[i] = SumLcm(k[i]);
		}
		return result;
	}
	private static long SumLcm(int num) {
		long count = 0;
    	for(int i = 2; i <= num; i++) {
	        if(num % i == 0) {
	            count+= i;
	        }
    	}
    	return count+1;
	}
	public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] k = new int[t];
		for(int i = 0; i<t; i++) {
			k[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(Arrays.toString(maxSubsetSum(k)));
	}
}
