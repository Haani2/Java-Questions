package ArrayProblem.Basic;

class Solution {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,7};
       int c= searchInsert(arr,6);
        System.out.println(c);
    }
   static public int searchInsert(int[] nums, int target) {


            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    return i;
                }
                else if (target > nums[i] && target < nums[i+1]) {
                    return i+1;
                }
            }


        return nums.length;
    }
}