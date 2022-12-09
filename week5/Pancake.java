package week5;

import java.util.ArrayList;
import java.util.List;

public class Pancake {

    public static void main(String[] args) {
        int[] a = { 3, 2, 4, 1 };
        System.out.println(pancakeSort(a).toString());
    }

    public static List<Integer> pancakeSort(int[] arr) {

        List<Integer> result = new ArrayList<Integer>();
        int index = 0;
        int counter = 0;
        while (index != -1) {

            index = isSorted(arr.length - 1 - counter, arr);
            if (index == -1) {
                break;
            }
            result.add(index + 1);
            arr = flip(index, arr);
            result.add(arr.length - counter);
            arr = flip(arr.length - 1 - counter, arr);
            counter ++;
        }
        return result;

    }

    public static int[] flip(int to, int[] arr) {

        for (int i = 0; i <= to / 2; i++) {
            int save = arr[i];
            int y = to - i;
            arr[i] = arr[y];
            arr[y] = save;
        }
        return arr;

    }

    public static int isSorted(int to, int[] arr) {

        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                isSorted = false;
            }
        }

        if (!isSorted) {
            int max = arr[0];
            int index = 0;
            for (int i = 0; i <= to; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    index = i;
                }
            }
            return index;
        } else {
            return -1;
        }
    }

}
