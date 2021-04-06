package com.epam.training.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLogic {

	// TODO: write it using binary search
	public static boolean exists(Array array, int element) {
		if (array.equals(null)) {
			throw new UnsupportedOperationException("No array found.");
		}
		Array sortedArray = ArraySorter.sort(array);
		int[] sortedArrayItems = sortedArray.getItems();
		return Arrays.binarySearch(sortedArrayItems, element) >= 0;
	}

	public static Array findPrimeNumbers(Array array) {
		if (array.equals(null)) {
			throw new UnsupportedOperationException("No array found.");
		}
		int[] arrayItems = array.getItems();
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

		for (int i = 0; i < arrayItems.length; i++) {
			boolean isPrime = true;
			if (arrayItems[i] == 1)
				isPrime = false;
			else {
				// check to see if the numbers are prime
				for (int j = 2; j <= arrayItems[i] / 2; j++) {
					if (arrayItems[i] % j == 0) {
						isPrime = false;
						break;
					}
				}
			}
			// store the prime numbers
			if (isPrime) {
				primeNumbers.add(arrayItems[i]);
			}
		}
		int[] arrayPrimeNumbers = new int[primeNumbers.size()];
		for (int i = 0; i < primeNumbers.size(); i++) {
			arrayPrimeNumbers[i] = primeNumbers.get(i);
		}

		Array result = new Array(arrayPrimeNumbers);
		return result;
	}

	// TODO: add other methods here

	public static int findMinValue(Array array) {
		if (array.equals(null)) {
			throw new UnsupportedOperationException("No array found.");
		}
		int[] arrayItems = array.getItems();
		int minValue = arrayItems[0];
		for (int i = 1; i < arrayItems.length; i++) {
			if (arrayItems[i] < minValue) {
				minValue = arrayItems[i];
			}
		}
		return minValue;
	}

	public static int findMaxValue(Array array) {
		if (array.equals(null)) {
			throw new UnsupportedOperationException("No array found.");
		}
		int[] arrayItems = array.getItems();
		int maxValue = arrayItems[0];
		for (int i = 1; i < arrayItems.length; i++) {
			if (arrayItems[i] > maxValue) {
				maxValue = arrayItems[i];
			}
		}
		return maxValue;
	}

	public static Array findFabonacciNumbers(Array array) {
		if (array.equals(null)) {
			throw new UnsupportedOperationException("No array found.");
		}
		ArrayList<Integer> fibonacciNumbers = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		Array workingArray = ArraySorter.sort(array);
		int firstNumber = 0; // first Fibonacci number
		int secondNumber = 1; // second Fibonacci number
		fibonacciNumbers.add(firstNumber);
		fibonacciNumbers.add(secondNumber);
		for (int i = 0; i <= findMaxValue(array); i++) {
			int fibonacciNumber = firstNumber + secondNumber;
			fibonacciNumbers.add(fibonacciNumber);
			firstNumber = secondNumber;
			secondNumber = fibonacciNumber;
			if (fibonacciNumber >= findMaxValue(array)) {
				break;
			}
		}
		for (int i = 0; i < fibonacciNumbers.size(); i++) {
			for (int j : workingArray.getItems()) {
				if (fibonacciNumbers.get(i) == j) {
					result.add(fibonacciNumbers.get(i));
				}
			}
		}

		int[] expectedResult = new int[result.size()];
		for (int i = 0; i < expectedResult.length; i++) {
			expectedResult[i] = result.get(i);
		}

		Array arrayResult = new Array(expectedResult);
		return arrayResult;
	}
}
