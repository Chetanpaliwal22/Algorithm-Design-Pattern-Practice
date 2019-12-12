package com.concordia.designpattern.factorypattern;

public class Client {

	public static void main(String[] args) {
		System.out.println("demo of factory pattern.");
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape circleShape = shapeFactory.getShape("circle");
		Shape triangleShape = shapeFactory.getShape("triangle");
		
		System.out.println("in client class drawing car");
		circleShape.draw();

		System.out.println("in client class drawing triangle");
		triangleShape.draw();
	}

}
