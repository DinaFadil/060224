package lesson5.Files;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class DeserializationExample {
    public static void main(String[] args) {
      Employee employee = null;
  
      try (FileInputStream fis = new FileInputStream("employee.ser");
           ObjectInputStream ois = new ObjectInputStream(fis)) {
        employee = (Employee) ois.readObject();
        System.out.println("Employee object deserialized successfully");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Address: " + employee.address);
        ois.close();
        fis.close();
      } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
      }
    }
  }
  
