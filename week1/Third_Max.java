// https://leetcode.com/problems/third-maximum-number/submissions/
/**
 * Runtime: 6 ms, faster than 66.42% of Java online submissions for Third Maximum Number.
 * Memory Usage: 43.7 MB, less than 54.51% of Java online submissions for Third Maximum Number.
 */


package week1;


public class Third_Max {

    public static void main(String[] args) {
        int[] arr = { 1, 5, 2 };

        System.out.println(thirdMax(arr));

    }

    public static int thirdMax(int[] nums) {

        if (nums.length == 2) {
            if (nums[0] >= nums[1]) {
                return nums[0];
            } else {
                return nums[1];
            }

        }

        if (nums.length == 1) {
            return nums[0];
        }

        int merkerF;
        int merkerS;
        int merkerT;
        int save;

        if (nums[0] > nums[1]) {
            merkerF = nums[0];
            merkerT = nums[1];
        } else {
            merkerF = nums[1];
            merkerT = nums[0];
        }

        if (nums[2] >= merkerF) {
            save = merkerF;
            merkerF = nums[2];
            merkerS = save;
        } else if (nums[2] < merkerF && nums[2] >= merkerT) {
            merkerS = nums[2];
        } else {
            merkerS = merkerT;
            merkerT = nums[2];
        }

        for (int i = 2; i < nums.length; i++) {

            if (nums[i] > merkerF) {
                save = merkerS;
                merkerS = merkerF;
                merkerT = save;
                merkerF = nums[i];
            } else if (nums[i] == merkerF) {
            } else if (nums[i] > merkerS && nums[i] < merkerF) {
                save = merkerS;
                merkerS = nums[i];
                merkerT = save;
            } else if (nums[i] == merkerS) {
            } else if (nums[i] > merkerT && nums[i] < merkerS) {
                merkerT = nums[i];
            } else {
                if (merkerS == merkerT) {
                    merkerT = nums[i];
                }
            }
        }

        if (merkerS == merkerT || merkerF == merkerS) {
            return merkerF;
        } else {
            return merkerT;
        }

    }

}
