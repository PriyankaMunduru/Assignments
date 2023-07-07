package com.abc.graphics;
public class Circle
{
	private double radius;
	private Circle(){}
	public Circle(double radius)
	{
	this.radius=radius;
	}
	public double area()
	{
	return 3.14*radius*radius;
	}
}