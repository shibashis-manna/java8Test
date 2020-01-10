package com.test.java8.exam;

public class Test1 {

	public static void main(String args[]) {
		
		/*String s = "Gfg"; 
		  
        // We must explicitly assign result 
        // of s.concat() to s.  Since not  
        // assigned to s, s does not change. 
        String p = s.concat("! is the best.");  
        System.out.println(s); 
        System.out.println(p);*/
        
		String product = "Pen";
		product.toLowerCase(); 
		//product.contact(" Box".toLowerCase());
		product.concat(" Box".toLowerCase());
		System.out.print(product.substring(4,6));
		//contact method not present in String class
	}

}
