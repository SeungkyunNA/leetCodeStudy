package week8;

public class findDiff {

    public static void main(String[] args) {
        System.out.println(findTheDifference("a" , "aa"));
    }
    
    public static char findTheDifference(String s, String t) {

        char c = 0;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        for(int i = 0; i < sArr.length; i++){
            c += tArr[i];
            c -= sArr[i];
        }
        c += tArr[tArr.length-1];
        
        return c;
    }
}
