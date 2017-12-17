/*
How can we Add Element To Specified Index Array List Example
 */
package com.shamim.arraylist;

import java.util.ArrayList;

/**
 *
 * @author Shamim
 */
public class Collection1 {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");

        arrayList.add(1, "INSERTED ELEMENT");
        arrayList.add(1, "INSERTED ELEMENT2");

        System.out.println("ArrayList contains...");

        for (int index = 0; index < arrayList.size(); index++) {
            System.out.println(arrayList.get(index));
        }
    }
}
