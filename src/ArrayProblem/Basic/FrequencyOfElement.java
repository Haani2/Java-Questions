package ArrayProblem.Basic;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr = {2,3,2,4,3,2,4,5};
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==visited){
                continue;
            }
            int count = 1;
            for(int j=i+1; j < arr.length; j++) {
               if ((arr[i] == arr[j])){
                   count++;
                   arr[j] = visited; // this visited mark the gone value to -1
               }
            }
           System.out.println(arr[i] + "->" + count);
//            if(count>1){
//                System.out.println(arr[i] + "->" + count);
//            }

//            if(count==1){
//                System.out.println(arr[i]);
//            }
        }

    }

}
