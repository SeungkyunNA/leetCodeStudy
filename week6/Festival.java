//https://codingcompetitions.withgoogle.com/kickstart/round/0000000000435bae/0000000000887dba

// Sample, TestSet 1 clear, TestSet2 : Runtime Error
package week6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Festival {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testCase; tc++) {

            String temp = br.readLine();
            String[] dnk = temp.split(" ");
            int d = Integer.parseInt(dnk[0]);
            int n = Integer.parseInt(dnk[1]);
            int k = Integer.parseInt(dnk[2]);

            int[][] dArr = new int[d][n];

            for (int attract = 0; attract < n; attract++) {
                temp = br.readLine();
                String[] hse = temp.split(" ");
                int h = Integer.parseInt(hse[0]);
                int s = Integer.parseInt(hse[1]);
                int e = Integer.parseInt(hse[2]);

                for (int plan = s - 1; plan < e; plan++) {
                    dArr[plan][attract] = h;
                }
            }
            int result = 0;

            for (int day = 0; day < d; day++) {
                Arrays.sort(dArr[day]);
                int hSum = 0;
                for (int ki = n - 1; ki >= n - k; ki--) {
                    hSum += dArr[day][ki];
                }

                if (hSum > result) {
                    result = hSum;
                }
            }
            System.out.println("Case #" + (tc + 1) + ": " + result);

        }
    }

}
