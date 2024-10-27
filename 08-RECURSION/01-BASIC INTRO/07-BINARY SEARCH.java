HOW TO USE BELOW  

*** ARGUEMENTS : 
WHATEVER WE PUT IN ARGUEMENTS, IT WILL GO IN NEXT FUNCTION CALL . IT WOULD BE SPECIFIC TO THAT FUNCTION CALL .

*** RETURN TYPE : 
IF WE ARE USING STATIC INT IN FUNCTION THEN THERE SHOULD HAVE RETURN STATEMENT IN BODY

*** BODY OF FUNCTION : 
THE VARIABLES THAT WE DONOT NEED IN FUTURE FUNCTION CALLS, PUT IT IN THE BODY 
========================================================================================================
RECURSION IN BINARY SEARCH

 -------------------------------------------------------------------
| F(N) = O(1) + F(N/2)  = CONSTANT TIME + DIVIDE THE ARR INTO HALF) |
 -------------------------------------------------------------------
   O(1) --> COMPARISION
   O(N/1) --> REDUCE THE SEARCH SPACE BY FACTOR


class recursionsearch {
    public static void main(String[] args) {
        int arr[] = {2,4,6,7,8,9,11,13,15};
        int t = 13 ;
        System.out.println(binsearch(arr ,t,0,arr.length-1));
    }
    static int binsearch(int[] arr, int t, int s, int e)
    {
        //here the base condition would be when the loop breaks
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m]==t){
            return arr[m];
        }
        if(t<m){
            //e=m-1;
           return binsearch(arr, t, s, m-1);
        }
        else {
           return binsearch(arr, t, m+1, e);
        }
    }
}










 
