package lesson7.Socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Encryption extends ReadFileHandler {

    public Encryption(String fileName) {
        super(fileName);
    }

    public void EncrypFile() {
        Encryption encryption = new Encryption(super.getFilename());
        String outputFile = "encrypted.txt"; // Change this to your output file name
        String inputFile = "filedina.txt";
        int shift = 3; // Change this to the desired shift value
        
        encryption.encryptFile(inputFile, outputFile, shift);
        System.out.println("File encrypted successfully.");
    }

    public void encryptFile(String inputFile, String outputFile, int shift) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            int character;
            while ((character = reader.read()) != -1) {
                if (Character.isLetter(character)) {
                    char encryptedChar = encryptChar((char) character, shift);
                    writer.write(encryptedChar);
                } else {
                    writer.write(character);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static char encryptChar(char ch, int shift) {
        if (Character.isUpperCase(ch)) {
            return (char) ('A' + (ch - 'A' + shift) % 26);
        } else if (Character.isLowerCase(ch)) {
            return (char) ('a' + (ch - 'a' + shift) % 26);
        } else {
            return ch;
        }
    }
}

