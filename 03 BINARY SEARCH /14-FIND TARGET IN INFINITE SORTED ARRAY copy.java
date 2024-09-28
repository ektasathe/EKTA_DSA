https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

arr = {2,3,4,5,10,13,15,17,19,22,24,25,28,.......}
target = 15

//REVERSE OF BINARY SEARCH
//START WITH BOX/SIZE OF 2
//DOUBLE THE SIZE OF BOX EACH TIME, ACCORDINGLY UPDATE START AND END INDX

{2, 3, 4, 5, 10, 13, 15, 17, 19, 22, 24, 25, 28, 30, 33, 35, 36 ) //size of box =2
 S  E
 M

{2, 3, 4, 5, 10, 13, 15, 17, 19, 22, 24, 25, 28, 30, 33, 35, 36 ) //size of box = 4
       NS M       E
       E+1

{2, 3, 4, 5, 10, 13, 15, 17, 19, 22, 24, 25, 28, 30, 33, 35, 36 ) //size of box =8
                     NS           M               E
                     E+1

  public class InfiniteArray {
    public static void main(String[] args) {
      int arr[] = {2,3,4,5,10,13,15,17,19,22,24,25,28};
      int target = 15;
      System.out.pintln(ans(arr,target));
    }
  Static int ans(int arr[], int target)
  {
    int start = 0;
    int end = 1;
    // condition for the target to lie in the range
    while(target > arr[end])
    {
      start = end;
      end = 2*end;
      //int newstart = end+1;
      //end = end + (end - start + 1) * 2; //2*SIZE OF OLD ARRAY LENGTH //updated end would be [end+double size of box]
      //start = newstart;     
    }
    return binsearch(arr, target, start, end);
  }
    Static int binsearch(int arr[], int target, int start, int end)
      {
        while (start <= end)
          {
            int mid =  start + (end-start)/2;
            if(target < arr[mid])
            {
              end = mid - 1;
            }
            else if( target > arr[mid])
            {
              start = mid + 1;
            }
            else
            {
              return arr[mid];
            }
          }
      return -1;
      }
      
  
}
