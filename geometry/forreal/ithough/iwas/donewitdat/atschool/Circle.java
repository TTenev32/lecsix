package com.geometry.forreal.ithough.iwas.donewitdat.atschool;


public class Circle extends Geometry {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return calculateArea();
    }

    private double calculateArea() {
        return radius * radius * Math.PI;
    }
}
