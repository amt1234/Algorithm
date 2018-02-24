package com.bridgit.utility;

import java.util.Random;
import java.util.Scanner;

public class Utility {
	Scanner scanner=new Scanner(System.in);
	
	
	//An Anagram Detection Example
	
	public void anagram(String str1,String str2) 
	{
		int count=0;
		int count1=0;
		
		char[] charArray=str1.toCharArray();
		char[] charArray2=str2.toCharArray();
		
		for(int i=0;i<str1.length();i++)
		{
			for(int j=0;j<str2.length();j++)
			{
				if(charArray[i]==charArray2[j])
				{
					count++;
				}
				else
				{
					count1++;
				}
			}
		}
		if(count==str1.length())
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}

	}
	//find the Prime numbers in that range. 
	
	public void primenumber()
	{
		int count=0;
		System.out.print("{ 2, ");
		for(int n=3;n<=1000;n++)
		{
			for(int i=2;i<=1000;i++)
			{
			if(n%i==0)
			{
				
				break;
			}
			else
			{
				count++;
				System.out.print(n+",");
				break;
			}
			}
			
		}
		System.out.print(" }");
		System.out.println("\ncount="+count);
	}
	
	
	
	//Extend the above program to find the prime numbers that are Anagram and Palindrome 

	
	
	
	
	//TemperaturConversion
	
	public void temperature(int choice)
	{
		float celsius=0;
		float fahrenheit=0;
		switch(choice)
		{
			
		case 1:
			System.out.println("Enter the temperature in Celsius: ");
			
			celsius=scanner.nextFloat();
			fahrenheit=(celsius*9/5)+32;
			System.out.println("Temperature in Fahrenheit: "+fahrenheit);
			break;
			
		case 2:
			System.out.println("Enter the temperature in fahrenheit: ");
			
			fahrenheit=scanner.nextFloat();
			celsius=(fahrenheit-32)*5/9;
			System.out.println("Temperature in Fahrenheit: "+celsius);
			break;
		default:
			System.out.println("Invalid Input");
			break;
				
		}
		scanner.close();
		
	}
	
	
	//calculate monthly Payment
	// P-principal
	//Y-year
	//R-rate
	public void monthlyPayment(double P,double Y,double R)
	{
		double r,n;
		double payment;
		r=(R/(12*100));
		n=12*Y;
		payment=((P*r)/(1-Math.pow(1+r, (-n))));
		System.out.println("Monthly Pyment is :"+payment);
		
		
	}
	
	
	//dayOfWeek
	
	public void dayOfWeek(int d,int m,int y)
	{
		
		int y0,x,m0,d0;
		y0 = (int)((y-(14-m)) / 12);
		x = (int)y0 + y0/4-y0/100+y0/400;
		m0 = (int)((m + 12)*((14-m) / 12)-2);
		d0 =(int)((d+ x +(31*m0)/12))%7;

		
		switch(d0)
		{
		case 0:
			System.out.println("sunday");
			break;
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("satday");
			break;
	default:
		System.out.println("Invalid input");
		break;
		}
	}
	
	//squareroot
	
	public static void squroot(int c)
	{
			double epsilon = 1e-15;    
		    double t = c;              
		    
		        while (Math.abs(t - c/t) > epsilon*t) 
		        {
		            t = (c/t + t) / 2.0;
		        }
		        
		        System.out.println(t);
		      
		}
	
	//Binary Inserstio Bubble with stopwatch
	//@Binary search

	
		
	public static int findIndex(int values[],int target)
	{
		
		return binarySearch(values,target,0, values.length-1);
	}
	
	public static int binarySearch(int values[],int target,int start,int end)
	{
		int middle = 0;
		if(start>end)
		{
			return -1;
			
		}
		else
		{
		
			middle=(int)Math.floor((start+end)/2);
			int value=values[middle];
			
			if(value>target)
			{
				return binarySearch(values,target,start,middle-1);
			}
			
			if(value <target)
			{
				return binarySearch(values,target,middle+1,end);
			}
			//return middle;
		}
		return middle;
	
		
	}
	
	//InsertionSort
	
	public void insertionSort()
	{
		int i,j,key;
		System.out.println("enter the size of array : ");
		int size=scanner.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the elements in array : ");
		
		for(i=0;i<size;i++)
		{
			arr[i]=scanner.nextInt();
		}
		
		
		for(i=1;i<size;i++)
		{
			key=arr[i];
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
	

	//Bubble sort
	
	public  void bubbleSort()
	{
		int i,j;
		System.out.println("enter the size of array : ");
		int size=scanner.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the elements in array : ");
		
		for(i=0;i<size;i++)
		{
			arr[i]=scanner.nextInt();
		}
		
		for(i=0;i<size;i++)
		{
			for(j=0;j<size-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
		}
		System.out.println(arr[i]);
	}
}
	
	//binaryserch for string
	
	public static int bsearch(String word, String [] words, int a, int b)
	{
		if(b <= a)
		{
			return -1;
		}
		
		else
		{
			int mid = (a + b)/2;
			if(word.compareTo(words[mid]) < 0) 
			{
				return bsearch(word, words, 0, mid);
			} 
			else if(word.compareTo(words[mid]) > 0) 
			{
				return bsearch(word, words, mid, b);
			}

		return mid;
		}
	}
	
	//FIND Number
	
	public static int numberFind(int N,int target)
	{
		int remainder=0,sum=0;
		int n=0,count = 0;
		while(N>0)
		{
			if(N==1)
			{
				
				break;
			}
			else
			{
			N=N/2;
			count++;
			
			}
			
		}
		System.out.println(count);
		N=(int)Math.pow(2, count);
		System.out.println(N);
		
		int mid = 0,cunt=0,cunt1=0;
		boolean b=true;
		int array[]=new int[N];
		int i,j = 0;
		boolean flag=false;
		for(i=0,j=1;i<N;i++,j++)
		{
				array[i]=j;
			
		}
		int startp=0,endp=array.length-1;
		
		
		
		while(startp<=endp)
		{
			int m=(startp+(endp-1))/2;
			
			if(array[m]==target)
			{
				
				return m;
			}
			if(array[m]<target)
			{
				
				startp=m+1;
				flag=true;
				System.out.println(flag);
			}
			else
			{
				
				endp=m-1;
				flag=false;
				System.out.println(flag);
			}
			
		}
			
		
		return -1;
	
	}
}
