package FileHanling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class concatingStrings {
	
	
	public static void main(String[] args) throws IOException {
		
		FileWriter f=new FileWriter("D:\\first.txt");
		f.write("i love mom");
		FileWriter f1=new FileWriter("D:\\second.txt");
		f1.write("i love dad");
		
		File l=new File("D:\\first.txt");
		File ll=new File("D:\\second.txt");
		Scanner sc=new Scanner(l);
		Scanner sc1=new Scanner(ll);
		f.close();
		f1.close();
		StringBuffer sb=new StringBuffer();
		while(sc.hasNext())
		{
			sb.append(sc.nextLine());
		}
		StringBuffer sb1=new StringBuffer();
		while(sc1.hasNext())
		{
			sb1.append(sc1.nextLine());
		}
		System.out.println(sb+" "+sb1);
		String s=sb.toString();
		String s2=sb.toString();
		String b[]=s.split(" ");
		String c[]=s2.split(" ");
		FileWriter n=new FileWriter("D:\\Third.txt");
		File p=new File("D:\\Third.txt");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				if(b[i].equals(c[j]))
				{
					n.write(b[i]);
				}
			}
		}
		
		n.close();
		System.out.println(p.canExecute());
		System.out.println();
		
		
		System.out.println("suceess");
		
		
	}

}
