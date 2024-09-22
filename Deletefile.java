package FileHanling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Deletefile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the filePath:");
		Scanner sc=new Scanner(System.in);
		
		File F=new File(sc.nextLine());
		//boolean b1=F.createNewFile();
		boolean b=F.delete();
		if(b==true)
		{
			System.out.println("Delete Succesfully");
		}
		else
		{
			System.out.println("Not succesfullly");
		}
	
		

	}

}
