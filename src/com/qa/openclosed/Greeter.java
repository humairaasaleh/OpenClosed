package com.qa.openclosed;

public class Greeter {

	private Greeting greeting;
	
	

	public Greeter() {
		super();
	}

	public Greeter(Greeting greeting) {
		super();
		this.greeting = greeting;
	}

	public Greeting getGreeting() {
		return greeting;
	}

	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}
	public String greetPeople() {
		return this.greeting.greet();
	}

}
