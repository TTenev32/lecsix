package com.lessonsix.part.two;

import java.util.ArrayList;

public class House {
	static ArrayList<Cat> cats = new ArrayList<Cat>();
	static Humans inhabitant = new Humans(32, 'f', "crazy cat lady");

	public static int nibbleAmount;
	public static boolean hasFood(){
		if (nibbleAmount != 0){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {

		inhabitant.bringsFood(50);

	for (int i = 0; i < 10; i++){
	cats.add(new Cat(5));
	cats.get(i).eatsFood(10);

	}

 	inhabitant.complain();
	inhabitant.bringsFood(50);
 

	}
}
