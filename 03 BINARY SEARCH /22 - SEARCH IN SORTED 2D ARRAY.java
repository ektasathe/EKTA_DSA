https://leetcode.com/problems/search-a-2d-matrix/
TIME COMPLEXITY = 2N = O(N+M)
SPACE COMPLEXITY = O(1) 

NO OF ROWS = MATRIX.LENGTH;
TARGET IS TO FIND 30
               c.     //HERE WE ARE TRAVELLING LIKE BELOW AND REACHING **
r[[1,  3,  5,  7 ],  [ , - , - , - ]
 [10, 11,  16, 20],  [ , | ,   ,   ]
 [23,*30*, 34, 60],  [ , **,   ,   ]
 [25, 33,  38, 62]]. [ ,   ,   ,   ]

 IN WORST CASE WE NEED TO TRACVEL LIKE THIS
 [ ,  ,  ,  , | ]
 [ ,  ,  ,  , | ]
 [ ,  ,  ,  , | ]. TIME COMP 0(N+M) , N=ROW, M=COL
 [-, -, -, -, - ]

//return the index of the target
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int r = 0;
       int c = matrix[0].length -1;

       while(r < matrix.length && c >= 0)
       {
            if(target == matrix[r][c])
            {
                return new int[]{r,c};
            }
            else if(target > matrix[r][c])
            {
                r++;
            }
            else
            {
                c--;
            }
       } 
       return new int[]{-1,-1};
    }
}

===========================================================================================

//returning true if element is found else returning false
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int r =0;
       int c = matrix[0].length -1;

       while(r < matrix.length && c >= 0)
       {
            if(target == matrix[r][c])
            {
                return true ;
            }
            else if(target > matrix[r][c])
            {
                r++;
            }
            else
            {
                c--;
            }
       } 
       return false;
    }
}
