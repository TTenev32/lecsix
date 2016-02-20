package com.lessonsix.part.two;

public class Humans extends HouseInhabitant{
	public int age;
	public static char gender;
	public static String role;
	
	public Humans(int age, char gender, String role){
		this.age=age;
		this.gender = gender;
		this.role = role;
	}
	
	public static void bringsFood(int nibbles){
		nibbleAmount = nibbleAmount  + nibbles;
		System.out.println(role + " brounght us" + nibbles +  " snacks");
	}

	
	public String complain(){
		if (!House.hasFood()){
			return "Why didn't you get to the store?";
		}
		return "";
	}
}
