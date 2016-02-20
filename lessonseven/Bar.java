package com.lessonseven;

import java.util.Scanner;

public class Bar {
	public static Scanner in = new Scanner(System.in);
	public static int drunkometer = 0;
	public static double smallOne= 1;


	
	public 	static DudeAtABar you = new DudeAtABar();
	public static Bartender roy = new Bartender();
	public static void main(String[] args) {


		

		
			System.out.println(roy.takeOrder());

			int drinkAmount = in.nextInt();
			you.drink(drinkAmount);
			System.out.println(drunkometer);

			if (drunkometer > 4){
				System.out.println(roy.warning());
			}
			

		}
		
		
	}

