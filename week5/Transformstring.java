// https://codingcompetitions.withgoogle.com/kickstart/round/0000000000435914/00000000008da461
package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Transformstring {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(br.readLine());

        for (int testcase = 0; testcase < limit; testcase++) {
            String t = br.readLine();
            String f = br.readLine();
            int sum = 0;

            for (int ti = 0; ti < t.length(); ti++) {
                char target = t.charAt(ti);
                int tempSum = 27;
                for (int fi = 0; fi < f.length(); fi++) {
                    char current = f.charAt(fi);
                    int up = Math.abs(target - current);
                    int down = 26 - up;

                    if (up > down) {
                        if (tempSum > down) {
                            tempSum = down;
                        }

                    } else {
                        if (tempSum > up) {
                            tempSum = up;
                        }
                    }
                }
                sum += tempSum;
            }
            System.out.println("Case #" + (testcase + 1) + ": " + sum);
            sum = 0;
        }

    }
}
