ASSUME ARRAY IS SORTED IN DESCENDING ORDER -> ALGO OF BINARY SEARCH
STEP 1 :  START INDEX = 0 ; 
          END INDEX = ARR.LENGTH -1;
STEP 2 :  WHILE START >= END
STEP 3 :  IF (TARGET < MID ELEMENT) THEN END = MID-1;
STEP 4 :  IF (TARGET > MID ELEMENT) THEN START = MID+1;
STEP 4 :  IF(TARGET == MID ELEMENT) THEN RETURN 1 OE INDEX, ELSE RETURN -1

---------------------
n an array arr[] sorted in ascending order of size N and an integer K. Check if K is present in the array or not.

N = 7, target = 6
arr[] = {16,13,11,6,4,2}
Output: 3 => AS 6 IS PRESENT IN ARRAY

class Solution {
    static int searchInSorted(int arr[], int N, int target) {
        int start = 0;
        int end = N-1;
        while(start >= end)
        {
          // int mid = ( start + end ) / 2     ====> here are chances that mid value can exceed the max integet input digits
        //  max val int cans tore = 10^9 . if start and end values are very high then then mid value can overflow , to avoid it use below
            int mid = start + (end - start)/2 ;   ===> so use this 
            if 
            {
                return mid ;//return index of element if element is found
            }
            if( target < arr[mid])
            {
                start = mid + 1 ;
            }
            else //if( target > arr[mid] )
            {
                end = mid - 1;
            }
        }
        return -1 ;
    }
}
