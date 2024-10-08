https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1

//this que can also be done using sliding window and tree set

Given a sorted array arr[] of size n without duplicates, and given a value x. Floor of x is defined as the largest element k in arr[] such that k is smaller than or equal to x. Find the index of k(0-based indexing).

Input: n = 7, x = 0 arr[] = {1,2,8,10,11,12,19}
Output: -1
Explanation: No element less than 0 is found. So output is "-1".

Input: n = 7, x = 5 arr[] = {1,2,8,10,11,12,19}
Output: 1
Explanation: Largest Number less than 5 is 2 (i.e k = 2), whose index is 1(0-based indexing).

//here we are returning the index

//when you want to return the ceiling no

--edge case to be added
if target < arr[0]
{
return -1;
============================

class Solution {
    static int findFloor(long arr[], int n, long x) {
        //edge case if target or x is smaller than arr[0] then return -1
        int start =0;
        int end = n-1;
        while(start <= end)
        {
            int mid = start + (end-start) / 2;
            if(x < arr[mid])
            {
                end = mid -1;
            }
            else if ( x> arr[mid])
            {
                start = mid +1;
            }
            else if(x == arr[mid])
            {
                return mid;
            }
        }
        return end;
    }
}

==================


