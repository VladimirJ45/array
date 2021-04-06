package com.epam.training.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayLogicTest {

	// TODO: add tests for various scenarios
	@Test
	public void testShouldReturnTrueIfExists() {
		// given
		int[] testarray = new int[] { 1, 5, 9, 7, 2 };
		Array array = new Array(testarray);
		// when
		boolean result = ArrayLogic.exists(array, 5);
		// then
		Assert.assertEquals(true, result);
	}

	@Test
	public void testShouldReturnFalseIfNotExists() {
		// given
		int[] testarray = new int[] { 1, 5, 9, 7, 2 };
		Array array = new Array(testarray);
		// when
		boolean result = ArrayLogic.exists(array, 3);
		// then
		Assert.assertEquals(false, result);
	}

	@Test
	public void testShouldReturnPrimeNumbers() {
		// given
		int[] testarray = new int[] { 18, 5, 9, 7, 2 };
		Array array = new Array(testarray);
		int[] expectedResult = new int[] { 5, 7, 2 };
		// when
		Array primeNumbers = ArrayLogic.findPrimeNumbers(array);
		int[] primeItems = primeNumbers.getItems();
		// then
		Assert.assertArrayEquals(expectedResult, primeItems);
	}

	@Test
	public void testShouldReturnMinNumber() {
		// given
		int[] testarray = new int[] { 18, 5, 9, 7, 2 };
		Array array = new Array(testarray);
		// when
		int result = ArrayLogic.findMinValue(array);
		// then
		Assert.assertEquals(2, result);
	}

	@Test
	public void testShouldReturnMaxNumber() {
		// given
		int[] testarray = new int[] { 18, 5, 9, 7, 2 };
		Array array = new Array(testarray);
		// when
		int result = ArrayLogic.findMaxValue(array);
		// then
		Assert.assertEquals(18, result);
	}

	@Test
	public void testShouldReturnFabonacciNumbers() {
		// given
		int[] testarray = new int[] { 18, 5, 9, 7, 2, 13 };
		Array array = new Array(testarray);
		int[] expectedResult = new int[] { 2, 5, 13 };
		// when
		Array result = ArrayLogic.findFabonacciNumbers(array);
		// then
		Assert.assertArrayEquals(expectedResult, result.getItems());
	}

}
