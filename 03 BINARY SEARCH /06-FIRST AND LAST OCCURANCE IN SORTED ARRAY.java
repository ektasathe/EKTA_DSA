https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
--------
Example :
Input: nums = [5,7,7,8,8,10], target = 8  | Output: [3,4]
Input: nums = [5,7,7,8,8,10], target = 6  |  Output: [-1,-1]
-------- (logN) + 0(logN) =  20(logN) = 0(logN) => here constants are ignored

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = result(nums, target, true); //here we are finding first occurance
        ans[1] = result(nums, target, false); //here we are not finding first occourance so false
        return ans ;
    }
    static int result(int[] nums,int target,boolean isStartIndex)
    {
        int start =0;
        int end = nums.length-1;
        int ans =-1;
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if (target == nums[mid])
            {
                ans = mid ;
                if(isStartIndex)
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid +1;
                }
            }
            else if(target < nums[mid])
            {
                end = mid -1;
            }
            else  //(target > nums[mid])
            {
                start = mid+1;
            }
        }
        return ans;
    } 

}


