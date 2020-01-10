package com.test.java8.lamda;

public class DifferentWayLamda {
	interface FirstInterface {
		public void singleMethod(String s);
	}

	 public void print(FirstInterface firstInterface){
		  firstInterface.singleMethod("apple");
		 }
		 
		 public static void main(String args[]){
			 DifferentWayLamda printer=new DifferentWayLamda();
			 <span class="jb-highlight-lightblue">printer.print((String param) -> {System.out.println("My lambda says "+ param);});</span>
		 }

}
