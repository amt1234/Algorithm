package com.bridgeit.programs;

import com.bridgit.utility.Utility;
/******************************************************************************
 *  Purpose:  compute the square root of a nonnegative number
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
public class SquareRoot
{
	public static void main(String args[])
	{
		
		int c;
		Utility utility=new Utility();
		System.out.println("Enter the c :");
		c=utility.inputInteger();
		
		utility.squroot(c);
		
	}
}
