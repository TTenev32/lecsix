package com.lessonseven;

import java.util.Scanner;

public class FirstOne {
	

	
	public static void main(String[] args) {
		System.out.println("Gimme a number from 1 to 10");
		Scanner in = new Scanner(System.in);
		while(!in.hasNextInt()){
			System.out.println("Not an integer. Try again...");
			in.next();
			
		}
		if (in.nextInt() > 10 || in.nextInt() < 1){
			System.out.println("Not a number from 1 to 10. Try again");
			in.next();
			while(!in.hasNextInt()){
				System.out.println("Not an integer. Try again...");
				in.next();
				
			}
		}
		int j = in.nextInt();
		System.out.println("Your number is " + j +"!");
	}

}
