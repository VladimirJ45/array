package com.epam.training.array;

import java.util.Arrays;

public class ArraySorter {

	public static Array sort(Array array) {
		if (array.equals(null)) {
			throw new UnsupportedOperationException();
		}
		Arrays.sort(array.getItems());
		Array result = new Array(array.getItems());
		return result;
	}
}
