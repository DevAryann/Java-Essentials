package FileReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Java-Essentials\\JavaEssentials\\src\\FileWriter\\text.txt" ;
        String file;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){  // Checks for the path
            System.out.println("File found");
            while ((file = reader.readLine()) != null){                          // Loop to store content of txt line by line ("!= null" breaks the loop in end)
                System.out.println(file);
            }
        } catch (Exception e) {
            System.out.println("file not found");
        }
    }
}
