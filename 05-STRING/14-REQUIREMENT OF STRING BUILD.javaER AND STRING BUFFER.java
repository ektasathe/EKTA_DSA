import java.util.*;

public class Main{
  public static void main(String args[])
  {
    String str1 = "";
    for(int i=0; i<26; i++)
    {
      char ch = (char)('a'+i); //('a'+i) = only this will give integer/asci. so putting char in front of it will convert the ascii into character 
      str1 = str1 + ch ;
    } 
    System.out.println(str1);
  }
}
================

  str1 = "" + "a" = "a"  ---> obj1 created with ref variable str1 pointing to obj 1 now
  str1 = "a" + "b" = "ab"  ----->obj2 is created with ref variable pointing to obj 2 now
  str1 = "ab" + "c" = "abc"  ----->obj3 is created with ref variable pointing to obj 3 now
  str1 = "abc" + "d" = "abcd"  ----->obj4 is created with ref variable pointing to obj 4 now
  this will continue till abcdefghijklmnopqrstuvwxyz

  DRAWBACK :
  Here each time a new object is creted and old objects are let as it is with no reference variable .
  BECAUSE STRING IS IMMUTABLE , ITS OBJECT CANNOT BE MODIFIED , OLY A NEW OBJECT CAN BE CREATED .
  hence old objects still consumes the memory . Thus there is memory wastage .

  Also it takes O(N^2) time complexity.

  1 + 2 + 3 + 4 + 5 + --- N
  N(N+1)/2 = (N^2 + N)/2 = (N^2) as ignore constants .

  ===============================================================

SO WE NEED A DATATYPE THAT IS ALWAYS PPOINTING TO SAME OBJECT EVEN IF THE OBJECT IS CHANGED
THAT IS : STRING BUILDER 

  package com.kunal;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }

        System.out.println(builder.toString());
        builder.reverse();
        System.out.println(builder);
    }
}
/HERE NO NEW OBJECTS ARE CREATED EVERY TIME , ONLY THE EXISTING OBJECTS ARE GETTING MODIFIED AGAIN AND AGAIN 
  

