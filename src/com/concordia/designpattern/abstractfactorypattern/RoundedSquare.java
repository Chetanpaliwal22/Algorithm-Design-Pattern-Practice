package com.concordia.designpattern.abstractfactorypattern;

/**
 * concrete implementation of rounded square
 * @author Chetan Paliwal
 *
 */
public class RoundedSquare implements Shape {
	   @Override
	   public void draw() {
	      System.out.println("Inside RoundedSquare::draw() method.");
	   }
	}