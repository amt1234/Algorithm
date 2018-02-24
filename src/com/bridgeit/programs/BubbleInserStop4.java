package com.bridgeit.programs;

import java.util.Arrays;
import java.util.Scanner;

import com.bridgit.utility.Utility;

public class BubbleInserStop4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		int choice;
		int i;
		System.out.println("Enter the choice\n"
				+ "1- binarySearch method for integer\n" + 
				"2-binarySearch method for String\n" + 
				"3-insertionSort method for integer\n" + 
				"4-insertionSort method for String\n" + 
				"5-bubbleSort method for integer\n" + 
				"6-bubbleSort method for String");
		choice=scanner.nextInt();
		
		
		Utility utility=new Utility();
		
		switch(choice) 
		{
		case 1:		int values[]=new int[5];
					System.out.println("enter the size of array : ");
					int size=scanner.nextInt();
					int arr[]=new int[size];
					System.out.println("enter the elements/values in array : ");
					
					for(i=0;i<size;i++)
					{
						values[i]=scanner.nextInt();
						
					}
					System.out.println("enter the target key");
					int target=scanner.nextInt();
					int result=(utility.findIndex(values, target));	
					if(result ==-1)
						System.out.println("target value is not found");
					else
						System.out.println("target value index: "+result);
					break;
		case 2:		utility.bsearch(target, arr, 0, arr.length);
					System.out.println("Binary string");
					break;
		case 3:		
					System.out.println("Insertion sort in Integer");		
					utility.insertionSort();
					break;
		case 4:		
					System.out.println("Insertion sort for String");
					//InsertionString();
					break;
		case 5:		
					System.out.println("Bubble sort in Integer");
					utility.bubbleSort();
					break;
		case 6:		
					System.out.println("Bubble sort in string");
					//BubbleString();
					break;
		default :	System.out.println("Invalid choice");
					break;
			      }
	}
}