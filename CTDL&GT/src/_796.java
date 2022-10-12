public class _796 {

    public    boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        if(s.equals(goal)==true){
            return true;
        }
        int id=0;
        for(int i=1;i<goal.length();i++)
        {
            if(s.contains(goal.substring(0,i))==false)
            {
                id=i-1;
                break;
            }
        }
        String sub=goal.substring(id,goal.length());
        if(s.substring(0,sub.length()).equals(sub)==true){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
         String s = "abcde", goal = "cdeab";
        String f = "abcde", g = "abced";
        _796 a = new _796();
        System.out.println(a.rotateString(s,goal));
        System.out.println(a.rotateString(f,g));

    }
}
