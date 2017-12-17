/*
 * How can we sort byte array
 */
package com.shamim.bytearray;

import java.util.Arrays;

/**
 *
 * @author Shamim
 */
public class SortByteArray {

    public static void main(String[] args) {

        byte[] b1 = new byte[]{3, 2, 5, 4, 1};

        System.out.println("Before sorting");
        for (int i = 0; i < b1.length; i++) {
            System.out.println(b1[i]);
        }

        Arrays.sort(b1);

        System.out.println("After sorting");
        for (int i = 0; i < b1.length; i++) {
            System.out.println(b1[i]);
        }
        
        byte[] b2 = new byte[]{5,2,3,1,4};

        Arrays.sort(b2, 1, 4);
        
        System.out.println("After specific sorting");
        for (int i = 0; i < b2.length; i++) {
            System.out.println(b2[i]);
        }
    }
}
