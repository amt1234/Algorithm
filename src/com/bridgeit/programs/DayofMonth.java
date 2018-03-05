package com.bridgeit.programs;

import com.bridgit.utility.Utility;
/******************************************************************************
 *  Purpose:  Find the Fewest Notes to be returned for Vending Machine
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
public class DayofMonth {

	public static void main(String[] args) 
	{
		int d;
		int m;
		int y; 
	
		System.out.println("Enter the day :"+args[0]);
		d=Integer.parseInt(args[0]);
		
		System.out.println("Enter the month:"+args[1]);
		m=Integer.parseInt(args[1]);
		
		System.out.println("Enter the year :"+args[2]);
		y=Integer.parseInt(args[2]);
		
		Utility utility=new Utility();
		utility.dayOfWeek(d, m, y);
		
		
	}

}
