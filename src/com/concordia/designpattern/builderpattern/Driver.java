package com.concordia.designpattern.builderpattern;

import com.concordia.designpattern.builderpattern.Account.Builder;
import com.concordia.designpattern.builderpattern.Account.Builder;
import com.concordia.designpattern.builderpattern.Account.Builder;
	

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creation of Account Object
		
		//1Creation of name object
		
		Name name = new Name.Builder().firstName("Chetan").lastName("Paliwal").build();
		Address address = new Address.Builder().streetNumber("123").build();
		Account account = new Account.Builder().id(1).address(address).build();

		System.out.println("ID: "+ account.getId());
		System.out.println("Street Number: "+account.getAddress().streeNumber);
	}

}
