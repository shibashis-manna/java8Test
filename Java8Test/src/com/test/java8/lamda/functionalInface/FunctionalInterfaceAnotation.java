package com.test.java8.lamda.functionalInface;

public class FunctionalInterfaceAnotation {

	@FunctionalInterface
	interface Operations {
		public int coreOperations(int x, int y);
	}

	public int MathOperation(int x, int y, Operations operations) {
		return operations.coreOperations(x, y);
	}
	
	public static void main(String args[]) {
		FunctionalInterfaceAnotation functionalInterfaceAnotation = new FunctionalInterfaceAnotation();
		
		int result = functionalInterfaceAnotation.MathOperation(3, 4, (a, b)->a+b);
		System.out.println(result);
		
		result = functionalInterfaceAnotation.MathOperation(3, 4, (a, b)->a-b);
		System.out.println(result);
		
		result = functionalInterfaceAnotation.MathOperation(3, 4, (a, b)->a*b);		
		System.out.println(result);
		
		result = functionalInterfaceAnotation.MathOperation(3, 4, (a, b)->a/b);
		System.out.println(result);
		
	}
}
