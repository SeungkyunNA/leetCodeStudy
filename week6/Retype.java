// https://codingcompetitions.withgoogle.com/kickstart/round/000000000019ff49/000000000043adc7
package week6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Retype {

    public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCase = Integer.parseInt(br.readLine());

    for (int i = 0 ; i < testCase ; i ++) {
        String input = br.readLine();
        String[] strNKS = input.split(" ");

        int n = Integer.parseInt(strNKS[0]);
        int k = Integer.parseInt(strNKS[1]);
        int s = Integer.parseInt(strNKS[2]);
        
        int result = k;
        if(s > k-s) {
            result += (k-s) + (n-s);
        } else {
            result += n;
        }

        System.out.println("Case #" + (i + 1) + ": " + result);
    }
    }
}
