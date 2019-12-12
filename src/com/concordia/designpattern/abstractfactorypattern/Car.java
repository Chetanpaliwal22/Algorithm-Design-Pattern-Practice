package com.concordia.designpattern.abstractfactorypattern;

enum CarType 
{ 
    MICRO, MINI, LUXURY 
} 
  
enum Location 
{ 
  DEFAULT, USA, INDIA 
} 

public abstract class Car {

	Car(CarType model,Location locaiton){
		this.model = model;
		this.location = location;
	}
	
	abstract void construct();
	
	CarType model;
	Location location;
}
