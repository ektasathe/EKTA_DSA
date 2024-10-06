https://leetcode.com/problems/find-the-duplicate-number/description/

Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and using only constant extra space.

Input: nums = [1,3,4,2,2] | Output: 2
---------------------------------------------------------------------------------------------
STEP 1 :
 0. 1  2  3  4
[1, 3, 4, 2, 2] //1 is at correct index so i++
 -

 0. 1  2  3  4       0  1  2  3  4
[1, 3, 4, 2, 2] ->  [1, 4, 3, 2, 2] //3 was not at correct index so keep it at index 2
    -  -                -  - 

 0  1  2  3  4        0  1  2  3  4
[1, 4, 3, 2, 2]  ->  [1, 2, 3, 4, 2]  //4 was not at correct index so keep it at index 3 
    -     -              -     -

 0  1  2  3  4       0  1  2  3  4  
[1, 2, 3, 4, 2]  -> [1, 2, 3, 4, 2]  //2, 3, 4 , 2 all are at correct index
    -  -  -  -
--------------------------------------------------------------------------------------------- 
STEP 2 :
if(arr[j]-1 != j) the return arr[j]

---------------------------------------------------------------------------------------------

class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int correctindex = nums[i]-1;
            if(nums[i] != nums[correctindex])
            {
                swap(nums, i, correctindex);
            }
            else
            {
                i++;
            }
        }
        for (int j=0; j<nums.length ; j++)
        {
            if(nums[j]-1 != j){
                return nums[j];
            }
        }
        return -1;
    }
    static void swap(int nums[], int i, int correctindex)
    {
        int temp = nums[correctindex];
        nums[correctindex] = nums[i];
        nums[i] = temp;
    }
}