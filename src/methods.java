import java.util.Scanner;

public class methods {
    public static void main(String[] args) {

       int total_amount = price();
        System.out.println("your total is :" + total_amount );

    }
    static int price( ){
        Scanner item = new Scanner(System.in);
        int a = item.nextInt();
        int b = item.nextInt();
        int total = a  +  b;
        return total;
        }

}
