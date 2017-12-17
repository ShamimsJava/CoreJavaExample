/*
 Boolean check if a particular key exits in java hashmap example
 */
package com.shamim.hashmap;

import java.util.HashMap;

/**
 *
 * @author Shamim
 */
public class HashMapExample {
    public static void main(String[] args) {
        
        HashMap hashMap = new HashMap();
        
        hashMap.put("1", "shamim");
        hashMap.put("2", "shohan");
        hashMap.put("3", "urmi");
        
        System.out.println(hashMap);
        
        boolean b1 = hashMap.containsKey("3");
        System.out.println(b1);
        
        boolean b2 = hashMap.containsValue("shamim");
        System.out.println(b2);
    }
}
