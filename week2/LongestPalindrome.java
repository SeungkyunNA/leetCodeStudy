package week2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class LongestPalindrome {

public static int longestPalindrome(String s) {
    
    HashMap<Character , Integer> map = new HashMap<Character , Integer>(); // Integer for frequency check
    char[] list = s.toCharArray();
    
    for ( int i = 0; i < list.length; i++ ) {
        if (map.getOrDefault(list[i], 0) == 0) {
            map.put(list[i], 1);
        }
        else {
            map.replace(list[i], map.get(list[i]) + 1);
        }
    }

    Collection<Integer> freq = map.values();
    Iterator<Integer> it = freq.iterator();

    int evenLength = 0;
    int oddLength = 0;
    while (it.hasNext()) {
        int temp = (Integer) it.next();
        if (temp % 2 == 0) {
            evenLength += temp;
        }
        else {
            oddLength += temp - 1;
        }
    }

    if (evenLength != list.length) {
        oddLength++;
    }

    return evenLength + oddLength;
}

}
