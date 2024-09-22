package FileHanling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex2 {
	/*
	 * Question 2:
Create a file named products.txt and add the following data:

P01, Laptop, 1200
P02, Smartphone, 800
P03, Tablet, 500
P04, Monitor, 300
Write a Java program that reads the data from the file and performs the following operations:

Identify and print the most expensive product.
Calculate and print the total cost of all products.


	 */
	
	public static void main(String[] args) throws IOException {
		
	
		FileWriter f=new FileWriter("D:\\backup\\product.txt");
		f.write("P01, Laptop, 1200\n");
		f.write("P02, smartphone, 800\n");
		f.write("P03, Tablet, 500\n");
		f.write("P04, monitor, 300\n");
		
		f.close();
		
		File f1=new File("D:\\backup\\product.txt");
		Scanner sc=new Scanner(f1);
		int sumval=0;
		int totalval=0;
		String saveProduct="";
		int cost=0;
		while(sc.hasNextLine())
		{
			String line=sc.nextLine();
			String[]s=line.split(", ");
			
			String pro=s[0]+s[1];
			int val=Integer.parseInt(s[2]);
			sumval+=val;
			cost+=val;
			if(val>totalval)
			{
				totalval=val;
				saveProduct=pro;
			}
		}
		sc.close();
		
		System.out.println("most Expensive Product is:"+saveProduct+" val:"+totalval);
		System.out.println("Total product cost:"+cost);
		
		
	}

}
