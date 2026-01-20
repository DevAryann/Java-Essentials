package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the size : ");
        int length = sc.nextInt();
        sc.nextLine();



        for (int i = 0 ; i < length ; i++){
            System.out.print("Enter the food : ");
            String food = sc.next();
            foods.add(food);
        }
        System.out.println(foods);


sc.close();
    }
}
