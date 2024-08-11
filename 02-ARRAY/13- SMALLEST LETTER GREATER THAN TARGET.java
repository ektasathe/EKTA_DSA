ADDITIONALMENTS OF BINARY SEARCH

eg1:Input: letters = ["c","f","j"], target = "a" | Output: "c"
eg2:Input: letters = ["c","f","j"], target = "c" | Output: "f" //IF ELEMTN IS FOUND , THEN RETURN NEXT INDEX ELEMENT
eg3:Input: letters = ["x","x","y","y"], target = "z" | Output: "x" //if target is greater than the largest element , then return the start index element arr[0]

https://leetcode.com/problems/find-smallest-letter-greater-than-target/
You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
array wraph is possible here

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1 ;
        while(start <= end )
        {
            int mid = start + (end-start)/2;
            if(target < letters[mid])
            {
                end = mid -1 ;
            }
            else 
            {
                start = mid + 1;
            }
        }
        return letters[start%letters.length]; //eg3 : at last when while loop will break
                                              //"start val = arr.length" so [start%letters.length] will give us 0
    
    }
}
