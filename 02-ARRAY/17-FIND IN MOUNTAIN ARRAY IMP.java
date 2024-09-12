https://leetcode.com/problems/find-in-mountain-array/description/


Example 1:
Input: array = [1,2,3,4,5,3,1], target = 3
Output: 2
Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.

Example 2:
Input: array = [0,1,2,4,2,1], target = 3
Output: -1
Explanation: 3 does not exist in the array, so we return -1.

Example 3:
Input: array = [0,2,4,2,1], target = 1
Output: 4 


        //STEP 1 : FIND  PEAK ELEMENT 
        //STEP 2 : SEARCH TARGET IN ASCENDING PART
        //SETP 3 : IF TARGET NOT FOIND IN ASCENDING PART THEN SEARCH IN DESCENDING PART

 
class Solution {
    public int findInMountainArray(int target, arr[] mountainArr) {
        int start = 0; 
        int end = mountainArr.length -1 ;
        while (start < end)
        {
            int mid = start + (end - start )/2 ;
            if (mountainArr[mid] > mountainArr[mid+1])
            {
                end = mid;
            }
            else if (mountainArr[mid] < mountainArr[mid+1])
            {
                start = mid +1;
            }
        }
            //at the end our end and start both would point at pivot iw max element
        peak = srart ;
        if(target < peak)
        {
            int newstart1 = 0; 
            int newend1 = peak ;
            while(newstart1 < newend1)
            {
                int mid1 = newstart1 +(newend1 - newstart1 )/2;
                if(mountainArr[mid1] < target)
                {
                    newstart1 = mid1;
                }
                else if(mountainArr[mid1] > target)
                {
                    newend1 = mid1 ;
                }
                return mid1 ;
            }
        }
        else if(target > peak)
        {
            int newstart2 = 0; 
            int newend2 = peak ;
            while(newstart2 < newend2)
            {
                int mid2 = newstart2 +(newend2 - newstart2 )/2;
                if(mountainArr[mid2] > target)
                {
                    newstart2 = mid2;
                }
                else if(mountainArr[mid2] < target)
                {
                    newend2 = mid2 ;
                }
                return mid2 ;
            }
        }
        return -1;
    }
}
