
RECURIOUS RELATION = WHEN WE BREAK THE RECURSION IN FORMULAE

step 1 : BREAK ITO SMALLER PROBLEM
STEP 2 : BASE CONDITION IS ALWAYS REPRESENTED BY ANS WE ALREADY HAVE 
         EG IN THIS CASE WE HAVE BASE CONDITION
         FIBO(0) = 0 | FIBO(1) = 1

---POINT 1 : RECURSIVE FORMULAE -----
----------------------------------
| fibo(n) = fibo(n-1) + fibo(n-2) | -> this is called recursion relation
----------------------------------

---POINT 2 : RECURSIVE TREE -----
                                f(4)
                              /    \
                            /        \
                          f(3)   +    f(2)
                        /      \       / \
                      f(2)  +  f(1)  f(1)+f(0)
                     /  \
                  f(1) + f(0)
--------------------------------------------------------------------
         0th function call = main function
                         "1ST" f(4)
                              /    \
                            /        \
                   "2nd" f(3)   +    f(2)  "7th"
                        /      \       / \
                "3rd" f(2)  +  f(1)  f(1) + f(0)
                     /  \      "6th"  "8th"  "9th"
                  f(1) + f(0)
              "4th"      "5th"  
         
till left bottom the function will call its corresponding ones

                            /    f(4)
                           /   /    \
                          /  /        \
                         /  f(3)   +    f(2)
                        /  /      \       / \
                       / f(2)  +  f(1)  f(1)+f(0)
                      /  /  \
                     V  f(1) + f(0)


                                3. = fibo(4)
                              /    \
                            /        \
                           2    +      1
                        /     \      /  \
                       1   +   1     1 +  0 
                     /  \
                    1 +  0

------POINT 3 : STACH DIAGRAM ----------


|            |
|------------|
| FIBO(0)    |
|------------|
| FIBO(1)    |
|------------|
| FIBO(2)    |
|------------|
| FIBO(3)    |
|------------|
| FIBO(4)    |
|------------|
| main       | //INTERNALLY
|____________|
 stack memory


======================================
https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/

class Solution {
    static int nthFibonacci(int n){
        // base condition
        while(n<2)
        {
            return n;
        }
        //THIS FUNCTION DOESNOT HAVE ANY TAIL RECURSION
        //AS THERE IS RETURN IN FRONT OF THOSE
        return nthFibonacci(n-1) + nthFibonacci(n-2);  
    }
}
=================================


|            |
|------------|
|            |
|------------|
| FIBO(1)    | //insert in stack
|------------|
| FIBO(2)    | //insert in stack
|------------|
| FIBO(3)    | //insert in stack
|------------|
| FIBO(4)    | //insert in stack
|------------|
| main       | //INTERNALLY
|____________|
 stack memory


|            |
|------------|
|            |
|------------|
|            |. //FIBO(1) is removed
|------------|
| FIBO(2)    |
|------------|
| FIBO(3)    |
|------------|
| FIBO(4)    |
|------------|
| main       | //INTERNALLY
|____________|
 stack memory



|            |
|------------|
|            |
|------------|
| FIBO(0)    | //inserted
|------------|
| FIBO(2)    |
|------------|
| FIBO(3)    |
|------------|
| FIBO(4)    |
|------------|
| main       | //INTERNALLY
|____________|
 stack memory


|            |
|------------|
|            |
|------------|
|            | //FIBO(0) removed
|------------|
| FIBO(2)    |
|------------|
| FIBO(3)    |
|------------|
| FIBO(4)    |
|------------|
| main       | //INTERNALLY
|____________|
 stack memory

|            |
|------------|
|            |
|------------|
|            | 
|------------|
|            | //removed FIBO(2)
|------------|
| FIBO(3)    |
|------------|
| FIBO(4)    |
|------------|
| main       | //INTERNALLY
|____________|
 stack memory

|------------|
|            |
|------------|
|            | 
|------------|
|  FIBO(1)   | //inserted  FIBO(1)
|------------|
| FIBO(3)    |
|------------|
| FIBO(4)    |
|------------|
| main       | //INTERNALLY
|____________|
 stack memory

|------------|
|            |
|------------|
|            | 
|------------|
|            | //removed  FIBO(1)
|------------|
| FIBO(3)    |
|------------|
| FIBO(4)    |
|------------|
| main       | //INTERNALLY
|____________|
 stack memory


|------------|
|            |
|------------|
|            | 
|------------|
|            | 
|------------|
|            | //removed  FIBO(3)
|------------|
| FIBO(4)    |
|------------|
| main       | //INTERNALLY
|____________|
 stack memory


|------------|
| FIBO(0)    | //inserted  FIBO(0)
|------------|
| FIBO(1)    | //inserted  FIBO(1)
|------------|
| FIBO(2)    |  //inserted  FIBO(2)
|------------|
| FIBO(4)    |
|------------|
| main       | //INTERNALLY
|____________|
 stack memory

|------------|
|            | //removed  FIBO(0)
|------------|
|            | //removed  FIBO(1)
|------------|
|            | //removed  FIBO(2)
|------------|
| FIBO(4)    |
|------------|
| main       | //INTERNALLY
|____________|
 stack memory

|------------|
|            | 
|------------|
|            | 
|------------|
|            | 
|------------|
|            | //removed FIBO(4)
|------------|
| main       | //INTERNALLY
|____________|
 stack memory

|------------|
|            | 
|------------|
|            | 
|------------|
|            | 
|------------|
|            |
|------------|
|            | //removed main function
|____________|
 stack memory
