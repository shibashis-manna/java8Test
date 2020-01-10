package com.test.java8.lamda.methodref;

interface IMovie {
	public boolean check(int id);
}

public class MethodReferance {
	
	// static method referance useges
	public void testMovieStaticMethodRef() {
		
		IMovie m1 = MethodReferance::isClassic;
		System.out.println(m1.check(190));
		
		IMovie m2 = (k)->k<100?true:false;
		System.out.println(m2.check(90));
	}
	
	// instance method referance useges
	
	public void testInstancemethodRef() {
		MethodReferance ref = new MethodReferance();
		IMovie m1 = (m)->m<10?true:false;
		IMovie m2 = ref::isTopTen;
		System.out.println(m1.check(18) +"...."+m2.check(20));
		
	}
	
	// Other method reference
	public void otherMethodReferance() {
		IMovie m2 = SomeMethodReferance::isComedy;
		System.out.println(m2.check(18));
	}
	
	public boolean isTopTen(int i) {
		return true;
	}
	
	
	public static boolean isClassic(int movieId) {
		return movieId<100?true:false;
	}
	

	public static void main(String[] args) {
		MethodReferance client =  new MethodReferance();
		client.testMovieStaticMethodRef();
		
		client.testInstancemethodRef();
		
		client.otherMethodReferance();
	}

}
class SomeMethodReferance {
	public static boolean isComedy(int i) {
		return i<10 ?true :false;
	}
}
