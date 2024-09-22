package FileHanling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) throws IOException {
      
        FileWriter f = new FileWriter("D:\\backup\\emp.txt");
        f.write("E001, John, 45000\n");
        f.write("E002, Alice, 55000\n");
        f.write("E003, Bob, 60000\n");
        f.write("E004, Diana, 52000\n");
        f.close();

      
        File f1 = new File("D:\\backup\\emp.txt");
        Scanner sc = new Scanner(f1);

        int maxSalary = 0;
        String employeeWithMaxSalary = "";
        int totalSalary = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] parts = line.split(", ");
            
            String empId = parts[0];
            String empName = parts[1];
            int salary = Integer.parseInt(parts[2]);

          

          
            if (salary > maxSalary) {
                maxSalary = salary;
                employeeWithMaxSalary = empName;
            }
        }
        sc.close();

       
        System.out.println("Employee with the highest salary: " + employeeWithMaxSalary + " (" + maxSalary + ")");
        System.out.println("Total salary paid to all employees: " + totalSalary);
    }
}
