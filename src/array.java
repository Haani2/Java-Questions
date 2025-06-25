import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

      //  Creating array directly
        int[] arr = {25, 20, 210, 25};
        System.out.print(arr[0]);// by index number

      //  Defining the size of the array
        String[] arr2 = new String[5];
        arr2[0] = "haani";
        arr2[1] = "honey";
        arr2[2] = "hani";

        System.out.print(Arrays.toString(arr2));// Arrays.toString(variable_name) will print the whole array in String format

      //  input using for loop
        int[] array = new int[5];
//   .length see the size of array .
        for (int i = 0; i < array.length; i++) // in this for loop we enter the value of the array
        {
            array[i] = in.nextInt();
        }

      //  for each loop
        for (int j : array) {
            System.out.print(j + " ");

        }
    }
}