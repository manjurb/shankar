package com.Shapes;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("*****Welcome to Area Calculator*****");
		System.out.println("------------------------------------");
		System.out.println("Hello Enter the Shape you want to Calc area of ");
		System.out.println("Press 1 for Rectangle");
		System.out.println("Press 2 for Circle");
		int choice=sc.nextInt();
		if(choice!=(int)choice)
			throw new IllegalArgumentException("Invalid Choice of Shape..!");
		else
		{
			switch(choice)
			{
			case 1:{
					System.out.println("Enter the length of Rectangle");
					double l=sc.nextDouble();
					System.out.println("Enter the bredth of Rectangle");
					double b=sc.nextDouble();
					Rectangle r=new Rectangle(l,b);
					r.area();
					break;
				   }
			
			case 2:{
					System.out.println("Enter the radius of Circle");
					double r=sc.nextDouble();
					Circle c=new Circle(r);
					c.area();
					break;
			   	   }
		   default:{
			   		System.out.println("Sorry Dude Its a Invalid Shape..!");
			   		break;
		   		   }
			
			}
		}
			
	}

}
