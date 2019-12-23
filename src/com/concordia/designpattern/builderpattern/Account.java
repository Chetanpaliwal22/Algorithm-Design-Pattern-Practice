package com.concordia.designpattern.builderpattern;

/*
 * this is Account class containing information related account. Builder pattern will ease the creation of account object, it will also increase the code redability and maintainability.
 */
public class Account {

	private int id;
	private Name name;
	private Address address;

//	public Account(Builder builder) {
//		this.id = builder.id;
//		this.name = builder.name;
//		this.address = builder.address;
//	}

	public int getId() {
		return id;
	}

	public Name getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	static class Builder {
		private int id;
		private Name name;
		private Address address;

		public Builder id(int id) {
			this.id = id;
			return this;
		}

		public Builder name(Name name) {
			this.name = name;
			return this;
		}

		public Builder address(Address address) {
			this.address = address;
			return this;
		}

		public Account build() {
			Account account = new Account(); // Since the builder is in the BankAccount class, we can invoke its private
												// constructor.
			account.name = this.name;
			account.address = this.address;
			account.id = this.id;

			return account;
		}
	}

}
