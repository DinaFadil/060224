package lesson7.Socket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Assignmentfile {

    public static void main(String[] args) {
        String filename = "readfile.txt"; // Change this to your file name
        //readFile("readfile.txt");
        printFile("readfile.txt");

        try {
            int wordCount = countWords(filename);
            System.out.println("Number of words in the file: " + wordCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    public static int countWords(String filename) throws IOException {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split the line into words using whitespace as delimiter
                count += words.length;
                System.out.println(line);
            }
        }
        return count;
    }

    public static void readFile(String filename){
        Path filePath = Paths.get(filename);
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toString()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }catch(IOException e){
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    public static void printFile(String filename){
        try (BufferedReader reader = readFileBuffer(filename)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }catch(IOException e){
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    public static BufferedReader readFileBuffer(String filename){
        BufferedReader reader = null;
        Path filePath = Paths.get(filename);
        try {
            reader = new BufferedReader(new FileReader(filePath.toString()));
        }catch(IOException e){
            System.err.println("Error reading the file: " + e.getMessage());
        }
        return reader;
    }   
}




