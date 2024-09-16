https://leetcode.com/problems/search-in-rotated-sorted-array/

EG - Input: nums = [4,5,6,7,0,1,2], target = 0 | Output: 4
  
STEP 1:find pivot
STEP 2: NORMAL BINARY SEARCH
STEP 3: IF INDEX OF PIVOT == TARGET THEN RETURN IT ELSE SEARCH IN LEFT AND RIGHT SORTED ARRAY


class Solution {
    //FIND PIVOT
        int findpivot(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
          //case 1 :mid index should be smaller than end  and if arr[mid] > arr[mid+1]
            if (mid < end && arr[mid] > arr[mid + 1]) {  
                return mid;
            }
          //case 2 : mid index should be greater than start and arr[mid] < arr[mid-1]
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
          //case 3 :arr[mid] <=arr[start]
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
          //case 4 : arrarr[mid] >= arr;end]
            } else {
                start = mid + 1;
            }
        }
        return -1;
  }
//NORMAL BINARY SEARCH 
       int binarySearch(int[] arr, int target, int start, int end) 
       {
        while(start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
//if pivot is target then return its index else searh in left and right part of pivot
        static int search (int[] arr, int target)
        {
            int pivot = findpivot(arr);
            //CASE 1 : IF PIVOT == -1 | IF WE DONOT FIND THE PIVOT  MEANS ARRAY IS NOT ROTATED, THEN DO NORMAL SEARCH IN ENTIRE ARRAY
            if(pivot == -1)
            {
               return binarySearch(arr, target, 0, arr.length -1) ;
            }
            //CASE 2 : IF PIVOT IS TARGET THEN RETURN PIVOT
            if(arr[pivot] ==target)
            {
               return pivot;
            }
            //CASE 3 : IF PIVOT IS FOUND THEN WE HAVE 2 SORTED ARRAYS , SEARCH IN EACH SORTED ARRAY | SEARCH IN LEFT SORTED ARRAY
            if(target >= arr[0])
            {
               return binarySearch(arr, target, 0, pivot-1);
            }
            //CASE 4  : SEARCH IN RIGHT SORTED ARRAY
            return binarySearch(arr, target, pivot+1, arr.length-1);
        }
} 

