package com.bridgeit.programs;

import com.bridgit.utility.Utility;

/******************************************************************************
 *  Purpose: Write a program with Static Functions to do Merge Sort of list of Strings.
 *  
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
public class MergeSort {

	public static void main(String[] args) throws Exception
	{
			Utility utility=new Utility();
			System.out.println("Enter a String:");
			String string=utility.inputString().toLowerCase();
			String[] stringArray  = string.split(" ");
					
					
			String[] sortedArray = utility.mergeSort(stringArray);
			for(int i=0;i<sortedArray.length;i++)
			{
				System.out.println(sortedArray[i]+" ");
			}
	
		}

}
