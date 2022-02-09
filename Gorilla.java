package com.louie.zookeeper;

public class Gorilla extends Mammal {
	
	//constructor
	public Gorilla() {
		super();
	}
	
	//methods 
	public void throwSomething() {
		this.minusEnergyLevel(5);
		System.out.println("Gorilla throws something");
	}
	
	public void eatBananas() {
		this.addEnergyLevel(10);
		System.out.println("Gorilla eats a banana and feels satisfied");
	}
	
	public void climb() {
		this.minusEnergyLevel(10);
		System.out.println("Gorilla climbs the empire state building");
	}
}
