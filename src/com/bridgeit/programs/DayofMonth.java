package com.bridgeit.programs;
import java.util.*;

import com.bridgit.utility.Utility;
public class DayofMonth {

	public static void main(String[] args) 
	{
		int d;
		int m;
		int y;
		//Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the day :"+args[0]);
		d=Integer.parseInt(args[0]);
		
		System.out.println("Enter the day :"+args[1]);
		m=Integer.parseInt(args[1]);
		
		System.out.println("Enter the day :"+args[2]);
		y=Integer.parseInt(args[2]);
		
		Utility utility=new Utility();
		utility.dayOfWeek(d, m, y);
		
		
	}

}
