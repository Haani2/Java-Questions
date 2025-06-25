import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "mango" -> System.out.print("king of fruits");
            case "apple" -> System.out.print("keeps doctor away");
            case "kiwi" -> System.out.print("doctor advise you naahhh ");
            case "papaya" -> System.out.print("ifykyk");
            default -> System.out.println("khaao khaao ");


        }
    }
}