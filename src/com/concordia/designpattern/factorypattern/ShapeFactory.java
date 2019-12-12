package com.concordia.designpattern.factorypattern;

public class ShapeFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Shape getShape(String type) {
		if(type.equalsIgnoreCase("Circle")) {
			return new Circle();
		}else if(type.equalsIgnoreCase("Triangle")) {
			return new Triangle();
		}
		return null;
	}

}
