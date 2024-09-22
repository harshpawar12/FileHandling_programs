package FileHanling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFileString {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f=new File("D:\\h2.txt");
		f.canWrite();
		System.out.println(f+" File creted ");
		
		Scanner sc=new Scanner(f);
		StringBuilder sb=new StringBuilder();
		while(sc.hasNext())
		{
			sb.append(sc.nextLine());
		}
		sc.close();
		String s1=sb.toString();
		String[] s2=s1.split(" ");
		System.out.println(s2.length);
		

	}

}
