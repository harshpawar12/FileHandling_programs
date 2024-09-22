package FileHanling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class seriallise implements Serializable {
	
	private int id;
	private String name;
	private String password;
	private String phone;
	public seriallise(int id, String name, String password, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public String getPhone() {
		return phone;
	}
	@Override
	public String toString() {
		return "seriallise [id=" + id + ", name=" + name + ", password=" + password + ", phone=" + phone + "]";
	}
	
	public static void main(String[] args) {
		
		seriallise s=new seriallise(1,"Harsh","hp12345","7219388085");
		
		File f=new File("D:\\serializable.txt");
		
		try {
			FileOutputStream fs=new FileOutputStream(f);
			ObjectOutputStream ob=new ObjectOutputStream(fs);
			ob.writeObject(s);
			fs.close();
			ob.close();
			System.out.println("Mission SuccessFully...");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
