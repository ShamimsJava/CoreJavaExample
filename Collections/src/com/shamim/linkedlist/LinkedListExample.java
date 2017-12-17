/*
 * How can we add elements at beginning and end of LinkedList java example
 */
package com.shamim.linkedlist;

import java.util.LinkedList;

/**
 *
 * @author Shamim
 */
public class LinkedListExample {
    public static void main(String[] args) {
        
        LinkedList linkedList = new LinkedList();
        
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");
        
        System.out.println(linkedList);
        
        linkedList.addFirst("0");
        linkedList.addLast("6");
        
        System.out.println(linkedList);
        
        linkedList.add(3, "shamim");
        
        System.out.println(linkedList);
    }
}
