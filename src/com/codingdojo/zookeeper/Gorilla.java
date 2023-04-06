package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {

	public Gorilla(int energyLevel) {
		this.energyLevel = 0;

	}

	public void displayEnergy() {
		super.displayEnergy();

//			System.out.println("Status: " + this.energyLevel );
	}

	public void throwSomething() {
		System.out.println("The gorilla has thrown something at you!");
		this.setEnergyLevel(this.getEnergyLevel() - 5);
	}

	public void eatBananas() {
		System.out.println("The gorilla eats some bananas.");
		this.setEnergyLevel(this.getEnergyLevel() + 10);
	}

	public void climb() {
		System.out.println("The gorilla climbs a nearby tree.");
		this.setEnergyLevel(this.getEnergyLevel() - 10);
	}

}
