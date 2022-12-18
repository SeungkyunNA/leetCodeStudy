// https://codingcompetitions.withgoogle.com/kickstart/round/0000000000435bae/0000000000887c32
package week6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class TrashBins {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        List<Long> resultList = new ArrayList<>();

        for (int tc = 0; tc < testCase; tc++) {
            int streetLength = Integer.parseInt(br.readLine());
            String bins = br.readLine();

            int firstBin = 0;
            for (int i = 0; i < streetLength; i++) {
                if (bins.charAt(i) == '1') {
                    firstBin = i;
                    break;
                }
            }
            long firstNHauses = firstBin;
            firstNHauses = firstNHauses * (firstBin + 1);
            firstNHauses = firstNHauses/2;

            long result = 0L;
            for (int i = firstBin + 1; i < streetLength; i++) {

                if (bins.charAt(i) == '1') {
                    long dist = i - firstBin;
                    firstBin = i;

                    if (dist < 3) {
                        dist -= 1;
                    } else if (dist % 2 == 0) {
                        dist = (dist / 2);
                        dist = dist * dist;
                    } else {
                        dist++;
                        dist = (dist / 2);
                        dist = dist * dist - dist;
                    }

                    result += dist;

                }
            }

            long lastNHauses = 0L;
            lastNHauses = streetLength - 1 - firstBin;
            lastNHauses = (lastNHauses * (lastNHauses + 1)) / 2;

            result += firstNHauses + lastNHauses;
            resultList.add(result);
        }

        int tc = 1;
        for (long r : resultList) {
            System.out.println("Case #" + tc + ": " + r);
            tc++;
        }

    }

}
