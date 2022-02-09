package com.louie.zookeeper;

public class Mammal {
	//member variables
	private int energyLevel;
	
	//constructor
	public Mammal() {
		this.energyLevel = 50;
	}
	
	
	//methods
	public int displayEnergy() {
		return getEnergyLevel();
	}
	
	public void minusEnergyLevel(int subtractEnergyLevel) {
		this.energyLevel -= subtractEnergyLevel;
	}
	public void addEnergyLevel(int plusEnergyLevel) {
		this.energyLevel += plusEnergyLevel;
	}

	
	//setters and getters
	public int getEnergyLevel() {
		System.out.println(energyLevel);
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

}
