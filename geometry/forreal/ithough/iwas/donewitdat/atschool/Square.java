package com.geometry.forreal.ithough.iwas.donewitdat.atschool;

public class Square extends Geometry{
	// I hate math
	public int side;
	


	    public Square(int side) {
	        this.side = side;
	    }

	    public double getSide() {
	        return side;
	    }

	    public void setSide(int side) {
	        this.side = side;
	    }

	    public double getArea() {
	        return calculateArea();
	    }

	    private double calculateArea() {
	        return side * side;
	    }

}
