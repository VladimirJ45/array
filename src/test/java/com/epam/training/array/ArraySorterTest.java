package com.epam.training.array;

import org.junit.Assert;
import org.junit.Test;

public class ArraySorterTest {

	// TODO: uncomment test when junit dependency is added
	@Test
	public void testSortShouldSortWhenPositiveNumbers() {
		// given
		int[] testArray = new int[] { 1, 5, 9, 7, 2 };
		Array testItems = new Array(testArray);
		int[] expectedArray = new int[] { 1, 2, 5, 7, 9 };
		// when
		ArraySorter.sort(testItems);
		// then
		Assert.assertArrayEquals(testItems.getItems(), expectedArray);
	}

	// TODO: add tests for other positive and negative scenarios

	@Test
	public void testSortShouldSortWhenNegativeNumbers() {
		// given
		int[] testArray = new int[] { -1, -5, -9, -7, -2 };
		Array testItems = new Array(testArray);
		int[] expectedArray = new int[] { -9, -7, -5, -2, -1 };
		// when
		ArraySorter.sort(testItems);
		// then
		Assert.assertArrayEquals(testItems.getItems(), expectedArray);
	}

	@Test
	public void testSortShouldSortWhenNegativeAndPositiveNumbers() {
		// given
		int[] testArray = new int[] { 5, -2, 9, -18, 102 };
		Array testItems = new Array(testArray);
		int[] expectedArray = new int[] { -18, -2, 5, 9, 102 };
		// when
		ArraySorter.sort(testItems);
		// then
		Assert.assertArrayEquals(testItems.getItems(), expectedArray);
	}

	@Test
	public void testSortShouldSortWhenOnlyOneElement() {
		// given
		int[] testArray = new int[] { 5 };
		Array testItems = new Array(testArray);
		int[] expectedArray = new int[] { 5 };
		// when
		ArraySorter.sort(testItems);
		// then
		Assert.assertArrayEquals(testItems.getItems(), expectedArray);
	}

}
