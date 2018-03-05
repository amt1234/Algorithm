package com.bridgeit.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import com.bridgit.utility.Utility;
/******************************************************************************
 *  Purpose:  Reads in strings from standard input and prints them in sorted order.
			  Uses insertion sort.
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
public class Insertion {

	public static void main(String[] args) throws Exception 
	{
		Utility utility=new Utility();
		File file=new File("binary1.txt");
		FileReader filereader =new FileReader(file);
		BufferedReader bufferedreader=new BufferedReader(filereader);
		
		String string;
		string=bufferedreader.readLine();
		System.out.println(string);
		String[] array=string.split(" ");
		
		utility.printBubble(array);	
	}

}
