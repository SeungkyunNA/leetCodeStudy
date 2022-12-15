package week5;

import java.util.Arrays;

class Subsequence {
    public static void main(String[] args) {
        int[] nums = {4,5,2,1};
        int[] queries = {3,10,21};
        System.out.println(Arrays.toString(answerQueries(nums, queries)));
    }

    public static int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int sum = 0;
        int[] sumOfsub = new int[nums.length];
        int[] result = new int[queries.length];

        for(int n = 0; n < nums.length; n++) {
        sum += nums[n];
        sumOfsub[n] = sum; 
        }

        for (int q = 0; q < queries.length; q++) {
            for (int s = 0; s < sumOfsub.length; s++) {

                if (queries[q] == sumOfsub[s]) {
                    result[q] = s+1;
                    break;
                } else if (queries[q] < sumOfsub[s]) {
                    result[q] = s;
                    break;
                }

                if (s == sumOfsub.length - 1) {
                    result[q] = sumOfsub.length;
                }
            }
        }
        return result;
        
    }
}