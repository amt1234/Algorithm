package com.bridgeit.programs;

import java.util.Scanner;

import com.bridgit.utility.Utility;

public class ExtendPalaindromA {

	public static void main(String[] args) 
	{
		int number;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		number=scanner.nextInt();
		Utility utility=new Utility();
		utility.extened(number);
		

	}

}
