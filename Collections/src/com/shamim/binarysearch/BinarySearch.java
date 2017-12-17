/*
 * How can we perform binary search on java byte array example
 */
package com.shamim.binarysearch;

import java.util.Arrays;

/**
 *
 * @author Shamim
 */
public class BinarySearch {
    public static void main(String[] args) {
        
        byte[] b1 = {1,2,4,5};
        
        Arrays.sort(b1);
        
        byte searchValue = 2;
        
        int result = Arrays.binarySearch(b1, searchValue);
        System.out.println(result);
        
        searchValue = 6;
        result = Arrays.binarySearch(b1, searchValue);
        System.out.println(result);
    }
}
