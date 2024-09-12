// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class BinarySearch {
  
    public static void main(String args[]) 
  {
    BinarySearch ob = new BinarySearch();
    int arr[] = { 3,4,8,9,1,2 };
    int n = arr.length;
    int K = 4;
    int result = ob.binarySearch(arr); //at last only array of ingle digit would be present that would be returned  and that would contain only pivot index
    if (result == -1)
      System.out.println("Not found");
    else
      System.out.println("Element found at index " + result);
  }
  
  int binarySearch(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
  }
}
