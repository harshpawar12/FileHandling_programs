package FileHanling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileWordFreq 
{

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		File f=new File("D:\\h3.txt");
		
		Scanner sc=new Scanner(f);
		
		
		StringBuilder sb=new StringBuilder();
		while(sc.hasNext())
		{
			sb.append(sc.nextLine());
			
		}
		int max=0;
		String s=null;
		int k=0;
		char g[]=new char[sb.length()];
		
		for(int i=0;i<sb.length();i++)
		{
			int c=1;
			for(int j=i+1;j<sb.length();j++)
			{
				if(sb.charAt(i)==sb.charAt(j))
				{
					c++;
					sb.deleteCharAt(j);
					j--;
				
				}
			}
			if(sb.charAt(i)!='\0' && sb.charAt(i)!=' ')
			{
				
				System.out.println(sb.charAt(i)+" "+c);
			}
			if(c>max)
			{
				max=c;
				s=sb.charAt(i)+" ";
			}
			
			if(sb.charAt(i)!='j'||sb.charAt(i)!='A'||sb.charAt(i)!='V'||
					sb.charAt(i)!='P'||sb.charAt(i)!='R'||sb.charAt(i)!='G'||
					sb.charAt(i)!='M'||sb.charAt(i)!='I'||sb.charAt(i)!='N')
			{
				g[k++]=sb.charAt(i);
				
			}
			
			
		}
		System.out.println("that do not appear in the file...!!");

		int asc = 65;
		for(int i=asc;i<=90;i++)
		{
			char t = (char)i;
			int cnt= 0;
			for(int j=0;j<sb.length();j++)
			{
				if(t==sb.charAt(j))
				{
					cnt++;
				}
			}
			if(cnt==0)
				System.out.print(t+" ");
		}
		System.out.println();

		System.out.println("most Frequency Element are:");
		System.out.println(s);
		
		sc.close();

	}

}
