package FileHanling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Desirializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="D:\\encript.txt";
		

		
		try {
			
			FileInputStream obj=new FileInputStream(str);
			ObjectInputStream O=new ObjectInputStream(obj);
			
			Emp E=(Emp)O.readObject();
			Emp E1=(Emp)O.readObject();
			
			System.out.println(E.getEmpid()+" "+E.getEmpname()+" "+E.getEmpsal()+" "+E.getEmpaddre());
			System.out.println(E1.getEmpid()+" "+E1.getEmpname()+" "+E1.getEmpsal()+" "+E1.getEmpaddre());
		
			
			obj.close();
			O.close();
			
			
			
		
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
