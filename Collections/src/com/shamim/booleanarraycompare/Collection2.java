/*
How can we Compare Boolean Array Example
*/
package com.shamim.booleanarraycompare;

import java.util.Arrays;

/**
 *
 * @author Shamim
 */
public class Collection2 {
    public static void main(String[] args) {
        boolean[] b1 = new boolean[]{true, false, true};
        boolean[] b2 = new boolean[]{true, false, true};
        
        boolean result = Arrays.equals(b1, b2);
        
        System.out.println(result);
    }
}
