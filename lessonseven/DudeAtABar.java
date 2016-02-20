package com.lessonseven;

import java.util.Scanner;

public class DudeAtABar extends Bar {



	public static void drink(int drinkAmount){
	if (drinkAmount < smallOne){
				System.out.println("That's not a real drink amount, try again");
				drinkAmount = in.nextInt();
			}
			drunkometer = drunkometer +drinkAmount;

	}

}
