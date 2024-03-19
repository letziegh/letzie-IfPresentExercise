
package com.coderscampus.domain;

import java.util.Optional;

public class SuspectLocation {
	
	private String name;
	private String country;
	private Optional<String> location = Optional.empty();
	
	public SuspectLocation(String name, String country) {
		this.name= name;
		this.country = country;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Optional<String> getLocation() {
		return location;
	}
	public void setLocation(Optional<String> location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "SuspectLocation [name=" + name + ", country=" + country + ", location=" + location + "]";
	}
	
}
