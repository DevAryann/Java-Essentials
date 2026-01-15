package Arrays;

public class twoDarrayEx {

    public static void main(String[] args) {


        char[][] telephone = {{'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'},};

        for (char[] tel : telephone ){
            for (char ch : tel){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}