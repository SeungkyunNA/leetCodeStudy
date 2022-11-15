// https://leetcode.com/problems/reverse-words-in-a-string-iii/submissions/

package week1;

public class Reverse_Words {

    public static void main(String[] args) {

        int s = reverseWords("Let's take LeetCode contest").compareTo("s'teL ekat edoCteeL tsetnoc");
        if (s == 0) {
            System.out.println(s);
        } else {
            System.out.println("incorrect : " + reverseWords("Let's take LeetCode contest"));
        }

    }

    public static String reverseWords(String s) {


        char[] StringToChar = s.toCharArray();
        char[] reverse = new char[StringToChar.length];
        int blankCount = 0;

        for (int i = 0; i < StringToChar.length; i++) {

            reverse[reverse.length - 1 - i] = StringToChar[i];

            if (StringToChar[i] == ' ') {
                blankCount++;
            }
        }

        String[] words = new String[blankCount + 1];
        String save = "";
        int j = blankCount;

        for (int i = 0; i < StringToChar.length; i++) {
            if (reverse[i] == ' ') {
                words[j] = save;
                j--;
                save = "";
            } else if (i == StringToChar.length - 1) {
                save += reverse[i];
                words[j] = save;
            } else {
                save += reverse[i];
            }
        }

        String result = "";
        for (int i = 0; i < words.length; i++) {
            result += words[i];
            if (i != words.length - 1) {
                result += " ";
            }
        }

        return result;
    }

}
