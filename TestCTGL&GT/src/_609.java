//https://leetcode.com/problems/find-duplicate-file-in-system/

import java.util.*;

public class _609 {
    public static List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap();
        String[] var2 = paths;
        int var3 = paths.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String e = var2[var4];
            String[] arr = e.split(" ");
            String dir = arr[0];

            for(int i = 1; i < arr.length; ++i) {
                String str = arr[i];
                String[] file = str.replace(")", "(").split("\\(");
                String content = file[1];
                String fName = file[0];
                List<String> fList = (List)map.getOrDefault(content, new ArrayList());
                fList.add(dir + "/" + fName);
                map.put(content, fList);
            }
        }

        List<List<String>> res = new ArrayList();
        Iterator var15 = map.values().iterator();

        while(var15.hasNext()) {
            List<String> e = (List)var15.next();
            if (e.size() > 1) {
                res.add(e);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String[] paths = new String[]{"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)"};
        System.out.println(findDuplicate(paths));
    }
}
