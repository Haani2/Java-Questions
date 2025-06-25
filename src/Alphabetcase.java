import java.util.Scanner;

public class Alphabetcase {
    public  static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        char ch = scan.next().trim().charAt(0);
        if(ch >= 'A' && ch<= 'Z'){ // use single quote for characters
            System.out.println("Uppercase");
        }
        else {
            System.out.println("Lowercase");
        }

    }
}
