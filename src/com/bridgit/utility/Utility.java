package com.bridgit.utility;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	Scanner scanner;
	public Utility()
	{
		scanner=new Scanner(System.in);
	}

	// INPUT STRING
	public String inputString() {
		try {
			return scanner.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
}
	// INPUT Integer
		public int inputInteger() {
			try {
				return scanner.nextInt();
			} catch (Exception e) {
				System.out.println(e);
			}
			return 0;
	}
	
	
	
	
	/**
	 * @param string1
	 * @param string2
	 * An Anagram Detection Example
	 */
	public void anagram(String string1,String string2) 
	{
		int count=0;
		int count1=0;
		
		char[] charArray=string1.toCharArray();
		char[] charArray2=string2.toCharArray();
		
		for(int i=0;i<string1.length();i++)
		{
			for(int j=0;j<string2.length();j++)
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
		if(count==string1.length())
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
	public static void extened(int number)
	{
		int reminder=0,sum=0;
		int temp=number;
		
		while(number>0)
		{
			reminder=number%10;
			number=number/10;
			sum=sum*10+reminder;
		}
		
		if(temp==sum)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrom");
		}
		
	}
	
	
	/**
	 * @param choice
	 * Temperatur Conversion
	 */
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
	
	/**
	 * @param P for principal
	 * @param Y for year
	 * @param R for rate
	 * calculate monthly Payment
	 */
	public void monthlyPayment(double P,double Y,double R)
	{
		double r,n;
		double payment;
		r=(R/(12*100));
		n=12*Y;
		payment=((P*r)/(1-Math.pow(1+r, (-n))));
		System.out.println("Monthly Pyment is :"+payment);	
		
	}
	
		
	/**
	 * @param d for day
	 * @param m for month
	 * @param y for year
	 *  Calculate dayOfWeek
	 */
	public void dayOfWeek(int d,int m,int y)
	{
		
		int y0,x,m0,d0;
		y0 = (int)(y-(14-m)/ 12);
		x = (int)(y0 + (y0/4)-(y0/100)+(y0/400));
		m0 = (int)(m + 12*((14-m) / 12)-2);
		d0 =(int)((d+ x +((31*m0)/12))%7);

		
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
			System.out.println("saturday");
			break;
	default:
		System.out.println("Invalid input");
		break;
		}
	}
	
	
	
	/**
	 * @param c
	 * compute the square root of a nonnegative number
	 */
	public void squroot(int c)
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
	
	public  void insertionSort()
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
	
	
	
	/**
	 * @param word
	 * @param words
	 * @param a
	 * @param b
	 * @return result of index
	 * binaryserch for string
	 */
	public  int bsearch(String word, String [] words, int a, int b)
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
	
	
	/**
	 * @param N
	 * @param target
	 * @return result of index
	 *  the Number N and then recursively ask true/false if the number is between a high and low value
	 */
	public int numberFind(int N,int target)
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
	
	/**
	 * @param amount
	 * @param hashset
	 * @param count
	 * @return count of notes
	 */
	public  int vending(int amount,HashSet hashset,int count)
	{
		int array[]= {2000,1000,500,200,100,50,20,10,5,2,1};
		int n=array.length;
		
		if(amount>0)
		{
			for(int i=0;i<=n;i++)
			{
				if(array[i]<=amount)
				{
					amount=amount-array[i];
					count++;
					hashset.add(array[i]);
					break;
					
				}
				
			}
		
			if(amount==0)
			{
				System.out.println(count);
				System.out.println(hashset);
				return 0;
			}
		
		}
		return vending(amount,hashset,count);	
		
	}
	
	/**
	 * @param number
	 * @return decimal to binary
	 */
	public  double toBinary(int number)
	{
	

		String string="";
		while(number!=0)
		{
			int remainder=number%2;
			string=remainder+string;
			number=number/2;
			
		}
		double result = 0;
		int j=0;
		System.out.println(string);
		
		for (int i =  string.length()-1; i >=0; i--) 
		{
			if (string.charAt(i)=='0') {
				result = result +(0 * Math.pow(2, j));
				j++;
				
			}else {
				result = result +(1 * Math.pow(2, j));
				j++;
				
			}
			
		}
		
		return result;
	}

	
	 /**
	 * @param array
	 * @ InsertionSort with string and integer
	 */
	public  <T extends Comparable> void printInsertion(T[] array)
     {                              
	
		T key;
			int i,j;
			for(i=1;i<array.length;i++)
			{
				key=array[i];
				for(j=i-1;j>=0 &&(key.compareTo(array[j]))<0;j--)
					array[j+1]=array[j];
						array[j+1]=key;
			}
			for(i=0;i<array.length;i++)
			{
				System.out.println(array[i]);
			}
     }
	
	/**
	 * @param array
	 * BubbleSort with string and integer
	 */
	public  <T extends Comparable> void printBubble(T[] array)
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
	
	
	/**
	 * @param array
	 * @param target
	 * @param start
	 * @param end
	 * @return result of index value
	 */
	public  <T extends Comparable> int printBinarySearch(T[] array,T target,int start,int end)
    {
   	 T temp;
   	 int i,j;
   	 int mid=0;
   	 if(start>=end)
   	 {
   		 return -1;
   	 }
   	 else
   	 {
   		 mid=(start+end)/2;
   		 if(target.compareTo(array[mid])<0)
   		 {
   			 return printBinarySearch(array,target,0,mid+1);
   		 }
   		 else if(target.compareTo(array[mid])>0)
   		 {
   			 return printBinarySearch(array,target,mid-1,0);
   		 }
   		 return mid;
   	 }
   	
    }
	
	/**
	 * @param number
	 * decimal to binary and swap nibbles
	 */
	public  void nibbleSwap(int number)
	{
	
		String string="";
		while(number!=0)
		{
			int remainder=number%2;
			string=remainder+string;
			number=number/2;
			
		}
		double result = 0;
		int j=0;
		System.out.println(string);
		if(string.length()<8)
		{
			while (string.length()<8)
			{
				string = "0" + string;
			}
		}
		else
		{
			while (string.length()<16)
			{
				string = "0" + string;
			}
		}
		char array[] = string.toCharArray();
		for (int i=0;i<3;i++)
		{
			char ch = array[i];
			array[i]= array[i+4];
			array[i+4]= ch; 
		}
		string = String.valueOf(array);
		System.out.println("After Swapping Nibbles:"+string);
		
				for (int i =  string.length()-1; i >=0; i--) 
				{
					if (string.charAt(i)=='0') {
						result = result +(0 * Math.pow(2, j));
						j++;
						
					}else {
						int dec=(int)(1 * Math.pow(2, j));
						System.out.print(dec +" ");
						result = result +(1 * Math.pow(2, j));
						
						j++;	
					}	
				}			
		System.out.println("Number after swapping Nibbles: " +result);
		}
		
	/**
	 * @param string
	 * @return result of string
	 */
	public  String[] mergeSort(String[] string) 
	{
		int i,j,k;
		if(string.length==0)
			return null;
		if(string.length>1)
		{
			int mid = string.length/2;
			String[] lowerHalf = new String[mid];
			String[] higherHalf = new String[string.length-mid];
			for(i=0;i<mid;i++)
			{
				lowerHalf[i] = string[i];
			}
			for(i=mid;i<string.length;i++)
			{
				higherHalf[i-mid] = string[i];
			}
			mergeSort(lowerHalf);
			mergeSort(higherHalf);
			
			i=0;
			j=0;
			k=0;
			//merge left and right Array
			while(i<lowerHalf.length && j<higherHalf.length)
			{
				if(lowerHalf[i].compareTo(higherHalf[j])<0)
					string[k++] = lowerHalf[i++];
				else
					string [k++] = higherHalf[j++];
			}
			//merge Remaining Array
			while(i<lowerHalf.length)
				string[k++] = lowerHalf[i++];
			while(j<higherHalf.length)
				string[k++] = higherHalf[j++];
		}
		return string;
	}


}
