package FileWriter;

import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Java-Essentials\\JavaEssentials\\src\\FileWriter\\text.txt";
        String textContent = "Hi i am Aryan\nnice to meet you";

        try (FileWriter file = new FileWriter(path)) {
            file.write(textContent);
            System.out.println("File Created successfully");
        } catch (Exception e) {
            System.out.println("Could not create file");

        }
    }
}
