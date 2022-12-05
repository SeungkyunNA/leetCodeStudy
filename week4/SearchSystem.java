/* https://leetcode.com/problems/search-suggestions-system  */
package week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchSystem {

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> result = new ArrayList();
        Arrays.sort(products);

        for (int i = 1; i <= searchWord.length(); i++) {
            result.add(sliceStrings(searchWord.substring(0, i), products));
        }

        return result;
    }

    public List<String> sliceStrings(String target, String[] products) {
        List<String> result = new ArrayList();
        int counter = 0;

        for (String p : products) {
            if (p.length() >= target.length() && p.substring(0, target.length()).equals(target) && counter < 3) {
                result.add(p);
                counter++;
            }
        }
        return result;
    }
}
