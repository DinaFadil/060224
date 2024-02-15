package lesson5.Files;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class SerializationExample {
    public static void main(String[] args) {
      Employee employee = new Employee();
      employee.name = "John Doe";
      employee.age = 32;
      employee.address = "1234 Main Street";
  
      try (FileOutputStream fos = new FileOutputStream("employee.ser");
           ObjectOutputStream oos = new ObjectOutputStream(fos)) {
        oos.writeObject(employee);
        System.out.println("Employee object serialized successfully");
        oos.close();
        fos.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
  
class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;
    String address;
  } 
  