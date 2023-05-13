package advance.dev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(": ");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                String city = parts[2];
                double salary = Double.parseDouble(parts[3].replace(".", ""));
                employees.add(new Employee(name, age, city, salary));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("Danh sách nhân viên:");
        for (Employee e : employees) {
            System.out.println(e);
        }
        
        Collections.sort(employees);
        
        System.out.println("\nDanh sách nhân viên theo lương tăng dần:");
        for (Employee e : employees) {
            System.out.println(e);
        }
        
        Employee highestPaid = employees.get(0);
        for (Employee e : employees) {
            if (e.getSalary() > highestPaid.getSalary()) {
                highestPaid = e;
            }
        }
        
        System.out.println("\nNhân viên có lương cao nhất: " + highestPaid);
    }
}

