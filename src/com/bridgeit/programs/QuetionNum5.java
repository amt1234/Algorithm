package com.bridgeit.programs;

import com.bridgit.utility.Utility;
/******************************************************************************
 *  Purpose: The Number N and then recursively ask true/false if the number is between a high and low value
 *  
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
public class QuetionNum5 {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println("Enter the number N : ");
		int N=utility.inputInteger();
		System.out.println("enter the target key");
		int target=utility.inputInteger();
		int result=(utility.numberFind(N, target));
		if(result ==-1)
			System.out.println("target value is not found");
		else
			System.out.println("target value index: "+result);
	}

}
