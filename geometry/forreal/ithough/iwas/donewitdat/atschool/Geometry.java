package com.geometry.forreal.ithough.iwas.donewitdat.atschool;

import java.util.ArrayList;
import java.util.Random;


public class Geometry {
	
	static Random r = new Random();
	
	static ArrayList<Geometry> noMoreMathPlease = new ArrayList<Geometry>();
	
	public static void main(String[] args) {
		for (int i = 0; i <=10; i++){
			noMoreMathPlease.add(new Circle(r.nextDouble()));
		}
	}

}
