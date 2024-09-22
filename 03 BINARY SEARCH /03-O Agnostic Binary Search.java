Order-Agnostic Binary Search - when we donot know if the sorted array is in asecending order or descending order
STEP 1 : FIND ARRAT IS IN ASEC ORDER OR DESC ORDER
STEP 2 : APPLI BINARY SEARCH FOR BOTH ASEC AND DESC ARRAY

https://www.geeksforgeeks.org/problems/binary-search-1587115620/1

Given a sorted array arr and an integer k, find the position(0-based indexing) at which k is present in the array using binary search.

Input: k = 4, arr= [11, 10, 7, 4, 2]  
Output: 3
Explanation: 4 appears at index 3.


class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int start = 0;
        int end = arr.length -1;  
        //searching for edge cases when array has ne element
        if(nums.length == 1 && target == nums[0])
        {
            return 0;
        }
        boolean isAsec = arr[start] < arr[end]; //if array is in asec order
        while(start <= end)
        {
            int mid = start + (end - start) / 2 ;
            
            if(arr[mid] == k) //if middle element is target ,common case for both asec and desc arr
            {
                return mid;
            }
            
            else if (isAsec) //if arr[start] < arr[end];
            {
                if(k<arr[mid])
                {
                    end = mid -1 ;
                }
                else if (k>arr[mid])
                {
                    start = mid + 1;
                }
            }
            else 
            {
                if(k>arr[mid])
                {
                    end = mid -1 ;
                }
                else if (k<arr[mid])
                {
                    start = mid + 1;
                } 
            }
            
        }
        return -1;
    }
}
