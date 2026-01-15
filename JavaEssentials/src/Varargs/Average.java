package Varargs;

public class Average {

    public static void main(String[] args) {

        System.out.println(avg(1,2,3,4,5.5));

    }

    static double avg(double ... integers){

        double sum = 0 ;

        for (double integer : integers){

            sum += integer ;

        }
        return sum/integers.length;

    }
}
