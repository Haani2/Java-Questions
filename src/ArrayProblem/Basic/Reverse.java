package ArrayProblem.Basic;

import java.lang.reflect.Array;
import java.util.Arrays;

//reverse without extra ArrayProblem.Basic.array
public class Reverse {
    public static void main(String[] args) {
        int[] arr = {2,3,2,4,3,2,4};
        int i = 0;
        int j = arr.length-1;
        int temp=0;
        while (i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
