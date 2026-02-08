package ArrayProblem.Basic;

import java.util.Arrays;

public class TotalsumZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(TotalEle(6)));
    }
    static int[] TotalEle(int n){
        int[] arr= new int[n];
        if(n%2==0) {
            for(int i=1; i<n-1; i++) {
                arr[i*2] = i;
                arr[i+1] = -i;
            }
    }
        return arr;
    }
}
