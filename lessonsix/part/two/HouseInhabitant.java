package com.lessonsix.part.two;

public class HouseInhabitant extends House {
	public boolean isIn = true;
	public static int nibbles;
	

	
	public static void eatsFood(int nibbles){
		if (nibbleAmount > 0){
		nibbleAmount = nibbleAmount  - nibbles;
		} else {
		System.out.println("Stay hungry");
		}
	}
	
}
