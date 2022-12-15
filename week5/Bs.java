// https://leetcode.com/problems/binary-search
package week5;

public class Bs {
    public static void main(String[] args) {
        int[] a = {954, 955};
        System.out.println(search(a, 212));

    }

    public static int search(int[] nums, int target) {

        int max = nums.length;
        int min = 0;
        int index = nums.length / 2;
        int logNcounter = nums.length * 2;

        while (true) {
            logNcounter = logNcounter / 2;
            if (nums[index] == target) {
                return index;
            }

            if (nums[index] < target) {
                min = index;
                index += (max - index) / 2;
            } else {
                max = index;
                index = (min + index) / 2;
            }
            if (logNcounter == 0) {
                return -1;
            }

        }
    }
}
