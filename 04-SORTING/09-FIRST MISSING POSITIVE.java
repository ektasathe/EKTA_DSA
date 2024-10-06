https://leetcode.com/problems/first-missing-positive/description/ | HARD AMAZON
this is hard mentioned cause in question there is not mentioned that nos are from 1 to N . 
But from time and space complexity mentioned we eed to get that cyclic sort will be used

Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

STEP 0: IGNORE ALL THE -VE NO AND NO >ARR.LENGTH
STEP 1: HERE IT IS ASKED TO GET THE FIRST POSITIVE NO , SO START CHECKING FROM 1
STEP 2: START CHECKING FROM 1 . IF 1 IS NOT PRESENT IN ARRAY THEN RETURN 1
STEP 3: IF 1 IS PRESENT IN ARRAR , THEN SERACH FOR 2 .....SO ON 
-----------------------------------------------------------------------------
eg 1
[-1, 4, 3, 1] -> [1, -1, 3, 4]   -> //after cyclic sort it will be like this

  0  1  2  3       0  1  2  3
[-1, 4, 3, 1] -> [-1, 1, 3, 4 ]
     -     -

  0  1  2  3         0   1  2  3
[-1, 1, 3, 4 ]  - > [1, -1, 3, 4]    //here 1 is not at correct index so swap it
     -                   -
-----------------------------------------------------------------------------
eg 2:
[7,8,9,11,12] | OP = 1
-----------------------------------------------------------------------------
eg 3:
[1,2,0,3] | OP =4
-----------------------------------------------------------------------------

class Solution {
    public int firstMissingPositive(int[] arr) {
        int i=0;
        while(i<arr.length)
        {
            int correctindex = arr[i] -1 ;
            if(arr[i] < 0 && arr[i] < arr.length && arr[i] != arr[correctindex]) //STEP 0 AND 1
            {
                swap(arr, i, correctindex);
            }
            else
            {
                i++;
            }
        }
        // STEP 2 . START CHECKING FROM 1 . IF 1 IS NOT PRESENT IN ARRAY THEN RETURN 1 ie. INDEX+1
        for(int j=0; j < arr.length ; j++)
        {
            if(arr[j]-1 != j)
            {
                return j+1;
            }     
        }
        //EG2 : STEP 3 . IF MISSING NO FOUND MEANS MISSING ELEMENT IS AT LAST INDEX . 
        return(arr.length);
    }
    static void swap(int arr[], int element , int correctindex)
    {
        int temp = arr[element];
        arr[element] = arr[correctindex];
        arr[correctindex] = temp;
    }
}