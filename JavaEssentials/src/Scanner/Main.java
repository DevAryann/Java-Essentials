package Scanner;
import java.util.Scanner;                // Importing utils (Scanner class )

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);              // creating a new Scanner object

        System.out.print("What is your name : ");

        String name = scanner.next();                          // Take the input as a String

        System.out.print("What is your age : ");

        int age = scanner.nextInt();                           // Take the input as a integer

        System.out.print("whats your gpa : ");

        double gpa = scanner.nextDouble();                     // Take the input as a Double

        System.out.println("Your name is " + name);

        System.out.println("And your age is " + age);

        System.out.println("Your gpa is " + gpa);


        scanner.close();                                        // Closing the Scanner

    }
}

