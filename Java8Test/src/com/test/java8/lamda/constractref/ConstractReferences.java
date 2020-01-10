package com.test.java8.lamda.constractref;

public class ConstractReferences {
	
	class Movie {
		// constractor
		public Movie() {
			
		}
		// constractor 2
		public Movie(int i) {
			
		}
		//constractor 3
		public Movie(int i, String s) {
			
		}		
		
	}
	
	interface MovieFactory {
		public Movie create(int i);
	}
	
	MovieFactory mf =  (i)-> new Movie();
	MovieFactory mf1 = Movie::new;
	
	interface MovieFactory2 {
		public Movie create(int i, String s);
	}
	
	MovieFactory2 mf2 =  (i,j)-> new Movie();
	MovieFactory2 mf3 = Movie::new;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
