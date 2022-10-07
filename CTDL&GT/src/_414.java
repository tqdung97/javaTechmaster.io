import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _414 {
    public static int thirdMax(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i : nums)
            l.add(i);
        int max1 = Collections.max(l);
        l.removeAll(Collections.singleton(max1));
        if(l.size() == 0)
            return max1;
        int max2 = Collections.max(l);
        l.removeAll(Collections.singleton(max2));
        if(l.size() == 0)
            return max1;

        return Collections.max(l);
    }

}
