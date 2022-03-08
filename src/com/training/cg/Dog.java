package com.training.cg;

public class Dog extends Animal {

	public static void main(String[] args) {
		Dog a= new Dog();
		a.name="steve";
		a.type="dog";
		a.age=5;
		System.out.println(a.getInfo());
		
	}

}
