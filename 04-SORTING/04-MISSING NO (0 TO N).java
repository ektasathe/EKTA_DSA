https://leetcode.com/problems/missing-number/
TIME : O(N).   SPACE : O(1)

arr = {5,2,0,1,4} , arr.length = 4

STEP 1 : IF ARR[i] >= ARR.LENGTH , THEN IGNORE THE NO AND MODE FORWARD 
         CHECK FOR ONLY THOSE NO THAT ARE SMALLER THAN ARR.LENGTH
       
          0 1 2 3 4
STEP 2 : {0,1,2,4,5} 
CHECK IN SORTED ARRAY, IF ELEMENT AT jth INDEX != j , IF SO RETURN j

          0,1,2,3,4 
STEP 3 : {0,1,2,3,4}  MISSING NO IS 5 HERE
ELSE FOR 0 TO N , IF IF ELEMENT AT jth INDEX == j, THEN RETURN N

---------------------------------------------------------------------------------

class Solution {
    public int missingNumber(int[] arr) {
        int i=0;
        while(i<arr.length)
        {
            int correctindex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctindex])
            {
                swap(arr, i, correctindex);
            }
            else
            {
                i++;
            }
        }
        // STEP 2 . SEARCH FOR MISSING NO
        for(int j=0; j < arr.length ; j++)
        {
            if(arr[j] != j)
            {
                return j;
            }     
        }
        //STEP 3 . IF MISSING NO FOUND MEANS MISSING ELEMENT IS AT LAST INDEX . 
        return(arr.length);
    }
    static void swap(int arr[], int element , int correctindex)
    {
        int temp = arr[element];
        arr[element] = arr[correctindex];
        arr[correctindex] = temp;
    }
}