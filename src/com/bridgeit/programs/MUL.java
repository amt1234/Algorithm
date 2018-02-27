package com.bridgeit.programs;

import java.io.PrintWriter;
import java.util.*;

import com.bridgit.utility.Utility;

public class MUL {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) 
	{
	
	}
     public static <T extends Comparable> void multe(T[] array)
      {
	
		T key;
			
			for(int i=1;i<array.length;i++)
			{
				key=array[i];
				for(j=i-1;j>=0 && key<arr[j];j--)
				//while(j>0 && key<a[j])
					arr[j+1]=arr[j];
						//i=i-1;
						arr[j+1]=key;
			}
			for(i=0;i<size;i++)
			{
				System.out.println(arr[i]);
			}
			
		}


	

}