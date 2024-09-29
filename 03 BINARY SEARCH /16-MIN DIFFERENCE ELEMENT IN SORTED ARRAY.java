//this que not found in net for practice

arr=[2,4,6,9,10,13]. x = 7  , return 1  
[2,      4,      6,     9,     10,     13]
|2-7| , |4-7|, |6-7|, |9-7|, |10-7| , |13-7|
[9 ,      3,     1,      2,     3,       6 ]

return 1 , as the min absolute difference of x with each element is 1 

CASE 1 : if x=7 , the x is already present in array then return 0 , as element of array -x =0
CASE 2 : x=7 , x is not present in array , then find the no between which the no is present 
        think like floor and ceiling ;you need to get that 2 nos in array between which x lies
         you will get those at the end when the loop breaks.
         




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
                return 0;
            }
        }
        int a = Math.abs(start-x);
        int b = Math.abs(end-x);
        if(a>b)
        {
            return b;
        }
        else
        {
            return a;
        }
    }
}

==================


