
////Project 1: Loop Exercise

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LoopExercise {

	public static void main(String[] args) {
//		asks user for 5 numbers 
//		-> stores in ArrayList
//		-> sum, product, largest number and smallest number in array
		
		try (Scanner input = new Scanner(System.in)) {
			List<Double> numberList = new ArrayList<>();
			
			for (int i =0; i < 5; ++i) {
				System.out.println("Write a number here:");
				double number = input.nextDouble();
				numberList.add(number);
			};
			
			//Initialize variables
			double sum = 0;
			double product = 1;
			
			//sum for loop
			for (double number: numberList) {
				sum += number;			
			};
			
			//product 
			for (double number: numberList) {
				product *= number;			
			};
			
			//largest number
			double largestNum = Collections.max(numberList);
			
			//smallest number
			double smallestNum = Collections.min(numberList);
			
			System.out.println("The sum of your arraylist is " + sum);
			System.out.println("The product of your arraylist is " + product);
			System.out.println("The largest number in your arrayList is " + largestNum);
			System.out.println("The smallest number in your arrayList is " + smallestNum);
		}

	}

}
