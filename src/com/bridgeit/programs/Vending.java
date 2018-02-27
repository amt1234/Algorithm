package com.bridgeit.programs;
import java.util.*;

import com.bridgit.utility.Utility;
public class Vending {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		HashSet hashset=new HashSet();
		System.out.println("Enter the amount : ");
		int amount=scanner.nextInt();
		
		Utility.vending(amount, hashset, amount);
		
		 
		
	}

}
