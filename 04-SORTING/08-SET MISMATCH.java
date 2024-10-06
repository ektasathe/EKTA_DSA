https://leetcode.com/problems/set-mismatch/

find the duplicate no and its index

Find the number that occurs twice and the number that is missing and return them in the form of an array.

Input: nums = [1,2,2,4] | Output: [2,3] //duplicate = 2 and missing no correct index = 3

class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[] = new int[2]; //take this array to store  the dduplicate element and the missing element
        int i=0;
        while(i< nums.length)
        {
            int correctindex = nums[i]-1;
            if(nums[i] != nums[correctindex])
            {
                swap(nums, i, correctindex);
            }
            else{
                i++;
            }
        }
        //for loop to duplicate and its missing element
        for(int j=0; j<nums.length; j++)
        {
            if(nums[j]-1 != j)
            {
                ans[0] = nums[j]; //no that occours twice
                ans[1] = j+1; //no that is missing
            }
        }
        return ans;
    }
    static void swap(int nums[], int i, int correctindex)
    {
        int temp = nums[correctindex];
        nums[correctindex] = nums[i];
        nums[i] = temp;
    }
}

