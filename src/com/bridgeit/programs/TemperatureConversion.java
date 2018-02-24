package com.bridgeit.programs;

import java.util.Scanner;

import com.bridgit.utility.Utility;

public class TemperatureConversion {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("1. Celsius to Fahrenheit:");
		System.out.println("2. Fahrenheit to Celsius:");
		System.out.println("Enter the choice : ");
		int choice=scanner.nextInt(); 
		
		//System.out.println("Enter the temperature to convert :");
		Utility utility=new Utility();
		utility.temperature(choice);
		
		scanner.close();
		
		

	}

}
