package FileHanling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Emp implements java.io.Serializable
{
	private int id;
	private String name;
	private int sal;
	private String add;
	
	Emp(int id,String name,int sal,String add)
	{
		super();
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.add=add;
	}
	
	
	
	public String getEmpname()
	{
		return name;
	}
	
	public String getEmpaddre()
	{
		return add;
	}
	public int getEmpid()
	{
		return id;
	}
	public int getEmpsal()
	{
		return sal;
	}


	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + ", add=" + add + "]";
	}


}
public class Serializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp E=new Emp(1,"harsh",50000,"karad");
		Emp E1=new Emp(2,"sangram",50000,"karadk");
		
		File f=new File("D:\\encript.txt");
		
	
		try {
			FileOutputStream ob=new FileOutputStream(f);
			ObjectOutputStream O=new ObjectOutputStream(ob);
			
			O.writeObject(E);
			O.writeObject(E1);
			ob.close();
			O.close();
			
			System.out.println("File content Created succesfully..");
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
		

	}

}
