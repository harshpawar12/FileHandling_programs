package FileHanling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class desirialise {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String s="D:\\serializable.txt";
		
		FileInputStream FI=new FileInputStream(s);
		ObjectInputStream os=new ObjectInputStream(FI);
		
		seriallise e=(seriallise) os.readObject();
		System.out.println("---------------------------------");
		System.out.println(e.getId()+" | "+e.getName()+" | "+e.getPassword()+" | "+e.getPhone()+"|");
		System.out.println("---------------------------------");

		FI.close();
		os.close();
		System.out.println("data get succesfully");
	}

}
