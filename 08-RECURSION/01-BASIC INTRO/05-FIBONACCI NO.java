
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

======================================
https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/

class Solution {
    static int nthFibonacci(int n){
        // base condition
        while(n<2)
        {
            return n;
        }
        return nthFibonacci(n-1) + nthFibonacci(n-2);
        
    }
}