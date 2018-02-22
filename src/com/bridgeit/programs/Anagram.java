package com.bridgeit.programs;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class Anagram {

	public static void main(String[] args)
	{
		String str1;
		String str2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter 1st string : ");
		str1=scanner.nextLine();
		System.out.println("enter 2nd string : ");
		str2=scanner.nextLine();
		
		Utility utility=new Utility();
		utility.anagram(str1, str2);
		scanner.close();
	}

}
