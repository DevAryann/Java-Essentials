package Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name : ");

        String name = scanner.next();

        System.out.print("What is your age : ");

        int age = scanner.nextInt();

        System.out.print("whats your gpa : ");

        double gpa = scanner.nextDouble();

        System.out.println("Your name is " + name);

        System.out.println("And your age is " + age);

        System.out.println("Your gpa is " + gpa);


        scanner.close();

    }
}

