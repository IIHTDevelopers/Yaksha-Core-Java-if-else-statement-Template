package com.yaksha.assignment;

public class IfElseStatementAssignment {

	public static void main(String[] args) {

		// Task 1: Check if a number is positive or negative
		int number = -5;
		if (number > 0) {
			System.out.println("The number " + number + " is positive.");
		} else {
			System.out.println("The number " + number + " is negative.");
		}

		// Task 2: Find the largest of three numbers
		int a = 10, b = 20, c = 15;
		if (a >= b && a >= c) {
		    System.out.println("The largest number is: " + a);
		} else {
		    if (b >= a && b >= c) {
		        System.out.println("The largest number is: " + b);
		    } else {
		        System.out.println("The largest number is: " + c);
		    }
		}

		// Task 3: Check if a number is even or odd
		int num = 8;
		if (num % 2 == 0) {
			System.out.println("The number " + num + " is even.");
		} else {
			System.out.println("The number " + num + " is odd.");
		}

		// Task 4: Check eligibility to vote
		int age = 17;
		if (age >= 18) {
			System.out.println("You are eligible to vote.");
		} else {
			System.out.println("You are not eligible to vote.");
		}

		// Task 5: Grade calculation based on marks
		int marks = 85;

		// Check for Grade A
		if (marks >= 90) {
			System.out.println("Grade: A");
		} else {
			// Check for Grade B
			if (marks >= 75) {
				System.out.println("Grade: B");
			} else {
				// Check for Grade C
				if (marks >= 50) {
					System.out.println("Grade: C");
				} else {
					// Below 50, Grade F
					System.out.println("Grade: F");
				}
			}
		}
	}
}
