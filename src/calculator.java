import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.print("enter the operator");
            char op = in.next().trim().charAt(0);// trim for remove the extra whitespace between them
            if (op == '+' || op == '-' || op == '%' || op == '/') {
                System.out.println("enter the  two numbers");
                int num1 = in.nextInt();// get input form the terminal
                int num2 = in.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }

                }
            } else if (op =='x' || op =='X') {
                break;

            }
            else {
                System.out.println("  Invalid operation");
            }
            System.out.println("The answer is :" + ans);
        }

    }
}