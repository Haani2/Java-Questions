package ArrayProblem.Basic;

import java.util.Arrays;

public class two_sum  {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            // Add one to current digit
            digits[i]++;

            // If it’s less than 10, no carry, return result
            if (digits[i] < 10) {
                return digits; // return the ArrayProblem.Basic.array and break the loop
            }

            // Otherwise, set current to 0 and continue (carry = 1)
            digits[i] = 0;
        }

        // If we reach here, it means all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] arr={2,3,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}


