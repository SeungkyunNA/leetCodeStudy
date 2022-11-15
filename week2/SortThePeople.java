// https://leetcode.com/problems/sort-the-people/

package week2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SortThePeople {

    public String[] sortPeople(String[] names, int[] heights) {
        
        HashMap<Integer , String> map = new HashMap<Integer, String>(names.length);
         
         for(int i = 0 ; i < names.length ; i++){
             
             map.put(heights[i], names[i] );
         }
         List<Integer> heightList = new ArrayList<>();
         
         for(int h = 0 ; h < heights.length ; h++){
             heightList.add(heights[h]);
         }
 
         Collections.sort(heightList);
         
         String[] sortedNames = new String[names.length];
         
         for(int i = 0 ; i < heights.length ; i++){
             
             sortedNames[names.length - i - 1] = map.get(heightList.get(i));
         }
         
         return sortedNames;
         
     }
    
}
