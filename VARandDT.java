package com;

import java.util.Scanner;

public class VARandDT {

	public static void main(String[] sad){
		Scanner sc = new Scanner(System.in);
/* Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
                these 3 numbers. */
		/*
        System.out.print("Enter Number A: ");
		int A = sc.nextInt();
		System.out.print("Enter Number B: ");
		int B = sc.nextInt();
		System.out.print("Enter Number C: ");
		int C = sc.nextInt();
		int avg = (A+B+C)/3;
		System.out.println("Average = " + avg);*/
/* Question 2: In a program, input the side of a square. You have to output the area of the
               square. */
		/*System.out.print("Enter the Side Length of the Square: ");
		int side = sc.nextInt();
		int area = side * side;
		System.out.println("Area of Square=" + area);*/
/* Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
               an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */
		/*System.out.print("Enter the Total Cost of the Pencil: ");
		float pencil = sc.nextFloat();
		System.out.print("Enter the Total Cost of the Pen: ");
		float pen = sc.nextFloat();
		System.out.print("Enter the Total Cost of the Eraser: ");
		float eraser = sc.nextFloat();
		//calculation
		float tCost = pen + pencil + eraser;
		float gstCost = tCost + ((18*tCost)/100);

		System.out.println("\n========Bhumi Mart========\n");
		System.out.println("Product Name	Product Cost");
		System.out.println("Pencil          " + pencil);
		System.out.println("Pen             " + pen);
		System.out.println("Eraser          " + eraser);
		System.out.println("___________________________");
		System.out.println("Total           " + tCost +"\tRs.");
		System.out.println("Total Including 18% GST" + gstCost + "\tRs.");*/
/* Question 4: What will be the type of result in the following Java code?
(Hint : Look at the largest data type among these)
Note: This Question is based on the topic of the Promotion In Java. */
		/*byte b = 4;
		char c = 'a';
		short s = 512;
		int i = 1000;
		float f = 3.14f;
		double d = 99.9954;

		double result =(f * b) + (i % c) - (d * s);
		System.out.println("result = " + result);*/
	}
}
