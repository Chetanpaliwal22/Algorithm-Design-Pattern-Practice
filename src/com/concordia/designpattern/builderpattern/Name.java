package com.concordia.designpattern.builderpattern;

import com.concordia.designpattern.builderpattern.Account.Builder;

public class Name {

	String firstName;
	String lastName;

//	public Name(Builder builder) {
//
//		this.firstName = builder.firstName;
//		this.lastName = builder.lastName;
//
//	}

	static class Builder {
		String firstName;
		String lastName;

		Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}

		Builder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Name build() {
			Name name = new Name(); // Since the builder is in the BankAccount class, we can invoke its private
												// constructor.
			name.firstName = this.firstName;
			name.lastName = this.lastName;
			

			return name;
		}
	}
}
