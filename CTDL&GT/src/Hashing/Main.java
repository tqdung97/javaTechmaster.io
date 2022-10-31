package Hashing;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        System.out.println(hashSet.add(1));
        System.out.println(hashSet.add(8));
        System.out.println(hashSet.add(5));
        System.out.println(hashSet.add(12));
        System.out.println(hashSet.add(1));

        System.out.println( hashSet);


        // In ra theo kiểu mặc định duy trì

        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(1);
        linkedHashSet.add(10);
        linkedHashSet.add(21);
        linkedHashSet.add(14);
        linkedHashSet.add(6);
        linkedHashSet.add(8);


        System.out.println(linkedHashSet);

        // in ra theo thứ tự tăng dần dùng treeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(6);

        System.out.println(treeSet);

        // descendingSet in ra ngược lại với treeSet theo kiểu giảm dần

        System.out.println(treeSet.descendingSet());




    }
}
