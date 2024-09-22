package FileHanling;

import java.io.FileWriter;

public class PrintwriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileWriter f=new FileWriter("D:\\h1.txt");
			f.write("java is simple");
			System.out.println();
			f.write("java is better than c");
			f.close();
			
			System.out.println("File Writed succesfully...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
