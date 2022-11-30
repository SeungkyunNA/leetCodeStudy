/* https://leetcode.com/problems/valid-palindrome-ii */

package week4;

class validPalindromeTwo {

    public static void main(String[] args) {
        System.out.println(validPalindrome("cbbcc"));

    }

    public static boolean validPalindrome(String s) {
        int down = 0;
        int up = s.length() - 1;

        while(down < up) {
            if(s.charAt(down) != s.charAt(up)) {
                int tempDown = down + 1;
                int tempUP = up;
                boolean checker = true;
                
                while (tempDown < tempUP && checker) {
                    if(s.charAt(tempDown) != s.charAt(tempUP)) {
                        checker = false;
                    }
                    tempDown ++;
                    tempUP --;
                }

                if(checker) {
                    return true; // 만약 아래쪽 문자를 건너뛰었더니 Palindrome 일때.
                }

                tempDown = down;
                tempUP = up - 1;
                
                while (tempDown < tempUP) {
                    if(s.charAt(tempDown) != s.charAt(tempUP)) {
                        return false; // 만약 위쪽 문자를 건너뛰었어도 Palindrome이 아닐때.
                    }
                    tempDown ++;
                    tempUP --;
                }
                return true; // 만약 위쪽 문자를 건너뛰었더니 Palindrome 일때.
            }
            down ++;
            up --;
        }
        return true; // 만약 s가 그냥 그 자체로 Palindrome 일때.
    }



}