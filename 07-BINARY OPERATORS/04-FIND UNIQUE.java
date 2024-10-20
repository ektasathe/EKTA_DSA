you have given an array with each no duplicate except one , find the unique no .

just do XOR for every no
it is similar to - [-3, 5, 6, -5, 1 , 3, -6]
if we sum all above it will give us the unique no only

package com.kunal.bitwise;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;

        for(int n : arr) {
            unique ^= n;
        }

        return unique;
    }
}
