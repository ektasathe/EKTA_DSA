SUBSET PROBLEM = PATTERN OF TAKING SOME ELEMENTS AND REMOVING SOME ELEMENTS IS KNOWN AS SUBSET PROBLEMS 

SUBSET OF [abc] = [ "",  a,  b, c, bc, ab, ac, abc]
NOTE : ** subset cannot have disorder  ie it cannot be "ba" , it will always be "ab"

WHENVEVER YOUR UNPROCESSED STRING BECOMES EMPTY , THEN PRINT THE PROCESSED STRING

                                             ""/abc
                                            /       \
                                        a/bc       ""/bc  #first part take "b" , sec part donot take "b"
                                       /    \      /    \
                                    ab/c   a/c   b/c     /c  #1. take "c", donot take "c" || 2. take "b" donot take "b"
                                  /    \  /   \  /  \   /   \
                                abc    ab ac  a  bc  b   c  ""  -> here our unprocessed/ actual string will become empty at this point retun (iee. break the function call)
                                  
 
at the end when we have nothing to remove , we will do the return call .

QUE : https://leetcode.com/problems/subsets/description/

STEP 1 : we have 2 strings. 
1st is UP(unprocessed) the actual string. "abd"
2nd one that we create is p(Processed) the empty string "" . Here we will add or not add the characters

STEP 2 : When UP string becomes empty , then return it 

STEP 3 : If taking the character then ( add the char to processed string + call the rest substring)
        subseq(p + ch, up.substring(1));
        
STEP 4 : If not taking the Char then ( donot add anything to procesed string + call the rest substring )
        subseq(p, up.substring(1));

=============================================================

<< ** in actual you would require to solve this by taking  arraylist ** so this is just the bacis to remember , later chaes would be done in this >>

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
         subseq("", "abc");
    }

    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p+" ");
            return ;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1)); //STEP 3 : If taking the character then ( add the char to processed string + call the rest substring)
        subseq(p, up.substring(1));  //STEP 4 : If not taking the Char then ( donot add anything to procesed string + call the rest substring )
    }
}
