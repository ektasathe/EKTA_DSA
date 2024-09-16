CASE 1 : SUPPOSE MID IS AT INDEX 4  || if (mid < end && arr[mid] > arr[mid + 1])
  0  1  2  3  4  5  6  7  8
[ 5, 6, 7, 8, 9, 1, 2, 3, 4 ]
  S           M  M+1       E

CASE 2 : SUPPOSE MID IS AT INDEX 5  ||  if (mid > start && arr[mid] < arr[mid - 1]
  0  1  2  3  4  5  6  7  8
[ 5, 6, 7, 8, 9, 1, 2, 3, 4 ]
  S          M-1 M        E

CASE 3 : EXCLUED CASE THAT MID IS AT INDEX 4 OR 5 CAUSE ALREADY COVERED ABOVE , 
  || if (arr[mid] <= arr[start])  || NOW WE WANT PIVOT SO EXCLUDE LEFT SIDE AS LARGEST ELEMENT WILL LIE BETWEEN  ARR[START] AND ARR[MID-1]
  0  1  2  3  4  5  6  7  8
[ 5, 6, 7, 8, 9, 1, 2, 3, 4 ]
  S                 M     E

CASE 4 : EXCLUED CASE THAT MID IS AT INDEX 4 OR 5 CAUSE ALREADY COVERED ABOVE 
  || arr[mid] >= arr[end] || WE WANT PIVOT SO EXCLUDE LEFT SIDE AS LARGEST ELEMENT WILL LIE BETWEEN ARR[MID+1] AND ARR[END]
  0  1  2  3  4  5  6  7  8
[ 5, 6, 7, 8, 9, 1, 2, 3, 4 ]
  S     M                 E
  

/ WHEN YOU USE STATIC INSIDE A CLASS THEN ALL THE ELEMENTS THAT ARE DECLARES IN IT SHOULD BE USED INSIDE THAT BLOCK ITSELF /
  
import java.util.*;
class BinarySearch {
  
    public static void main(String args[]) 
  {
    int arr[] = { 3,4,8,9,1,2,3};
    int n = arr.length;
    //int K = 4;
     System.out.println(findpivotindex(arr));
  }
  
 // int binarySearch(int arr[]) { #if yo write this then you need to create object of the function so use static
  static int findpivotindex(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
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
}


==================

  METHORD 2 
  HOW TO USE FUNCTION OBJECTS


  
import java.util.*;
class BinarySearch {
  
    public static void main(String args[]) 
  {
    BinarySearch ob = new BinarySearch(); //creation of function object
    int arr[] = { 3,4,8,9,1,2 };
    int n = arr.length;
    //int K = 4;
    int result = ob.findpivotindex(arr); //at last only array of ingle digit would be present that would be returned  and that would contain only pivot index
    if (result == -1)
      System.out.println("Not found");
    else
      System.out.println("Element found at index " + result); 
  
  }
  
       int binarySearch(int arr[]) { #if yo write this then you need to create object of the function so use static

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
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
}
