import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/unique-email-addresses/
public class _929 {

    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet();
        int count = 0;
        for (String email : emails) {
            int index = email.indexOf("@");
            int index2 = email.indexOf("+");
            String string = "";
            if (index2 >= 0) {
                string = email.substring(0, index2);
            } else {
                string = email.substring(0, index);
            }
            string = string.replace(".", "") + email.substring(index);
            if (set.add(string)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] emails = new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }
}
