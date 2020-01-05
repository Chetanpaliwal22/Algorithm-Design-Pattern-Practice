package com.concordia.designpattern.abstractfactorypattern;

/**
 * class to get object of concrete class by passing the type such as rectangle and square
 * @author Chetan Paliwal
 *
 */
public class RoundedShapeFactory extends AbstractFactory {
	   @Override
	   public Shape getShape(String shapeType){    
	      if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new RoundedRectangle();         
	      }else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new RoundedSquare();
	      }	 
	      return null;
	   }
	}