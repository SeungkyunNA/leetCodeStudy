package week5;

import java.util.*;

public class Candy {
    public static void main(String[] args) {
        int[] a = new int[]{1,1};
        int[] b = new int[]{2,2};
        String result = Arrays.toString(fairCandySwap(a,b));
        System.out.println(result);
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Set<Integer> bBox = new HashSet<>();
        int aTotal = 0;
        int bTotal = 0;
        
        for (int i = 0; i < Math.max(aliceSizes.length, bobSizes.length) ; i++) {
            if(i < aliceSizes.length && i < bobSizes.length) {
                aTotal += aliceSizes[i];
                bTotal += bobSizes[i];
                bBox.add(bobSizes[i]);
            }

            if(i >= aliceSizes.length) {
                bTotal += bobSizes[i];
                bBox.add(bobSizes[i]);
            }
            if(i >= bobSizes.length) {
                aTotal += aliceSizes[i];
            }
        }

        int total = (aTotal + bTotal) / 2;
        for (int candy: aliceSizes) {
            int a = aTotal - candy;
            int b = total - a;
            if(bBox.contains(b)) {
                return new int[]{candy,b};
            }
        }
        return new int[]{0,0};
    }
}
