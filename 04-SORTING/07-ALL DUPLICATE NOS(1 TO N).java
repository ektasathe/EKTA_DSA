https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

Input: nums = [4,3,2,7,8,2,3,1] | Output: [2,3]
AT END THE REPEATED NOS ILL BE AT THAT PLACE FROM WHERE THE ACTUAL NOS ARE MISSNG

 0  1  2  3  4  5  6  7
[4, 3, 2, 7, 8, 2, 3, 1] //compare and swap
 -        -
 0  1  2  3  4  5  6  7
[7, 3, 2, 4, 8, 2, 3, 1] //compare and swap
 -                 -
 0  1  2  3  4  5  6  7
[3, 3, 2, 4, 8, 2, 7, 1] //compare and swap
 -     -
 0  1  2  3  4  5  6  7
[2, 3, 3, 4, 8, 2, 7, 1] //compare and swap
 -  -
 0  1  2  3  4  5  6  7. //HERE AT i=0 (3 IS ALREADY ATO CORRECT INDEX). SO i++ | i=2
[3, 2, 3, 4, 8, 2, 7, 1] //move | 2 IS ALREADY AT CORRECT INDEX , SO  i++;
    -
 0  1  2  3  4  5  6  7
[3, 2, 3, 4, 8, 2, 7, 1] //move| 3 IS ALREADY ATO CORRECT INDEX SO i++
       -
 0  1  2  3  4  5  6  7
[3, 2, 3, 4, 8, 2, 7, 1] //move | 4 IS ALREADY AT CORRECT INDEX
          -
 0  1  2  3  4  5  6  7
[3, 2, 3, 4, 8, 2, 7, 1]  //compare and swap 
             -        -
 0  1  2  3  4  5  6  7
[3, 2, 3, 4, 1, 2, 7, 8]  //compare and swap           
 -           -
 0  1  2  3  4  5  6  7
[1, 2, 3, 4, 3, 2, 7, 8] //move | 3 IS ALREADY ATO CORRECT INDEX S i++
             -
 0  1  2  3  4  5  6  7
[1, 2, 3, 4, 3, 2, 7, 8] //AT THE END OF CODE, THE ELEMENT AT LOCATION 4 AND 5 ARE REPEATED NOS SO RETURN IT
             ~  ~
===================================================================

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int correctindex = nums[i] - 1;
            if(nums[i] != nums[correctindex])
            {
                swap(nums, i, correctindex);
            }
            else{
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int j=0; j< nums.length; j++)
        {
            if(nums[j] - 1 != j)
            {
                list.add(nums[j]);
            }
        }
        return list;
    }
    static void swap(int nums[], int i, int correctindex)
    {
        int temp = nums[correctindex];
        nums[correctindex] = nums[i];
        nums[i] = temp;
    }
}