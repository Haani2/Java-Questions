public class reverse {
    // reverse the given number
    public static void main(String[] args) {
        int n = 12345;
        int rev = 0;
        while (n>0){
            rev = (rev*10)+ n%10;// idr rev * 10 plus 12345 divided 10 which reminder is 5 , then rev == 5 fir 5*10 = 50+4 = 54......
                 n = n/10; // n/=10;

        }

        System.out.println("reverse is " + rev);
    }
}

