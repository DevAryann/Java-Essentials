package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numbers :");
            int num = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Its not a number");
        }

scanner.close();
    }
}
