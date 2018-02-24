package com.bridgeit.programs;

import java.util.Scanner;

public class Bubble {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("enter the values : ");
		for(int a=0;a<arr.length;a++)
		{
			arr[a]=scanner.nextInt();
			
		}
		int temp=0,i;
		
		for(i=0;i<6;i++)
		{
			for(int j=0;j<6-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					//System.out.print(a[i]+" ");
				}
				
			}
			System.out.print(arr[i]+" ");
			
		}
		
	}

}
