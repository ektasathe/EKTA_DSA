
INP = [2,5,6,6,6,8,8,9] ; Target = 6 OP = 2 //as first position of 6 is 2 

[2, 5, 6, 6, 6, 8, 9]
 s    m-1 m        e

class Solution {
    public int[] searchRange(int[] nums, int target) {
      
        int start =0;
        int end = nums.length-1;
        int ans = -1;
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if (target == nums[mid])
            {
                ans = mid ;
                end = mid - 1;
               
            }
            else if(target < nums[mid])
            {
                end = mid -1;
            }
            else if (target > nums[mid])
            {
                start = mid+1;
            }
            
        }
        return ans;
    }
}
