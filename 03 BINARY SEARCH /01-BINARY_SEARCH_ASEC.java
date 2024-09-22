BINARY SEARCH -> ONLY IN SORTED ARRAY => IN ASCENDING OR DESC ORDER
TIME COMPLEXITY -> O(LOG N) => N + N/2 + N/4 + N/8 + N/16 . . . N/2 POW K
                            1 = N/(2^K)
                            2^K = N  -TAKE LOG ON BOTH SIDE
                            LOG(2^K) = LOG N
                            K (LOG 2) = LOG N
                            K = LOG N

================================================
ASSUME ARRAY IS SORTED IN ASCENDING ORDER -> ALGO OF BINARY SEARCH
STEP 1 :  START INDEX = 0 ; 
          END INDEX = ARR.LENGTH -1;
STEP 2 :  WHILE START <= END
STEP 3 :  IF (TARGET < MID ELEMENT) THEN END = MID-1;
STEP 4 :  IF (TARGET > MID ELEMENT) THEN START = MID+1;
STEP 4 :  IF(TARGET == MID ELEMENT) THEN RETURN 1 OE INDEX, ELSE RETURN -1

=============================================
https://www.geeksforgeeks.org/problems/who-will-win-1587115621/1

Given an array arr[] sorted in ascending order of size N and an integer K. Check if K is present in the array or not.

N = 7, target = 6
arr[] = {-6,-2,1,2,3,4,6}
Output: 1 => AS 6 IS PRESENT IN ARRAY

class Solution {
    static int searchInSorted(int arr[], int N, int target) {
        int start = 0;
        int end = N-1;
        while(start <= end)
        {
          // int mid = ( start + end ) / 2     ====> here are chances that mid value can exceed the max integet input digits
        //  max val int cans tore = 10^9 . if start and end values are very high then then mid value can overflow , to avoid it use below
            int mid = start + (end - start)/2 ;   ===> so use this 
            if( target < arr[mid])
            {
                end = mid -1 ;
            }
            else if( target > arr[mid] )
            {
                start = mid + 1;
            }
            else 
            {
                return 1 ;
            }
        }
        return -1 ;
    }
}


==================
in functions format

class BinarySearch {
  int binarySearch(int arr[], int K) {
        int start =0;
        int end = arr.length -1;
           while(start <= end)
        {
          // int mid = ( start + end ) / 2     ====> here are chances that mid value can exceed the max integet input digits
            int mid = start + (end - start)/2 ;   //===> so use this 
            if( K < arr[mid])
            {
                end = mid -1 ;
            }
            else if( K > arr[mid] )
            {
                start = mid + 1;
            }
            else 
            {
                return 1 ;
            }
        }
        return -1 ;
  }
  
    public static void main(String args[]) {
    BinarySearch ob = new BinarySearch();
    int arr[] = { 3, 4, 5, 6, 7, 8, 9 };
    int n = arr.length;
    int K = 4;
    int result = ob.binarySearch(arr,K);
    if (result == -1)
      System.out.println("Not found");
    else
      System.out.println("Element found at index " + result);
  }
}
