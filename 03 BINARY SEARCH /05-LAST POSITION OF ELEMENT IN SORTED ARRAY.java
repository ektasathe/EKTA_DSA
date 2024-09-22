
INP = [2,5,6,6,6,8,9] ; OP = 4

[2, 5, 6, 6, 6, 8, 9]
 s     m  m+1      e

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
                start = mid + 1;
               
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