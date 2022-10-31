package Hashing;

import java.util.HashSet;
import java.util.Set;

public class _136 {
    public int singleNumber(int[] nums) {
        Set<Integer> hashSet= new HashSet<>();
        for(Integer i : nums){
            if(!hashSet.contains(i)){
            hashSet.add(i);
            }else {
                hashSet.remove(i);
            }
        }
        return hashSet.iterator().next();
    }
}
