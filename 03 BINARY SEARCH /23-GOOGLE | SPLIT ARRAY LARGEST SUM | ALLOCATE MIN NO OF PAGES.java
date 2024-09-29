https://leetcode.com/problems/split-array-largest-sum/


EXAMPLE
Input: nums = [7,2,5,10,8], k = 2  |  Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
---------------------------------------------------------------------------------------------------------------
[7, 2, 5, 10, 8], k = 2  
 7|25              max=>25 ]
    9|23           max=>23 ]  
       14|18       max=>18 ]  => min is 18
          24|8     max=>24 ]
--------------------------------------------------------------------------------------------------------------- 
start = 10 -> max of [7, 2, 5, 10, 8]
end = 32 -> sum of all elements of [7, 2, 5, 10, 8]

[start,end]      mid = 21 = 42/2  
  [10,32]

[7, 2, 5], [8, 10]   -----> pieces =2  (pieces<=K) ie (2<=2)  --> end = mid || we need more elements , search at ledt side so
  14<21     18<21
----------------------------------------------------------------------------------------------------------------
  [start,end]     mid = 15 = 32/2
   [10,21]
  
 [7, 2, 5]  [8]   [10]  ---> pieces=3 (pieces>2) --> start = mid+1 
  14<15    8<15  10<15

----------------------------------------------------------------------------------------------------------------
  [start,end]     mid = 18 = 37/2
   [16,21]

  [7, 2, 5]   [8, 10]  -----> 2 pieces ---> (pieces<=2) ---> end = mid
   14<18       18<=18
----------------------------------------------------------------------------------------------------------------
  [start,end]     mid = 17 = 34/2
    [16,18]

  [7, 2, 5]    [8]    [10]  ----> 3 pieces --> (pieces>2) ---> start = mid+1
     14<17     8<17   10<17 
----------------------------------------------------------------------------------------------------------------
 [start,end]      mid  = 18 = 36/2 
  [17,18]
 [7, 2, 5]    [8]    [10]  ----> 3 pieces --> (pieces>2) ---> start = mid+1
   14<18     8<18   10<18
----------------------------------------------------------------------------------------------------------------
  
[start,end]   ----> point when loop breaks and this would be our ans
  [18,18]
  
----------------------------------------------------------------------------------------------------------------
  
  
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
