//https://leetcode.com/problems/n-th-tribonacci-number/
package week2;

public class Tribonacci {

    public int tribonacci(int n) {
        
        int[] nth = {0,1,1};
        
        for ( int i = 3; i <= n; i++ ){
            nth[i%3] = nth[0] + nth[1] + nth[2];
        }
                
        return nth[n%3];
    }
}
