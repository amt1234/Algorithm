package com.bridgeit.programs;

import java.util.Scanner;

import com.bridgit.utility.Utility;

public class Montlypayment {

	public static void main(String args[])
	{
		
		double P,Y, R;
		System.out.println("Enter the principal :"+args[0]);
		P=Float.parseFloat(args[0]);
		System.out.println("Enter the year :"+args[1]);
		Y=Float.parseFloat(args[1]);
		System.out.println("Enter the rate :"+args[2]);
		R=Float.parseFloat(args[2]);
		Utility utility=new Utility();
		utility.monthlyPayment(P, Y, R);

	}

}
