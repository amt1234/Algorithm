package com.bridgeit.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.bridgit.utility.Utility;
/******************************************************************************
 *  Purpose: The program reports if the search word is found in the list.

 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
public class BinarySearchWord {

	public static void main(String[] args) throws IOException {
		Utility utility=new Utility();
		File file=new File("binary1.txt");
		FileReader filereader =new FileReader(file);
		BufferedReader bufferedreader=new BufferedReader(filereader);
		
		String string;
		System.out.println("Enter the target key to search");
		String target =utility.inputString();
		
		string=bufferedreader.readLine();
		System.out.println(string);
		String[] arr=string.split(" ");
		
		
		int index=(utility.bsearch(target,arr,0,arr.length));
		
		if(index==-1) {
			System.out.println("not found");
		} else {
			System.out.println("found at index " + index);
}

	}

}
