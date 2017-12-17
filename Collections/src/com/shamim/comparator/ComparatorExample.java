/*
 * How can we sort java ArrayList in descending order using comparator example
 */
package com.shamim.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Shamim
 */
public class ComparatorExample {
    public static void main(String[] args) {
        
        ArrayList arrayList = new ArrayList();
        
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("F");
        
        Comparator comparator = Collections.reverseOrder();
        
        System.out.println("Befor sorting : " + arrayList);
        
        Collections.sort(arrayList, comparator);
        
        System.out.println("After sorting : " + arrayList);
    }
}
