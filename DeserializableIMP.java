package FileHanling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializableIMP {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String str="D:\\Hasko.txt";
		
		FileInputStream obj=new FileInputStream(str);
		ObjectInputStream b=new ObjectInputStream(obj);
		emp1 e=(emp1)b.readObject();
		emp1 e2=(emp1)b.readObject();
		emp1 e3=(emp1)b.readObject();
		emp1 e4=(emp1)b.readObject();
		
		System.out.println("Record Displaying....!!");
		System.out.println(e.getempid()+" "+e.getempname()+" "+e.getempsal());
		System.out.println(e2.getempid()+" "+e2.getempname()+" "+e2.getempsal());
		System.out.println(e3.getempid()+" "+e3.getempname()+" "+e3.getempsal());
		System.out.println(e4.getempid()+" "+e4.getempname()+" "+e4.getempsal());
		obj.close();
		b.close();
		

	}

}
