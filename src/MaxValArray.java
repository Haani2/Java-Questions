public class MaxValArray {
    public static void main(String[] args) {
        int[] arr ={12,20,5,8,11,84,100};
        System.out.println(max(arr));
        System.out.println(max(arr, 2,4));
    }
// here we find the maximum  value in ArrayProblem.Basic.array
     static int max(int[] arr) {
        int maxVal = 0;// let max val is 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // solution if you want to find the maximum between the range

    static int max(int[] arr, int start ,int end){
        int maxVal = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i]> maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

}
