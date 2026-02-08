package ArrayProblem.Basic;

public class Second_Largest {
    public static void main(String[] args) {
        int[] arr ={70,112,30,40,60,50};

       int c = Second_element(arr);
        System.out.println(c);

    }
    static int Second_element (int[] arr){
        int max=0;
        int max2=0;

        if (arr[0]>arr[1]) {
            max=arr[0];
            max2 = arr[1];
        }
        else {
            max2 = arr[0];
            max = arr[1];
        }


        for (int i = 2; i < arr.length; i++) {
            if (arr[i]>max) {
                max2 = max;
                max = arr[i];
            }
            else if (arr[i]>max2) {
                max2=arr[i];
            }
        }

    return max2;
    }
}
