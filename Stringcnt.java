package FileHanling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Stringcnt {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter f=new FileWriter("D:\\word.txt");
		f.write("i love coading");
		
		File F=new File("D://word.txt");
		
		Scanner sc=new Scanner(F);
		StringBuilder sb=new StringBuilder();
		f.close();
		while(sc.hasNext())
		{
			sb.append(sc.nextLine());
		}
		System.out.println(sb);

		String s=sb.toString();
		String s1[]=s.split(" ");
		System.out.println(s1.length);
		
		
	}

}
