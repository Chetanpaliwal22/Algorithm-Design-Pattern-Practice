package com.concordia.designpattern.builderpattern;

import com.concordia.designpattern.builderpattern.Name.Builder;

public class Address {
	String streeNumber;
	
//	public Address(Builder builder) {
//		this.streeNumber = builder.streeNumber;
//	}
//	
	static class Builder{
		public String getStreeNumber() {
			return streeNumber;
		}

		String streeNumber;
		
		Builder streetNumber(String streeNumber) {
			this.streeNumber = streeNumber;
			return this;
		}
		
		public Address build() {
			Address address = new Address(); // Since the builder is in the BankAccount class, we can invoke its private
												// constructor.
			address.streeNumber = this.streeNumber;
			
			return address;
		}
	}
}
