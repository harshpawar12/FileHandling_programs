package FileHanling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class countOfCharUseFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f=new File("D:\\h2.txt");
		Scanner sc=new Scanner(f);
		
		StringBuilder sb=new StringBuilder();
		while(sc.hasNext())
		{
			sb.append(sc.nextLine());
		}
		String s1=sb.toString();
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int c=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
					ch[j]='\0';
				}
				
			}
			if(ch[i]!='\0' && c!=1 || c==1)
			{
				if(ch[i]!='\0')
				System.out.println(ch[i]+" :C: "+c);
			}
		}
		
		
		

	}

}
