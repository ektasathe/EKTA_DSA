
https://leetcode.com/problems/search-insert-position/description/
---------------------------------------------
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

Input: nums = [1,3,5,6], target = 5 | Output: 2
Input: nums = [1,3,5,6], target = 7 | Output: 4

Input: nums = [1,3,5,6], target = 2 | Output: 1

[1,3,5,6]  (while s <= e)
 s   m e

[3,5,6]    (while s <= e)
 s,m,e

[3,5,6]     (while s <= e)
   s
   m
   e

[3,5,6]     while condition is voilated here => so return start index
 e,m,s
=====================O(log n)============

//////here we are returning the index
///when we need to return the ceiling no
--- edge case --- arr={1,3,5,6} target = 8  // for 8 there will be no ceiling 
if(target > arr[length-1]
{
  return -1;
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        //assumend that sorted array is in asec order

        int start = 0; 
        int end = nums.length -1;

        //edge case  -> if target is greater than the nums[nums.length-1] return nums.lenght
        while(start <= end)
        {
           int mid = start + (end - start) / 2;
           if (target < nums[mid])
            {
                end = mid -1 ;
            }
            else if(target > nums[mid])
            {
                start = mid + 1 ;
            }
            else if(target == nums[mid])
            {
                return mid;
            }
        }
        return start ;
    }
}

==================== O(n) not optimal one ================

class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length ; i++)
        {
            while(target <= nums[i])
            {
                return i;
            }
        }
        return nums.length;
    }
}
