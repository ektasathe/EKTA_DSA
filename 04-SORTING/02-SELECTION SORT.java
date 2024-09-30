TIME COMP = O(N^2)

TAKE FIRST ELEMENT AND FROM REST OF THE ARRAY FIND THE MIN ELEMENT 
AND IF FIRST IS SMALLER THAN MI THEN SWAP

==========================================

5. 3. 9. 1. 2. 
--       --
1. 3. 9. 5. 2. 
   --       --
1. 2. 9. 5. 3. 
      --    --
1. 2. 3. 5. 9.  -> SORTED
         -- --
      
===========================================

class bubble 
{
    Public Static vid main(String args[])
    {
        int arr[] = {36,19,29,12,5}
        int temp = 0;
        int min = 0;
        for(int i=0; i<arr.length; i++)
        {
            min = i;
            for (int j=i+1; j<arr.length; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] =  temp
        }
        for (int i=0; <arr.length ; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
}