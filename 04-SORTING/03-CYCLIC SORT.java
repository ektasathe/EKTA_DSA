WHENEVER YOU GET THE NUMBERS ARE FROM 1 TO N - USE CYCLIC SORT
TIME COMPLEXITY = O(N)

CYCLIC SORT  -> COMPARE THE 0TH INDEX VALUE WITH THE 0TH INDEX 
SO 0TH INDEX WILL HAVE INDEX+1= 0+1 =1 AS VALUE
SO 1ST INDEX WILL HAVE INDEX+1= 1+1 =2 AS VALUE
SO 2ND INDEX WILL HAVE INDEX+1= 2+1 =3 AS VALUE
SO 3RD INDEX WILL HAVE INDEX+1= 3+1 =4 AS VALUE
SO 4TH INDEX WILL HAVE INDEX+1= 4+1 =5 AS VALUE
STEP 1 : 
CHECK IF ELEMENT AT i INDEX IS AT CORRECT POSITION 
IF NOT THEN PLACE THE ELEMENT AT CORRCET INDEX
ELSE CONTINUE WITH i+1 INDEX

                  ONE           TWO            THREE          FOUR
0,1,2,3,4  ->  0,1,2,3,4  ->  0,1,2,3,4  ->  0,1,2,3,4  ->  0,1,2,3,4  -> INDEX
3,5,2,1,4  ->  2,5,3,1,4  ->  5,2,3,1,4  ->  4,2,3,1,5  ->  1,2,3,4,5  -> ARRAY
-   -          - -            -       -      -     -        - - - - -
                                                            1,2,3,4,5
ABOVE EG IS WORST CASE SCENARIO 
-> NO OF SWAPS = 4 =  ARR.LENGTH-1 = N-1
-> NO OD COMPARISIONS AT END = 5 = ARR.LENGTH = N
TOTAL SWAPS AND COMPARISIONS = (N-1)+N = 2N-1 = O(N) //AS WE IGNORE CONSTANTS

  STEP 1 : CHECK ITS CORRECT INDEX
  STEP 2 : SWAP WITH CORRECT INDEX
  STEP 3 : MOVE THE ith INDEX

  IF ARRAY IS FROM 1 TO N

  public class CyclicSort{
  public static void main(String args[])
  {
    int arr[] = {5,3,2,1,4};
    swap(arr);
    System.out.println(Arrays.toString(arr));
  }
  static void cyclicsort(int arr[])
  {
    while(i < arr.length)
    {
      int correctindex = arr[i] - 1;
      if(arr[i]  != correctindex)
      {
        swap(arr, arr[i], correctindex);}
      else
      {
        i++;}
    }
  }
  static void swap(int arr[]; int element, int correctindex)
  {
    int temp = arr[element];
    arr[element]=arr[correctindex];
    arr[correctindex] = temp;
  }
}













  

