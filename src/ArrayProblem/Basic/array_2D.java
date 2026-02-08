package ArrayProblem.Basic;

import java.util.Arrays;

public class array_2D {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int[][] multiArray = new int[3][3];
        //input

//        for (int row = 0; row < multiArray.length; row++) {
//            System.out.print("enter the number in row ");
//            for (int col = 0; col < 3; col++) {
//                multiArray[row][col] = in.nextInt();
//            }
//        }
//
//        //Output
//        for (int row = 0; row < multiArray.length; row++) {
//
//            System.out.print(Arrays.toString(multiArray[row])); // simple way to show ArrayProblem.Basic.array
//
//
//            for (int col = 0; col < 3; col++) {
//                System.out.print(multiArray[row][col] + " ");
//            }
//                 System.out.println();
//          }

        //way to print  2D Array
//        int[][] arr ={
//                {1,2,3},
//                {2,4,5},
//                {6,7,8},
//        };
//        System.out.println(Arrays.deepToString(arr));
//
        // use of enhance for loop
        int[][] arr ={
               {1,2,3},
                {2,4,5},
                {6,7,8},
        };
        for(int[] elem : arr){
            System.out.println(Arrays.toString(elem));

        }
    }
}