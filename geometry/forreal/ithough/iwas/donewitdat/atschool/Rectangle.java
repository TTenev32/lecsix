package com.geometry.forreal.ithough.iwas.donewitdat.atschool;

public class Rectangle extends Geometry{
	public int a;
	public int b;
	
    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double getSideA() {
        return a;
    }

    public void setSideA(int a) {
        this.a = a;
    }
    
    public double getSideB() {
        return b;
    }

    public void setSideB(int b) {
        this.b = b;
    }


    public double getArea() {
        return calculateArea();
    }

    private double calculateArea() {
        return b*a;
    }

}
