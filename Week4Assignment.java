//Sara Bremer

package helloworld;

import java.util.Scanner;

public class Week4Assignment 
{
	public static void main(String[] args) 
	{
		System.out.println("We're going to calculate the "
				+ "Surface Area and Volume\nof a box using"
				+ " the dimensions you input.\n");
		double length;
		double height; 
		double width; 
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the box: ");
		length = input.nextDouble();
		
		System.out.print("Enter the height of the box: ");
		height = input.nextDouble();

		System.out.print("Enter the width of the box: ");
		width = input.nextDouble();	
		
		double boxVolume = volumeDoubles(length, width, height);
		double boxSA = surfaceAreaDoubles(length, width, height);
		
		System.out.printf("The Volume of your box is: %f\n", boxVolume);
		System.out.printf("The Surface Area of your box is: %f", boxSA);
		
		input.close();
	}
	public static double volumeDoubles(double length, double width, double height)
	{
		return(length * width * height);
	}
	public static double surfaceAreaDoubles(double length, double width, double height)
	{
		return((2*length*width)+(2*length*height)+(2*height*width));
	}
}
