package com.items;

public class Salary implements Comparable<Salary> {

	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public int compareTo(Salary o) {
		if (this.getValue() > o.getValue()) {
			return 1;
		} else if (this.getValue() < o.getValue()) {
			return -1;
		}
		return 0;
	}

}
