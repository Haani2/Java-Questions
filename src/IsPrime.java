import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        // this program return boolean values true and false
        Scanner  input = new Scanner(System.in);
     int n = input.nextInt();
        System.out.println(prime(n));
    }
static boolean prime(int n){
        if(n<=1){
            return false;
        }
        int c =2;
        while (c*c<=n){
            if (n%c==0){
                return false;
            }
            c++;
        }
    if (c *c > n ){
        return true;
    }
    return false;
    }
}


