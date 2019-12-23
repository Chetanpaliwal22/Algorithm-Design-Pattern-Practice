package com.concordia.designpattern.decorator;

public class Driver {
	public static void main(String[] args) {

		Shape circle = new Circle();

		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		System.out.println("Circle normal border");
		circle.draw();

		System.out.println("Circle red border");
		redCircle.draw();
		
		System.out.println("Circle Description");
		System.out.println(redCircle.description());
		

		System.out.println("Rectangle red border");
		redRectangle.draw();
	}
}