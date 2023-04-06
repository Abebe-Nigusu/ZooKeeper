package com.codingdojo.zookeeper;

public class Mammal {
	
		protected int energyLevel;
//		protected String name;
		
		
		public Mammal() {
			this.energyLevel= 10;
//			this.name = "random animal name";
			
		}
		
		public void displayEnergy(){
	    	System.out.println(" Energy Level: " + this.energyLevel);

	    }
		
		
		public Mammal(String name, int energyLevel) {
//			this.name = name;
			this.energyLevel = energyLevel;
		}


		public int getEnergyLevel() {
			return energyLevel;
		}


		public void setEnergyLevel(int energyLevel) {
			this.energyLevel = energyLevel;
		}


//		public String getName() {
//			return name;
//		}
//
//
//		public void setName(String name) {
//			this.name = name;
//		}


	}


