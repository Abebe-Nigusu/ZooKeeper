package com.codingdojo.zookeeper;

public class GorillaTest {

	public static void main(String[] args) {

		Gorilla gorilla = new Gorilla(0);

		gorilla.eatBananas();
		gorilla.eatBananas();
		gorilla.displayEnergy();

		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.displayEnergy();

		gorilla.climb();
		gorilla.displayEnergy();

	}

}
