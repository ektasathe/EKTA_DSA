
https://leetcode.com/problems/subsets/

STEP 1 : we have 2 strings. 
1st is UP(unprocessed) the actual string. "abd"
2nd one that we create is p(Processed) the empty string "" . Here we will add or not add the characters

STEP 2 : When UP string becomes empty , then return it 

STEP 3 : If taking the character then ( add the char to processed string + call the rest substring)
        subseq(p + ch, up.substring(1));
        
STEP 4 : If not taking the Char then ( donot add anything to procesed string + call the rest substring )
        subseq(p, up.substring(1));

---------------------------------------
class Solution {
   
   public List<List<Integer>> subsets(int[] nums) {
         return subseqRet(new ArrayList<>(), nums);
    }

  private List<List<Integer>> subseqRet(List<Integer> p, int[] up) {
        if (up.length == 0) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>(p));
            return list;
        }

        // Separate first element and rest of the array
        int first = up[0];
        int[] rest = new int[up.length - 1];
        System.arraycopy(up, 1, rest, 0, up.length - 1);

        // Include the first element
        List<Integer> pWithFirst = new ArrayList<>(p);
        pWithFirst.add(first);
        List<List<Integer>> left = subseqRet(pWithFirst, rest);

        // Exclude the first element
        List<List<Integer>> right = subseqRet(p, rest);

        left.addAll(right);
        return left;
    }

}

