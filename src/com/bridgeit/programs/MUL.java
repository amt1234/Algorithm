package com.bridgeit.programs;

import java.io.PrintWriter;
import java.util.*;

import com.bridgit.utility.Utility;

public class MUL {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=scanner.nextInt();
		//Integer array[]=new Integer[size];
		String array[]=new String[size];
		System.out.println("enter the values : ");
		for(int i=0;i<array.length;i++)
		{
			//array[i]=scanner.nextInt();
		array[i]=scanner.next();
			
		}
		MUL m=new MUL();
		m.printInsertion(array);
		
	}
     public static <T extends Comparable> void printInsertion(T[] array)
      {
	
		T key;
			int i,j;
			for(i=1;i<array.length;i++)
			{
				key=array[i];
				for(j=i-1;j>=0 &&(key.compareTo(array[j]))<0;j--)
				//while(j>0 && key<a[j])
					array[j+1]=array[j];
						//i=i-1;
						array[j+1]=key;
			}
			for(i=0;i<array.length;i++)
			{
				System.out.println(array[i]);
			}
			
      }
     public static <T extends Comparable> void printBubble(T[] array)
     {
    	 T temp;
    	 int i,j;
    	for (i = 0; i < array.length; i++) 
    	{
			for (j = 0; j < array.length-i-1; j++)
			{
				if((array[j].compareTo(array[j+1]))>0)
				{
				temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
				}
			}
		}
    
     
     for(i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
     }
			//&& key<array[j]
/*
		int choice;
		//int i;
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
}*/
	
      
}