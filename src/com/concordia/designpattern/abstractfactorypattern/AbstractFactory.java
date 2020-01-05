package com.concordia.designpattern.abstractfactorypattern;

/**
 * Its an creational pattern. In this you define an factory abstract class/frame
 * work class and on top of it/ or by using this class you define your object
 * class/es.
 * 
 * @author Chetan Paliwal
 *
 */
public abstract class AbstractFactory {
	abstract Shape getShape(String shapeType);
}