public class MinValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 44, -4, 5};
        System.out.println(min(arr));

    }
    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
return min;

    }
}