package leetcode;

public class RemoveDuplicatesFromArray {


    public static void main(String[] args) {

        int[] nums = {1,2,2,33,4,33,1,1}; // Input array



        int k = removeDuplicates(nums);// Calls your implementation

        System.out.println(k);

    }
        public static int removeDuplicates ( int[] nums){
            if (nums == null || nums.length == 0) {
                return 0;
            }

            int k = nums.length;
            int m = 0;

            for (int i = 1; i < k; i++) {
                if (nums[i] != nums[m]) {
                    nums[m + 1] = nums[i];
                    m++;
                }
            }
            return m + 1;
        }

    }

