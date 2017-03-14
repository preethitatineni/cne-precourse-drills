package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class Business implements Addressable {
	
	private final String name;
	private final List<Address> addresses = new ArrayList<>();
	
	public Business(String name){
		this.name = name;
	}
	
	@Override
	public List<Address> getAddresses() {
		return this.addresses;
	}

	@Override
	public void addAddress(Address address) {
		this.addresses.add(address);
	}

	public String getName() {
		return name;
	}

}
