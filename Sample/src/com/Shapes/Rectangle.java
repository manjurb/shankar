package com.Shapes;

public class Rectangle extends Shape {

	private double length;
	private double bredth;
	
	public Rectangle(double length, double bredth) {
		super();
		this.length = length;
		this.bredth = bredth;
	}


	@Override
	public void area() 
	{
		// TODO Auto-generated method stub
		System.out.println("This is a Rectangle");
		double res=(this.length * this.bredth);
		System.out.println("The Area of Rectangle is "+res);
	}

}
