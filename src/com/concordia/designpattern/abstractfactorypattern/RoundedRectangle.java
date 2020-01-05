package com.concordia.designpattern.abstractfactorypattern;

/**
 * concrete implementation of rounded rectangle
 * @author Chetan Paliwal
 *
 */
public class RoundedRectangle implements Shape {
	   @Override
	   public void draw() {
	      System.out.println("Inside RoundedRectangle::draw() method.");
	   }
	}