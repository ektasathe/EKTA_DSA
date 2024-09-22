https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
https://leetcode.com/problems/find-peak-element/description/
You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
Return the index of the peak element.
Your task is to solve it in O(log(n)) time complexity.
  
Time complexity: O(logn) : Since we're using binary search, we halve the search space at each step, leading to logarithmic time complexity.
Space complexity: O(1)  : The algorithm uses a constant amount of extra space.
-----------------------------------------------------
Input: nums = [1,2,3,1]  Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
-----------------------------------------------------
arr  [1,2,3,5,6,4,3,2]
                m      => we ae at desc part we want greatest element so right side is not required (end = mid)
arr  [1,2,3,5,6,4,3,2]
          m           => we are asec part , we want greatst elemet so left side is not required (start = mid+1)
  
//assumed here array is always ascending first and descending later
  class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1 ;
        while(start < end)
        {
            int mid = start + (end-start)/2;
            //we are at decreasing part of array . discard right side
            //there could be possibility that arr[mid] could be largest
            if(arr[mid] > arr[mid+1]) 
            {
                end = mid;
            }
            //when we are in asec part of array , discard left side
            //as of now mid+1 is max element but there could be possibility  to find larger on right side
            else if(arr[mid] < arr[mid+1])
            {
                start = mid + 1;
            }
        }
        //loop break point -> when start and end both will be at same point
            return end ;
    }
}
===================================
 EKTA LOGIC :  below code for if we donot kow that first part is ascending or descending
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //here array is always ascending first and descending later
        int start = 0;
        int end = arr.length -1 ;
        if (start < end )
        {
        while(start < end)
        {
            int mid = start + (end-start)/2;
            //we are at decreasing part of array . discard right side
            //there could be possibility that arr[mid] could be largest
            if(arr[mid] > arr[mid+1]) 
            {
                end = mid;
            }
            //when we are in asec part of array , discard left side
            //as of now mid+1 is max element but there could be possibility  to find larger on right side
            else if(arr[mid] < arr[mid+1])
            {
                start = mid + 1;
            }
        }
        //loop break point -> when start and end both will be at same point
            return end ;
        }
        else
        {
            while(start > end)
        {
            int mid = start + (end-start)/2;
            //we are at decreasing part of array . discard right side
            //there could be possibility that arr[mid] could be largest
            if(arr[mid] > arr[mid+1]) 
            {
                end = mid + 1;;
            }
            //when we are in asec part of array , discard left side
            //as of now mid+1 is max element but there could be possibility  to find larger on right side
            else if(arr[mid] < arr[mid+1])
            {
                start = mid;
            }
        }
        //loop break point -> when start and end both will be at same point
            return end ;
        }
    }
}
===================================
 KUNAL LOGIC :  below code for if we donot kow that first part is ascending or descending

  package com.kunal;

public class SearchInMountain {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/find-in-mountain-array/
    int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return orderAgnosticBS(arr, target, peak+1, arr.length - 1);
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
