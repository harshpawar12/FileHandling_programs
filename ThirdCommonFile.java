package FileHanling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ThirdCommonFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try
		{
		File f=new File("D:\\file1.txt");
		File f1=new File("D:\\file2.txt");
		
		Scanner sc=new Scanner(f1);
		Scanner sc1=new Scanner(f);
		
		StringBuilder sb=new StringBuilder();
		
		while(sc.hasNext())
		{
		 sb.append(sc.nextLine()).append(" ");
		}
		StringBuilder sb1=new StringBuilder();
		while(sc1.hasNext())
		{
			sb1.append(sc1.nextLine()).append(" ");
		}
		sc.close();
		sc1.close();
		FileWriter fl=new FileWriter("D:\\file3.txt");
		
		
		String s=sb.toString();
		String s1=sb1.toString();
		String a[]=s.split(" ");
		String a1[]=s1.split(" ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a1.length;j++)
			{
				if(a[i].equals(a1[j]))
				{
				
					fl.write(a[i]+" ");
									
					System.out.println("content...");
				}
					
				}
				
		}
		
			fl.close();
			System.out.println("The Given file same Content:");
			System.out.println("File 1:");
			File Read3=new File("D:\\file1.txt");
			Scanner sc4=new Scanner(Read3);
			while(sc4.hasNext())
			{
				System.out.println(sc4.nextLine());
			}
			sc.close();
			System.out.println("File 2:");
			File Read1=new File("D:\\file2.txt");
			Scanner sc3=new Scanner(Read1);
			while(sc3.hasNext())
			{
				System.out.println(sc3.nextLine());
			}
			sc.close();
			System.out.println("File 3:");
			File Read=new File("D:\\file3.txt");
			Scanner sc2=new Scanner(Read);
			while(sc2.hasNext())
			{
				System.out.println(sc2.nextLine());
			}
			sc.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	//	fl.write("hello ");
		
		
		


	}

}
