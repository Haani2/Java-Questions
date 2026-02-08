package DoAndTry;

import java.util.Arrays;

public class AddToArray {
    public static void main(String[] args) {
        int[] array ={1,0,2,1};
       int add=  ArraySum(array,20);
        System.out.println(add);
    }
  static public int ArraySum(int[] arr,int k){

        int sum =0; ;
        for (int i = 0; i < arr.length; i++) {
            sum =sum+arr[i]; //this is how you can add the numbers in ArrayProblem.Basic.array
        }
        return sum + k;
    }
}
