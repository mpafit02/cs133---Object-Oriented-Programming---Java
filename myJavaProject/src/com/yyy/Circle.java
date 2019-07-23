package com.yyy;

public class Circle {
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

	public static void main(String[] args) {
		Circle c = new Circle(1.23);
		System.out.println(c.getRadius());
	}
}
