package com.bridgeit.programs;

import com.bridgit.utility.Utility;
/******************************************************************************
 *  Purpose: Determines whether or not String is anagram 
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
public class Anagram {

	public static void main(String[] args)
	{
		String str1;
		String str2;
		Utility utility=new Utility();
		System.out.println("enter 1st string : ");
		str1=utility.inputString();
		System.out.println("enter 2nd string : ");
		str2=utility.inputString();
		
		utility.anagram(str1, str2);
	}

}
