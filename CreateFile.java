package FileHanling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the filePath:");
		Scanner sc=new Scanner(System.in);
		
		File F=new File(sc.nextLine());
		
		System.out.println(F);
		
		boolean b=F.createNewFile();
		System.out.println("It can read the file:"+F.canRead());
		System.out.println("It is Write the File:"+F.canWrite());
		System.out.println("get name of File:"+F.getName());
		
		try
		{
		if(b==true)
		{
			System.out.println("File Created Successfully...!!");
		}
		else
		{
			System.out.println("Something missing..!!");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		}

		
		

	}



