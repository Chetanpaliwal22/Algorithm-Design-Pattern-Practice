package com.concordia.designpattern.abstractfactorypattern;

/**
 * get the concrete implemention by passing type.
 * @author Chetan Paliwal
 *
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(boolean rounded) {
		if (rounded) {
			return new RoundedShapeFactory();
		} else {
			return new ShapeFactory();
		}
	}
}