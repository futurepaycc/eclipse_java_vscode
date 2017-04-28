package com.liuinix.main;

public class Main {

	public static int fib(int n){
		if(n<4) return n;
		return fib(n-1) + fib(n-2);
	}
	
	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			int result = fib(i);
			System.out.println(result);
		}
	}
		
}
































