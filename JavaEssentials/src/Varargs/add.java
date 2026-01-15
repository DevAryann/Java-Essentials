package Varargs;

public class add {

    public static void main(String[] args) {
        System.out.println(Add(1, 2, 3));

    }

    static int Add(int... numbers) {           //    ellipsis

        int sum = 0;

        for (int number : numbers) {

            sum += number;


        }
        return sum;
    }

}
