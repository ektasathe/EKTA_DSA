TIME COMPLEXITY = O(N^2). IN WORST CASE

STABLE SORTING ALGO = ORDER SHOULD BE SAME WHEN VALUE IS SAME

EG :              10,   20,   30,   10,   20.  
                  red.  blue. red. blue.  red

AFTER SORTING.    10,   10,   20,   20,   30.   red 10 comes first and then blue 10
                   red. blue. blue. red. blue

ARRAY = 36, 19, 29, 12 , 5

ROUND 1 :              
36  19  29  12  5

19  36  29  12  5
------
19  29  36  12  5
    ------
19  29  12  36  5
        -------
 19  29  12  5  36
             ------

ROUND 2 :
19  29  12  5  36 
-------
19  12  29  5  36 
    -------
19  12  5  29  36 
        -----

ROUND 3 :
19  12  5  29  36 
-------
12  19  5  29  36 
    ------
12  5  19  29  36    

ROUND 4 : 
5  12  19  29  36  

==============================
class bubble 
{
    Public Static vid main(String args[])
    {
        int arr[] = {36,19,29,12,5}
        int temp;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length -i ; j++)
            {
                if (arr[j]> arr[j+1]
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i=0; <arr.length ; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
}
