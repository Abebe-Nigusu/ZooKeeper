package com.codingdojo.zookeeper;

public class Bat extends Mammal {

	public Bat(int energyLevel) {
		this.energyLevel = 300;
		super.displayEnergy();

	}

	public void displayStatus() {
		super.displayEnergy();

//			System.out.println("Status: " + this.energyLevel );
	}

	public void fly() {
		System.out.println("The bat is flying.");
		this.setEnergyLevel(this.getEnergyLevel() - 50);
	}

	public void eatHumans() {
		System.out.println("The bat is eating humans.");
		this.setEnergyLevel(this.getEnergyLevel() + 25);
	}

	public void attackTown() {
		System.out.println("The bat is attacking towns.");
		this.setEnergyLevel(this.getEnergyLevel() - 100);
	}

}
