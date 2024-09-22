package FileHanling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex5 {

	/*
	 * Write a Java program to create a file named expenses.txt and add the following data:


Rent, 1200
Groceries, 300
Utilities, 150
Transportation, 100
After writing the data to the file, read it and perform the following operations:

Calculate and print the total monthly expenses.
Identify and print the category with the highest expense.

	 */
	
		public static void main(String[] args) throws IOException{
			
			FileWriter f=new FileWriter("D:\\backup\\expenses.txt");
			f.write("Rent, 1200\n");
			f.write("Groceries, 300\n");
			f.write("Utilities, 150\n");
			f.write("Transportation, 100\n");
			f.close();
			
			File f1=new File("D:\\backup\\expenses.txt");
			Scanner sc=new Scanner(f1);
			int total=0;
			String visible="";
			int sum=0;
			int finalexp=0;
			while(sc.hasNext())
			{
				String l=sc.nextLine();
				String s[]=l.split(", ");
				
				String expense=s[0];
				int exp=Integer.parseInt(s[1]);
				
				total+=exp;
				sum+=exp;
				if(exp>finalexp)
				{
					finalexp=exp;
					visible=expense;
				}
				
			}
			sc.close();
			System.out.println("Total monthly Expenses:"+sum);
			System.out.println("Category with high Expense:"+visible+" High:"+finalexp);
			
		}
}
