package week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {

    public static void main(String[] args) {
        String[] a = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> r = groupAnagrams(a);
        for(List<String> l : r) {
            for(String s : l) {
            System.out.print(s);
            System.out.print("-");
            }
            System.out.println(" ");
        }

        
    }
    public static List<List<String>> groupAnagrams(String[] strs) {

        String[] sortedStrs = new String[strs.length];

        for (int i = 0; i < strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            sortedStrs[i] = Arrays.toString(temp);
        }

        List<List<String>> result = new ArrayList<List<String>>();
        String target;

         for (int marker = 0; marker < sortedStrs.length; marker++) {
            if(!sortedStrs[marker].equals("")){
                List<String> group = new ArrayList<String>();
                target = sortedStrs[marker];
                
                for (int i = 0; i < sortedStrs.length; i++) {
                    if(sortedStrs[i].equals(target)) {
                        sortedStrs[i] = "";
                        group.add(strs[i]);
                    }
                }
                result.add(group);
            }
        }
        return result;
    }
    
}
