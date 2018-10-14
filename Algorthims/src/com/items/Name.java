package com.items;

public class Name implements Comparable<Name>{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Name o) {
		
		return 0;
	}
	
	

}
