package com.codingdojo.zookeeper;

public class BatTest {

	public static void main(String[] args) {

		Bat bat = new Bat(300);

		bat.eatHumans();
		bat.displayEnergy();
		bat.eatHumans();
		bat.displayEnergy();

		bat.attackTown();
		bat.displayEnergy();
		bat.attackTown();
		bat.displayEnergy();
		bat.attackTown();
		bat.displayEnergy();

		bat.fly();
		bat.displayEnergy();
		bat.fly();
		bat.displayEnergy();

	}

}
