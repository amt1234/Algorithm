package com.bridgeit.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.bridgit.utility.Utility;

public class BinarySearchWord {

	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		File file=new File("binary.txt");
		FileReader filereader =new FileReader(file);
		BufferedReader bufferedreader=new BufferedReader(filereader);
		
		String string;
		//int count=0;
		System.out.println("Enter the target key to search");
		String target =scanner.nextLine();
		
		string=bufferedreader.readLine();
		System.out.println(string);
		String[] arr=string.split(" ");
		
		
		int index=(Utility.bsearch(target,arr,0,arr.length));
		
		if(index < 0) {
			System.out.println("not found");
		} else {
			System.out.println("found at index " + index);
}

	}

}
