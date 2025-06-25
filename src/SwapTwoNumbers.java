
public class SwapTwoNumbers {

    public static void main(String[] args) {

        swap2(20, 23);
//        int a=20;
//        int b=10;
//        int temp ;
//        temp=b;
//        b=a;
//        a=temp;
//        System.out.println(a);
//        System.out.println(b);
    }
   static void swap2(int a, int b){
        a = a+b;
        b= a-b;
        a= a-b;
      System.out.println("a :"+a);
      System.out.println("b :" +b);
  }

}

