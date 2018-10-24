package com.Shapes;

public class Circle extends Shape {

	public static final double pi=3.142;
	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("This is a Circle");
		double res=(pi* this.radius * this.radius);
		System.out.println("The Area of Circle is "+res);
	}


}
