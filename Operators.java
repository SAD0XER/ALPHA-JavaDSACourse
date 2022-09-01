package com;

import java.util.Scanner;

public class Operators {
	public static void main(String[] sarvesh) {
		Scanner sc = new Scanner(System.in);

/* Question 1 : Write a Java program to get a number from the user and print whether it is
positive or negative. */
		/*System.out.print("Enter Your Number: ");
		int number = sc.nextInt();
		String num = (number % 2 == 0)?"Your Number is EVEN.":"Your Number is ODD.";
		System.out.println(num);*/

/* Question 2 : Finish the following code so that it prints You have a fever if your temperature
is above 100 and otherwise prints You don't have a fever. */
		/*System.out.print("Enter the temperature of your body :");
		double temp = sc.nextDouble();

		if (temp > 100){
			System.out.println("Your Report:\n\tYou have a FEVER.");
		}
		else {
			System.out.println("Your Report:\n\tYou DON\'T have a FEVER.");
		}*/

/* Question 3 : Write a Java program to input week number(1-7) and print day of week name
using switch case. */
		/*System.out.print("P.S: First Day of Week is MONDAY.\n\nEnter the WEEK Number: ");
		byte weeknum = sc.nextByte();

		switch (weeknum) {
			case 1:
				System.out.println("MONDAY");
				break;
			case 2:
				System.out.println("TUESDAY");
				break;
			case 3:
				System.out.println("WEDNESDAY");
				break;
			case 4:
				System.out.println("THURSDAY");
				break;
			case 5:
				System.out.println("FRIDAY");
				break;
			case 6:
				System.out.println("SATURDAY");
				break;
			case 7:
				System.out.println("SUNDAY");
				break;

			default:
				System.out.println("NOTE:\n\tEnter Number between 0 to 7.");*/

/* Question 5 : Write a Java program that takes a year from the user and print whether that
year is a leap year or not. */
		/*System.out.print("NOTE: Check whether the Year is Leap Year OR NOT.\n\tEnter Year: ");
		long year = sc.nextLong();

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("Yes. This Year is Leap Year.");
				} else {
					System.out.println("NOT a Leap Year.");
				}
			} else System.out.println("Yes. This Year is Leap Year.");
		} else {
			System.out.println("NOT a Leap Year.");*/
/*
// This is official solving approach of this Leap Year Problem By shradhha didi.
int year = sc.nextInt();
boolean x = (year % 4) == 0;
boolean y = (year % 100) != 0;
boolean z = ((year % 100 == 0) && (year % 400 == 0));

if (x && (y || z)) {
System.out.println(year + " is a leap year");
} else {
System.out.println(year + " is not a leap year");
}
*/
	}
}