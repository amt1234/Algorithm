package com.bridgeit.programs;
import java.util.*;
public class Vending {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the amount : ");
		int amount=scanner.nextInt();
		int a[]= {2000,1000,500,200,100,50,20,10,5,2,1};
		int n=a.length;
		
		 int  count=0;
		//int count1=0;
		
		while(amount>0)
		{
			for(int i=0;i<n;i++)
			{
				if(a[i]>amount)
				{
					System.out.println();
				}
				else 
				{
					amount=amount-a[i];
					
					System.out.println("note used : "+a[i]);
					
				}
				count++;
				System.out.println(count);
				
				
		}
	
	}
		
	}

}
