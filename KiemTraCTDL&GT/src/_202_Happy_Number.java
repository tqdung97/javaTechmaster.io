package src;

import java.util.HashSet;

/*
* Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
*Constraints:
* 1 <= n <= 231 - 1*/
public class _202_Happy_Number {
    public static boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while(true) {
            int k = 0;
            while(n != 0) {
                int rem = n % 10;
                k += rem * rem;
                n = n / 10;
            }

            if(k == 1) return true;
            if(set.contains(k)) return false;
            set.add(k);
            n = k;
        }

    }

    public static void main(String[] args) {
        System.out.println(isHappy(1));
    }
}
