package FileHanling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRederExample {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File F=new File("E:\\codeneraPractice\\Alphawhile11.java");
		Scanner sc=new Scanner(F);
		
		
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.next());
		}
		sc.close();
	

	}

}
