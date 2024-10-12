package com.kunal;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');  //OP - 195 - SUM OF ASCII VALUES
        System.out.println("a" + "b");  // OP - ab
        System.out.println('a' + 3);  //op - 100 (ascii value sum of a+b+c)
        System.out.println((char)('a' + 3));  //op - d
        System.out.println('"a" + 'b') ; //op - ab | if any one data type is string then it will print string 
        
        System.out.println("a" + 1);  //op - a1
        //when a integer is concanated with string , it is converte to its wrapper class
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()

        System.out.println("Kunal" + new ArrayList<>());  //op - kunal[]
        System.out.println("Kunal" + new Integer(56));  //op -kunal56

        String ans = new Integer(56) + new ArrayList<>(); //error - as operator + cannot be aplied to integer and arrays, atlease one bject should be string
        String ans = new Integer(56) + " " + new ArrayList<>(); //it will give op because atleast one object is string ie . " "
        System.out.println(ans);  //op - 56[]

        System.out.println("a" + 'b');
    }
}
