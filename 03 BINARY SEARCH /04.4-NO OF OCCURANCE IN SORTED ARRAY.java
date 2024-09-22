https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1

Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.

N = 7(size of array) 
Arr[] = {1, 1, 2, 2, 2, 2, 3} | X = 2 (no to find)
Output: 4 //2 occours four times in array .

arr={1, 3 ,5, 7, 9, 9} | X=7. //EDGE CASE {3,3}
OP : 1 //as 7 occours only once in array

arr = {5} | X = 5. //{0,0}
op:1

class Solution {
    int count(int[] nums, int n, int target) {
        // code here
        int[] ans = {-1,-1};
        ans[0] = result(nums, target, true); //here we are finding first occurance
        ans[1] = result(nums, target, false); //here we are not finding first occourance so false
        if(ans[0] == ans[1] && ans[0] != -1 && ans[1] != -1) //if element occours only once 
        {
            return 1; //as element is present only one time
        }
        else if(ans[1] - ans[0] == 0){ //when element is not present
            return 0;
        }
        else{
        return (ans[1] - ans[0] + 1)  ;
        }
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
            else 
            {
                start = mid+1;
            }
        }
        return ans;
    }
}