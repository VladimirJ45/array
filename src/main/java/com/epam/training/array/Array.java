package com.epam.training.array;

import java.util.Arrays;

//TODO: write a wrapper class for a java int array, make this class immutable
public class Array {

	private int[] items;

	public Array(int[] items) {
		this.items = items;
	}

	public int[] getItems() {
		return items;
	}

	@Override
	public String toString() {
		return Arrays.toString(items);
	}

	@Override
	public int hashCode() {
		return Arrays.hashCode(items);
	}

	@Override
	public boolean equals(Object ob) {
		if (ob == this) {
			return true;
		}
		if (ob == null || ob.getClass() != getClass()) {
			return false;
		}
		Array array = (Array) ob;
		return Arrays.equals(items, array.items);
	}
}
