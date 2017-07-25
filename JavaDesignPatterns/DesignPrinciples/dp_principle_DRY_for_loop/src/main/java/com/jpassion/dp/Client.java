package com.jpassion.dp;

public class Client {

	public static void main(String[] args) {
		int[] arrayA = {1,3,5,6};
		int[] arrayB = {6,7,8,9};
		int[] arrayC = {'a','b','c','d'};
		
		int sumA = 0;
		int sumB = 0;
		int sumC = 0;
		
		//GOOD: No duplication of code
		sumA = calcSumOfFour(arrayA);
		System.out.println("sumA = " + sumA);
	
		//GOOD: No duplication of code
		sumB = calcSumOfFour(arrayB);
		System.out.println("sumB = " + sumB);
		
		sumC = calcSumOfFour(arrayC);
		System.out.println("sumC = " + sumC);
	}
	
	private static int calcSumOfFour(int[] array){
		int sum = 0;
		for (int i = 0; i < 4; i++){
			sum += array[i];
		}
		return sum;
	}
}
