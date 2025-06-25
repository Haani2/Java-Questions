public class StarPattern {
    public static void main(String[] args) {


//        for (int i = 1; i <=4 ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        x
//        xx
//        xxx
//        xxxx
//        }

//               for (int i = 1; i <=4 ; i++) // Reverse of above star pattern
//               {
//            for (int j = 3; j >=i ; j--) {
//                System.out.print("*");
//           }
//            System.out.println();
//        }


        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print(" x");
            }
            System.out.println();

            //OUTPUT:-
//               x
//              x x
//             x x x
//            x x x x

        }
    }
}
