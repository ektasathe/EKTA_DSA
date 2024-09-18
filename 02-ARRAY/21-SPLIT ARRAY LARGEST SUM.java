https://leetcode.com/problems/split-array-largest-sum/
EXAMPLE
Input: nums = [7,2,5,10,8], k = 2  |  Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
---------------------------------------------------------------------------------------------------------------

  
class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0 ;//initial start we want max element of entire array
        int end = 0 ;// we want total sum of each element
        //At start store the max element of array //At end strore the sum of entire array
        for (int i=0; i<nums.length ; i++)
        {
            start = Math.max(start,nums[i]);
            end = end + nums[i];
        }
        while(start < end ) //here <= will not come because we want cause we want loop to break when start = end 
        {
            int mid = start + (end - start)/2;
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum+num <= mid)
                {
                    sum = sum + num;          
                }
                else{
                    sum = num ;
                    pieces ++; 
                }
            }  
            if(pieces <= k) { //search in left side of mid element
                end = mid;       
            }
            else {//searcing in right side of mid element 
                 start = mid+1;               
            }
        }
        return end;   
    }
}
