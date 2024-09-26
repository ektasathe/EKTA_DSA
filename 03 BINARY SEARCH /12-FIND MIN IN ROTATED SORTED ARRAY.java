https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/submissions/1392767873/
CASE 1 : WHEN ARRAY IS SORTED / JUST COMPARE (START MID AND END) | DONOT COMPARE (MID WITH MID-1 NAD MID+1) AS IT WILL GIVE ARRAY INDEX OUT OF BOUND
[11, 12, 13, 15, 17, 18, 19]  || op = 11
 S            M           E
CASE 1.1 : WHEN ARRAY HAS ONLY ONE ELEMENT
[11]   || op =11
S=M=E

CASE 2 : 
[15, 17, 18, 19, 11, 12, 13]  || op = 11
 S           M   M+1      E

CASE 3 :
[15, 17, 18, 19, 11, 12, 13]  || op = 11
 S           M-1  M       E

CASE 4 :
[15, 17, 18, 19, 11, 12, 13]  || op = 11
 S                    M   E

CASE 5 :
[15, 17, 18, 19, 11, 12, 13]  || op = 11
 S        M               E
  
class Solution {
    public int findMin(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start <= end)
        {
              int mid = start + (end - start) / 2;
            // 5 cases over here
          //case 1 : if array is sorted array then start index sould be the smallest element
          // case 1.1 is covered here as = sign is there
            if((arr[start] <= arr[mid] && arr[mid] <= arr[end]) )
            {
                return(arr[start]);
            }
          //case 2 :mid index should be smaller than end  and if arr[mid] > arr[mid+1]
            if (mid < end && arr[mid] > arr[mid + 1]) {  
                return arr[mid + 1];
            }
          //case 3 : mid index should be greater than start and arr[mid] < arr[mid-1]
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            }
          //case 4 :arr[mid] <=arr[start]
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
          //case 5 : arrarr[mid] >= arr;end]
            } 
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
