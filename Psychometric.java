package com.tutorial.first;
import java.io.IOException;
import java.util.*;
public class Psychometric {
	
	static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
		int[] result = new int[lowerLimits.length];
		for( int i = 0; i<lowerLimits.length ; i++) {
			result[i] = scoreRange(scores, lowerLimits[i], upperLimits[i]);
		}
		return result;
	}
	
	private static int scoreRange(int[] score, int lowerLimit , int upperLimit) {
		int count = 0;
		for(int i=0;i<score.length; i++) {
			if(score[i] >= lowerLimit && score[i] <= upperLimit){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] scores = new int[t];
		for(int i = 0; i<t; i++) {
			scores[i] = sc.nextInt();
		}
		t = sc.nextInt();
		int[] lowerLimits = new int[t];
		for(int i = 0; i<t; i++) {
			lowerLimits[i] = sc.nextInt();
		}
		t = sc.nextInt();
		int[] upperLimits = new int[t];
		for(int i = 0; i<t; i++) {
			upperLimits[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(Arrays.toString(jobOffers(scores, lowerLimits, upperLimits)));
	}
}
