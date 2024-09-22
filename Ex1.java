package FileHanling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex1 {
	/*
	 * Question 1:
Write a Java program to create a file named students.txt and add the following data:

101, John, 85
102, Alice, 92
103, Bob, 78
104, Diana, 88
After writing the data to the file, read the contents and perform the following operations:

Find and print the name of the student with the highest score.
Calculate and print the average score of all students.
	 */
	
	public static void main(String[] args) throws IOException {
		
		FileWriter f=new FileWriter("D:\student.txt");
		f.write("jonh, 85\n");
		f.write("kiran, 98\n");
		f.write("harsh, 99\n");
		f.write("gana, 77\n");
		
		f.close();
		File f1=new File("D:\student.txt");
		Scanner sc=new Scanner(f1);
		int highestScore=0;
		String storeName="";
		int Allavg=0;
		int total=0;
		int cnt=0;
		
		while(sc.hasNextLine())
		{
			String line=sc.nextLine();
			String name[]=line.split(", ");
			String save=name[0];
			int score=Integer.parseInt(name[1]);
			cnt++;
			total+=score;
			
			if(score>highestScore)
			{
				highestScore=score;
				storeName=save;
				
			}
			
		}
		sc.close();
		System.out.println("highest score is:"+highestScore+" Name "+storeName);
		System.out.println("Avg of student:"+(total/cnt));
		
		  
	}

}
