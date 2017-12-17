/*
 How can we copy ArrayList object elements to java Vector object
 */
package com.shamim.arraylist_vector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

/**
 *
 * @author Shamim
 */
public class ArrayListVector {
    public static void main(String[] args) {
        
        ArrayList arrayList = new ArrayList();
        
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        
        Vector vector = new Vector();
        
        vector.add("A");
        vector.add("B");
        vector.add("C");
        vector.add("D");
        vector.add("E");
        vector.add("F");
        vector.add("G");
        
        System.out.println("Befor copy, Vectory Contains: " + vector);
        
        Collections.copy(vector, arrayList);
        
        System.out.println("After copy, Vector Contains: " + vector);
    }
}
