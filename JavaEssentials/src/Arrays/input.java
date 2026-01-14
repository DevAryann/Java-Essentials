package Arrays;

import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] Fruits = new String[3];

        for(int i = 0; i < Fruits.length ; i++ ){
            System.out.print("Enter the Fruit : ");
            Fruits[i] = scanner.next();


        }
        for(String fruits : Fruits){
            System.out.println(fruits);
        }

        scanner.close();


        }




    }

