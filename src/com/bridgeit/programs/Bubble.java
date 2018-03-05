package com.bridgeit.programs;

import com.bridgit.utility.Utility;
/******************************************************************************
 *  Purpose:   Reads in integers prints them in sorted order using Bubble Sort
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
public class Bubble {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println("enter the size of array");
		int size=utility.inputInteger();
		Integer array[]=new Integer[size];
		System.out.println("enter the values : ");
		for(int i=0;i<array.length;i++)
		{
			array[i]=utility.inputInteger();
			
		}
		utility.printBubble(array);
		
	}

}
