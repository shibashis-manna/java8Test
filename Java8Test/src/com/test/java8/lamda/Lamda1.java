package com.test.java8.lamda;

public class Lamda1 {

	public static void main(String[] args) {
		

	}
	
	/**
	 * () -> System.out.println("Hello");
	 */
	public void m1(){
		System.out.println("Hello");
	}
	
	/**
	 * (a,b) - > System.out.println(a+b);
	 * @param a
	 * @param b
	 */
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	/**
	 * (n) -> n*n; - valid
	 * n->n*n; -> valid
	 * n->{return n*n;}; -> valid
	 * n->{return n*n};--invalide
	 * n->{n*n;}; -- invalide
	 * @param n
	 * @return
	 */
	public int squireIt(int n) {
		return n*n;
	}
	
}
