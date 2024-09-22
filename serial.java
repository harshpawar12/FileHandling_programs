package FileHanling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class serial implements Serializable {
	
	private int id;
	private String name;
	   private String sal;
	public serial(int id, String name, String sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSal() {
		return sal;
	}
	
	@Override
	public String toString() {
		return "serial [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	public static void main(String[] args) {
		
		serial s=new serial(1,"harsh","50000");
		serial s1=new serial(2,"om","50000");
		serial s2=new serial(3,"sangram","50000");
		
		File f=new File("D:\\incrpt.txt");
		
		try {
			FileOutputStream os=new FileOutputStream(f);
		ObjectOutputStream ob=new ObjectOutputStream(os);
		
		ob.writeObject(s);
		ob.writeObject(s1);
		ob.writeObject(s2);
		ob.close();
		os.close();
		System.out.println("process completed..");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	   
	   

}
