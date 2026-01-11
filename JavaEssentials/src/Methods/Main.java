package Methods;

public class Main {
        static void greet() {
            System.out.println("Hello from a method!");
        }

        static int add(int a, int b) {
            return a + b;
        }

        public static void main(String[] args) {
            greet();
            int result = add(5, 3);
            System.out.println("Sum = " + result);
        }
    }


