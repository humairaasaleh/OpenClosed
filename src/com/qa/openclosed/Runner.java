package com.qa.openclosed;

public class Runner {
	public static void main(String[] args) {

		FormalGreeting f = new FormalGreeting();
		CasualGreeting c = new CasualGreeting();
		Greeter greeter = new Greeter();
		
		System.out.println(f.greet());
		System.out.println(c.greet());
		
		Greeter greetFormal = new Greeter(f);
		System.out.println(greetFormal.greetPeople());
		
		Greeter greetCasual = new Greeter(c);
		System.out.println(greetCasual.greetPeople());
	}

}
