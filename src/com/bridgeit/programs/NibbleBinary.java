package com.bridgeit.programs;

import com.bridgit.utility.Utility;
/******************************************************************************
 *  Purpose: Decimal to binary and Swap nibbles and find the new number
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
public class NibbleBinary {

	public static void main(String[] args)
	{
		Utility utility=new Utility();
		System.out.println("Enter the number");
		int number=utility.inputInteger();
		utility.nibbleSwap(number);
		
	}

}