// https://leetcode.com/problems/task-scheduler/

package week2;

import java.util.Arrays;

public class Task {
    
        public int leastInterval(char[] tasks, int n) {
        
            if(n == 0) {
                return tasks.length;
            }

            int[] freq = new int[26];
            for (char c : tasks) {
                freq[c - 'A']++;
            }
            Arrays.sort(freq);

            int max = (freq[25] - 1) * (n + 1);
            for ( int i = 0; i < 26; i++ ) {
                if (freq[i] - freq[25] == 0) {
                    max++;
                }
            }
            return Math.max(max,tasks.length);
        }
        
}
    
    

