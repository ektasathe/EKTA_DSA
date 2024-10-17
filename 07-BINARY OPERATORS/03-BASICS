FIND A NO IS EVEN OR ODD

ANS : EVERY NO IS CALCULATED IN BINARY FORM INTERNALLY

  1     0    0    1    1
  2^4  2^3  2^2  2^1  2^0
 -------------------  ----
     EVEN NO           ODD

EXCLUDING THE RIGNT MOST POSITION , ALL THE OTHER POSITIONS ARE POWER OF 2 IE . WILL BE EVEN

SO  IF RIGHT MOST POSITION IS 1 -> THEN NO IS EVEN
AND IF RIGHT MIST POSITION IS 0 -> THEN NO IS ODD

SO IF WE & ANY NO WITH 1 THEN WE WILL GET THAT NO ONLY 

1 1 0 0 1
0 0 0 0 1
---------
0 0 0 0 1 -> NO IS ODD

1 1 0 0 0
0 0 0 0 1
---------
0 0 0 0 0 -> NO IS EVEN


package com.kunal.bitwise;

public class OddEven {

    public static void main(String[] args) {
	    int n = 68;
        System.out.println(isOdd(n)); //if no is odd then it will print true else will print false
    }

    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
