package FileHanling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class emp1 implements Serializable
{
	private int id;
	private String name;
	private int sal;
	
	emp1(int id,String name,int sal)
	{
		super();
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
	public int getempid()
	{
		return id;
	}
	public String getempname()
	{
		return name;
	}
	public int getempsal()
	{
		return sal;
	}

	@Override
	public String toString() {
		return "emp1 [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
}
public class serializableIMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp1 e=new emp1(1,"harsh",50000);
		emp1 e2=new emp1(2,"sangram",50000);
		emp1 e3=new emp1(3,"Omkar",50000);
		emp1 e4=new emp1(4,"Addii",50000);
		
		File f=new File("D:\\Hasko.txt");
		
		try {
			FileOutputStream obj=new FileOutputStream(f);
			ObjectOutputStream b=new ObjectOutputStream(obj);
			b.writeObject(e);
			b.writeObject(e2);
			b.writeObject(e3);
			b.writeObject(e4);
			obj.close();
			b.close();
			
			System.out.println("The file Making Succesfully...!");
			
			
		} catch (Exception e5) {
			e5.printStackTrace();
		}

		

	}

}
