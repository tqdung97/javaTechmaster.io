package Hashing;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap();
        hashMap.put(3,"Chris");
        hashMap.put(10,"Anna");
        hashMap.put(2,"Joe");
        hashMap.put(1,"Eva");

        System.out.println(hashMap);

        for (Map.Entry<Integer,String>  entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


        System.out.println(hashMap.remove(2));

        System.out.println(hashMap.containsKey(1));

        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(9,"Java");
        linkedHashMap.put(5,"HTML");
        linkedHashMap.put(1,"Js");
        System.out.println(linkedHashMap);


        Map<Integer,String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        treeMap.put(5,"Food");
        treeMap.put(3,"Suzuki");
        treeMap.put(1,"Cnada");
        treeMap.put(4,"String");
        treeMap.put(9,"Interger");
        System.out.println(treeMap);

    }
}
