package com.bridgeit.programs;

import com.bridgit.utility.Utility;
/******************************************************************************
 *  Purpose:  compute the square root of a nonnegative number
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
public class ToBinary {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println("Enter the number");
		int number=utility.inputInteger();
		utility.toBinary(number);
	
	}
}

