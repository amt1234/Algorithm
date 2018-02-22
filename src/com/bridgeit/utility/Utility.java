package com.bridgeit.utility;

import java.io.PrintWriter;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

import com.bridgeit.programs.Twodarray9;



public class Utility {
	String str2;
	

	public String username(String str) {
		if (str.length() >= 3) {
			String str1 = "hello, username how are you.";
			str2 = str1.replace("username", str);
			// return str2;
		} else {
			System.out.println("Username should be grater than 3 character");
		}
		return str2;
	}

	public void leapyear(int year) {

		if (Integer.toString(year).length() == 4) {
			if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
				System.out.println(year + " Is leap year");
			} else {
				System.out.println(year + " Is not leap year");
			}
		} else {
			System.out.println("Invalid year");
		}
	}

	public void harmonic(int n) {
		float sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + (1 / (float) i);
		}
		System.out.println("sum of harmonic value =" + sum);
	}

	public void flipcoin(int time) {
		int count1 = 0;
		int count2 = 0;

		if (time >= 0) {
			for (int i = 0; i < time; i++) {
				System.out.println(Math.random());
				if (Math.random() < 0.5) {
					System.out.println("head");
					count1++;
				} else {
					System.out.println("tail");
					count2++;
				}
			}
		}
		int head = (count1 * 100) / time;
		int tail = (count2 * 100) / time;
		System.out.println("head =" + head + " % vs tail = " + tail + "%");
	}

	public void powerOf2(int n) {
		if (n > 0 && n < 31) {
			int result = (int) Math.pow(2, n);

			for (int i = 1; i <= result; i++) {

				int k = (int) Math.pow(i, 2);
				System.out.println(i + "^2 =" + k);
			}
		} else {
			System.out.println("overflow");
		}

	}

	public void fact(int n) {
		int facts = 1;
		facts = facts * (n - 1);
		System.out.println(facts);
	}

	public void gambler(int stake, int goal, int time) {
		int won = 0, loss = 0, beat = 0;
		for (int i = 0; i < time; i++) {
			int cash = stake;
			while (cash > 0 && cash < goal) {
				beat++;
				if (Math.random() < 0.5) {
					cash++;

				} else {
					cash--;
				}
			}

			if (cash == goal) {
				won++;
			}

			loss = time - won;
		}
		System.out.println("wins" + won);
		System.out.println("loss" + loss);
		System.out.println("Beat" + beat);
		int wins = (won * 100) / time;
		int los = (loss * 100) / time;
		System.out.println(wins + "% vs " + los + "%");
	}

	public void coupen(int coupen_no) {
		LinkedHashSet randomnumber = new LinkedHashSet();
		int setvalue;
		Random r = new Random();
		for (int i = 0; i < coupen_no; i++) {

			setvalue = r.nextInt(10000);
			randomnumber.add(new Integer(setvalue));

		}
		System.out.println(randomnumber + " ");
	}

	public void distance(double x, double y) {
		double x1 = Math.pow(x, 2);
		double y1 = Math.pow(y, 2);
		double result = x1 + y1;
		double output = Math.sqrt(result);
		System.out.println("Distance is=" + output);
	}

	public void triples() {
		int temp, i, j, k;
		int count = 0;
		int count1 = 0;
		int a[] = { 20, 0, -20, -30, 50, 50 };
		//boolean found = false;

		for (i = 0; i < a.length; i++) {
			for (j = (i + 1); j < a.length - 2; j++) {
				for (k = (j + 1); k < a.length - 1; k++) {
					int result = a[i] + a[j] + a[k];

					if (result == 0) {
						temp = a[i];
						a[i] = a[j];
						a[j] = a[k];
						//found = true;
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
					}

				}
			}
		}

		System.out.println(count + " count of triple ," + count1 + " count of not triple");

		//if (found == false)
			System.out.println("no triplet found.....");
	}

	//TWODARRAY 
	
	public void twodarray(int m,int n)
	{
		PrintWriter printwriter=new PrintWriter(System.out);
		Twodarray9 tt=new Twodarray9();
		
		Scanner scanner=new Scanner(System.in);
		
		Integer arr[][]=new Integer[m][n];
		double arr2[][]=new double[m][n];
		boolean arr3[][]=new boolean[m][n];
		
		
		
		printwriter.write("Enter your choice :");
		printwriter.write("1.Integer array\n");
		
		printwriter.write("2.Double array\n");
		
		printwriter.write("3.Boolean array\n");
		printwriter.flush();
		int choice=scanner.nextInt();
		
		switch(choice)
		{
		case 1:
			printwriter.write("Integer array is\n");
			printwriter.flush();
			
			printwriter.write("Enter the elements\n");
			printwriter.flush();
			
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					arr[i][j]=scanner.nextInt();
					
				}
			}
			
			
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					int iArray=arr[i][j];
					
					printwriter.write(String.valueOf(iArray)+" ");
					printwriter.flush();
					
				}
				printwriter.println();
				printwriter.flush();
			}
			
			
			break;
			
		case 2:
			printwriter.write("Double array is\n");
			printwriter.flush();
			
			printwriter.write("Enter the elements\n");
			printwriter.flush();
			
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					arr2[i][j]=scanner.nextDouble();
					
				}
			}
			
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					double iArray=arr2[i][j];
					
					printwriter.write(String.valueOf(iArray)+" ");
					printwriter.flush();
					
				}
				printwriter.println();
				printwriter.flush();
			}
			break;
		case 3:
			printwriter.write("Boolean array is\n");
			printwriter.flush();
			
			printwriter.write("Enter the elements\n");
			printwriter.flush();
			
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					arr3[i][j]=scanner.nextBoolean();
					
				}
			}
			printwriter.write("boolean array is\n");
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					
					
					printwriter.write(arr3[i][j]+" ");
					printwriter.flush();
					
				}
				printwriter.println();
				printwriter.flush();
			}
			break;
			default:
				printwriter.println("Invalid choice");
				printwriter.flush();
				printwriter.close();
		}
		
	}
	
	public void windchill(double t,double v)
	{
		double w;
		if(t>50)
		{
			System.out.println("Invalid range");
		}
		else if(v>120 && v<3)
		{
			System.out.println("Invalid range");
		}
		else
		{
			w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
			System.out.println("w is = "+w);
		}
		
	}
	
	public void quadratic(int a,int b,int c)
	{
		
		int delta=b*b - 4*a*c;
		System.out.println("delta is : "+delta);
		
		if(delta>0)
		{
			System.out.println("Root are real and unequal");
			double root1=(-b+Math.sqrt(delta))/(2*a);
			double root2=(-b-Math.sqrt(delta))/(2*a);
			System.out.println("Root1 is : "+root1);
			System.out.println("Root2 is : "+root2);
		}
		else if(delta==0)
		{
			System.out.println("Root are real and equal");
			double root1=(-b+Math.sqrt(delta))/(2*a);
			
			System.out.println("Root1 is : "+root1);
				
		}
		else
		{
			System.out.println("Root is imagenary");
		}
	}
	
	
		
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
	
	
	//permutation
	
	public void permutation1(String str,int i,int j)
	{
		if(i==j)
		{
			System.out.println(str);
		}
		else
		{
			for(int k=i;k<=j;k++)
			{
				str=strSwap(str,i,k);
				permutation1(str,i+1,j);
				str=strSwap(str,i,k);
			}
		}
		
	}
	public String strSwap(String str1,int f,int s)
	{
		char ch[]=str1.toCharArray();
		char temp;
		temp=ch[f];
		ch[f]=ch[s];
		ch[s]=temp;
		
		return String.valueOf(ch);
	}
		
	
}
