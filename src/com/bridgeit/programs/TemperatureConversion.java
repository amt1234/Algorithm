package com.bridgeit.programs;

import com.bridgit.utility.Utility;
/******************************************************************************
 *  Purpose:  given the temperature in fahrenheit as input outputs the temperature in Celsius or viceversa 
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
public class TemperatureConversion {

	public static void main(String[] args) {
		
		Utility utility=new Utility();
		System.out.println("1. Celsius to Fahrenheit:");
		System.out.println("2. Fahrenheit to Celsius:");
		System.out.println("Enter the choice : ");
		int choice=utility.inputInteger();
		
		utility.temperature(choice);
		
	}

}
