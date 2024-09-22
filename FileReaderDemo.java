package FileHanling;

import java.io.File;
import java.util.Scanner;

public class FileReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			File f=new File("E:\\codeneraPractice\\Alphawhile10.java");
			Scanner sc=new Scanner(f);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.next());
			
			
		}
	
		sc.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	

	}

}
