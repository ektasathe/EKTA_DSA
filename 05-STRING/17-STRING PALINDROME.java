//not an optimal one about memory
class Solution {
    int isPalindrome(String S) {
        // code here
        //METHORD 1: NAVIE
        String s1 = "";
        for (int i=S.length()-1; i>=0; i--)
        {
            s1 = s1 + S.charAt(i);
        }
        if (S.equals(s1))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}

===================================
//better solution

package com.kunal;

public class Palin {
    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
