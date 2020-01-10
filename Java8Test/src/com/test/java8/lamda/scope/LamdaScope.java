package com.test.java8.lamda.scope;

public class LamdaScope extends SupperScope {
	final String member = "GRANDPA";
	
	interface Family {
		String who(String member);
	}
	
	public void testMember(String member) {
		System.out.println("local memner: " +member);
		System.out.println("family memner: " +this.member);
		System.out.println("super memner: " +super.member);
		
		Family familyLamda = (familyMember) -> {
			System.out.println("local lamda memner: " +familyMember);
			System.out.println("family lamda memner: " +this.member);
			System.out.println("super lamda memner: " +super.member);
			
			return familyMember;
		};
		familyLamda.who(member);
	}
	
	public static void main(String[] args) {
		new LamdaScope().testMember("SON");
	}

}
