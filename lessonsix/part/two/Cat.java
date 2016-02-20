package com.lessonsix.part.two;

public class Cat extends HouseInhabitant{
	public static int appetite;

	public Cat(int appetite){
		this.appetite = appetite;
	}
	
	public static void eatsFood(int nibbles){
		if (nibbleAmount > 0){
		nibbleAmount = nibbleAmount  - (nibbles + appetite);
		System.out.println("Purrrr");
		} else {
		System.out.println("Stay hungry");
		}
	}
}
