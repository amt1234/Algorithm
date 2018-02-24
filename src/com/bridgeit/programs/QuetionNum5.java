package com.bridgeit.programs;

import java.util.Scanner;

import com.bridgit.utility.Utility;

public class QuetionNum5 {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number N : ");
		int N=scanner.nextInt();
		//int target=30;
		//Utility.numberFind(N, target);
		
		System.out.println("enter the target key");
		int target=scanner.nextInt();
		int result=(Utility.numberFind(N, target));
		if(result ==-1)
			System.out.println("target value is not found");
		else
			System.out.println("target value index: "+result);
	}

}
