package com.mapInterface;

import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

public class MapInterface2 {
    public static void main(String[] args) {
        // TreeMap instead of HashMap
        Map<Integer, String> map = new TreeMap<>();

        map.put(1, "Hello");
        map.put(2, "Hello");
        map.put(3, "Callahan");
        map.put(4, "Hello");
        // map.put(null, "Hello"); // ❌ TreeMap does not allow null key
        map.put(1, "Rowan");       // replaces previous value for key 1

        System.out.println("TreeMap: " + map);

        System.out.println("\nUsing forEach:");
        map.forEach((k, v) -> System.out.println(k + " -> " + v));

        System.out.println("\nUsing entrySet:");
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUsing keySet:");
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}