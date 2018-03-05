package com.bridgeit.programs;

import com.bridgit.utility.Utility;
/******************************************************************************
 *  Purpose: Program for binarySearch,Insertionsort,bubblesort in string and Integer to 
 			find there elapes time.
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
public class BubbleInsertionBinary {

	public static void main(String[] args) {
		
				int choice;
				int i,size;
				int index;
				double start,end,elapesTime;
				Utility utility=new Utility();
				System.out.println("Enter the choice\n"
						+ "1- binarySearch method for integer\n" + 
						"2-binarySearch method for String\n" + 
						"3-insertionSort method for integer\n" + 
						"4-insertionSort method for String\n" + 
						"5-bubbleSort method for integer\n" + 
						"6-bubbleSort method for String");
				choice=utility.inputInteger();
				
				switch(choice) 
				{
				case 1:		System.out.println("enter the size of array");
							size=utility.inputInteger();
							Integer array[]=new Integer[size];
							System.out.println("enter the values : ");
							for(i=0;i<array.length;i++)
							{
								array[i]=utility.inputInteger();	
							}
							System.out.println("Enter the target key");
							Integer target=utility.inputInteger();
							start=System.nanoTime();
							index=(utility.printBinarySearch(array, target, 0, array.length));
							
							if(index==-1) {
								System.out.println("not found");
							} else {
								System.out.println("found at index " + index);
							}
							end=System.nanoTime();
							elapesTime=end-start;
							System.out.println("elapes time: "+elapesTime);
							break;
				case 2:		
							System.out.println("enter the size of array");
							size=utility.inputInteger();
							String array1[]=new String[size];
							System.out.println("enter the values : ");
							for(i=0;i<array1.length;i++)
							{
								array1[i]=utility.inputString();
							}
							System.out.println("Enter the target key");
							String target1=utility.inputString();
							start=System.nanoTime();
							int index1=(utility.printBinarySearch(array1, target1, 0, array1.length));
							
							if(index1==-1) {
								System.out.println("not found");
							} else {
								System.out.println("found at index " + index1);
							}
							end=System.nanoTime();
							elapesTime=end-start;
							System.out.println("elapes time: "+elapesTime);
							break;
							
							
				case 3:		System.out.println("enter the size of array");
							size=utility.inputInteger();
							Integer array2[]=new Integer[size];
							System.out.println("enter the values : ");
							for(i=0;i<array2.length;i++)
							{
								array2[i]=utility.inputInteger();
								
							}
							start=System.nanoTime();
							utility.printInsertion(array2);
							end=System.nanoTime();
							elapesTime=end-start;
							System.out.println("elapes time: "+elapesTime);
							break;
				case 4:		
							System.out.println("enter the size of array");
							size=utility.inputInteger();
							String array3[]=new String[size];
							System.out.println("enter the values : ");
							for(i=0;i<array3.length;i++)
							{
								array3[i]=utility.inputString();
								
							}
							start=System.nanoTime();
							utility.printInsertion(array3);
							end=System.nanoTime();
							elapesTime=end-start;
							System.out.println("elapes time: "+elapesTime);
							break;
				case 5:		
							System.out.println("enter the size of array");
							size=utility.inputInteger();
							Integer array4[]=new Integer[size];
							System.out.println("enter the values : ");
							for(i=0;i<array4.length;i++)
							{
								array4[i]=utility.inputInteger();
								
							}
							start=System.nanoTime();
							utility.printBubble(array4);
							end=System.nanoTime();
							elapesTime=end-start;
							System.out.println("elapes time: "+elapesTime);
							break;
				case 6:		
							System.out.println("enter the size of array");
							size=utility.inputInteger();
							String array5[]=new String[size];
							System.out.println("enter the values : ");
							for(i=0;i<array5.length;i++)
							{
								array5[i]=utility.inputString();
								
							}
							start=System.nanoTime();
							utility.printBubble(array5);
							end=System.nanoTime();
							elapesTime=end-start;
							System.out.println("elapes time: "+elapesTime);
							break;
				default :	System.out.println("Invalid choice");
							break;
				}
				
			}
			

}
