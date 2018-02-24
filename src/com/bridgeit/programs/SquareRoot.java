package com.bridgeit.programs;

import java.util.Scanner;

import com.bridgit.utility.Utility;

public class SquareRoot
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		int c;
		System.out.println("Enter the c :");
		c=scanner.nextInt();
		Utility utility=new Utility();
		utility.squroot(c);
		scanner.close();
		
	}
}
