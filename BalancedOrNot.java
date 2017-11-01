package com.tutorial.first;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BalancedOrNot {
	static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {
		int[] result = new int[expressions.length];
		for(int i=0; i<expressions.length; i++){
			result[i] = checkExp(expressions[i], maxReplacements[i]);
		}
		return result;
	}
	private static int checkExp(String exp, int replac){
		Stack<Character> stack = new Stack<Character>();
		for( int i=0; i<exp.length(); i++){ 
			char ch = exp.charAt(i);
			if (ch == '<') {
				stack.push(ch);
			}else if(ch == '>'){
				if(stack.isEmpty() || (stack.pop() != '<')){  
					if(replac  > 0){
						replac--;
					}else{
						return 0;
					}
		        }
			}	
		}
		if(stack.isEmpty() || stack.size() <= replac){
			return 1;
		}
		return 0;
	}
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String[] expressions = new String[t];
		for(int i = 0; i<t; i++) {
			expressions[i] = sc.next();
		}
		t = sc.nextInt();
		int[] maxReplacements = new int[t];
		for(int i = 0; i<t; i++) {
			maxReplacements[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(Arrays.toString(balancedOrNot(expressions, maxReplacements)));
	}
}
