package com.bridgeit.programs;
import java.util.*;
import com.bridgit.utility.Utility;
/******************************************************************************
 *  Purpose:  Find the Fewest Notes to be returned for Vending Machine
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
public class Vending {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		HashSet hashset=new HashSet();
		System.out.println("Enter the amount : ");
		int amount=utility.inputInteger();
		
		utility.vending(amount, hashset, 0);
		
		 
		
	}

}
