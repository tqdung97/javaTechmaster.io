package Hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _12 {
    public static String intToRoman(int num) {
        Map<Integer, String> hashMap = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();
        hashMap.put(1, "I");
        hashMap.put(4, "IV");
        hashMap.put(5, "V");
        hashMap.put(9, "IX");
        hashMap.put(10, "X");
        hashMap.put(40, "XL");
        hashMap.put(50, "L");
        hashMap.put(90, "XC");
        hashMap.put(100, "C");
        hashMap.put(400, "CD");
        hashMap.put(500, "D");
        hashMap.put(900, "CM");
        hashMap.put(1000, "M");
        Integer[] key = {1000, 900, 500, 400, 100, 90, 50,40,10,9,5,4,1};

        for(int i = 0; i< key.length; i++){
            while (key[i] <= num) {
                result.append(hashMap.get(key[i]));
                num = num - key[i];
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }
}