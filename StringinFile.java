package FileHanling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StringinFile {
	
	public static void main(String[] args) {
		
		try {
			
			File f=new File("D://sbprint.txt");
			
			
			
			FileWriter f1=new FileWriter("D://sbprint.txt");
			f1.write("i like it");
			
			
			f1.close();
			
			
			
			Scanner sc=new Scanner(f);
			
			StringBuilder sb=new StringBuilder();
			while(sc.hasNext())
			{
				sb.append(sc.nextLine());
			}
			System.out.println(sb);
			sc.close();
			System.out.println("file successfully");
			
			
				} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
