package com.test.java8.lamda;

import java.util.concurrent.SynchronousQueue;

public class InterfaceReferenceExample {

	public static void main(String[] args) {
		Intf inf = ()->System.out.println("simple method call..");
		inf.m1();
		

	}

}

interface Intf {
	public void m1();
}
