https://leetcode.com/problems/count-the-digits-that-divide-a-number/submissions/1397496376/

Input: num = 7 | Output: 1
Explanation: 7 divides itself, hence the answer is 1.


Input: num = 121 | Output: 2
Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.


Input: num = 1248 | Output: 4
Explanation: 1248 is divisible by all of its digits, hence the answer is 4.


class Solution {
    public int countDigits(int num) {
        int count = 0;
        int res = num;
        int r = 0;
        while(res>0)
        {
            r = res%10;
            if(num%r==0)
            {
                count++;
            }
            res = res/10;
        }
        return count;
    }
}
