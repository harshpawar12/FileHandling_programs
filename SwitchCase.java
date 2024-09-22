package FileHanling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SwitchCase {
	
	void CreateFile() throws IOException
	{
		File f=new File("D:\\create.txt");
		
		boolean b=f.createNewFile();
		
		if(b==true)
		{
			System.out.println("File created succesfullly:");
		}
		else
		{
			System.out.println("Something missing.....");
		}
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number:");
		int ch=sc.nextInt();
		SwitchCase a=new SwitchCase();
		switch(ch)
		{
		case 1:
			a.CreateFile();
			break;
			
		
		}
	

	}

}
