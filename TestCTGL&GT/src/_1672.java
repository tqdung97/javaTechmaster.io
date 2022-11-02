public class _1672 {
        /*
   https://leetcode.com/problems/richest-customer-wealth/
    * */


    public static int maximumWealth(int[][] accounts) {
        int total =0;
        for(int i = 0; i < accounts.length; i++){
            for (int j = 1; j < accounts[i].length; j++){
                accounts[i][j] += accounts[i][j - 1];
            }
            total = Math.max(total,accounts[i][accounts[i].length -1]);
        }
        return total;
    }


    public static void main(String[] args) {
        int [][] accounts = {{2,8,7},{7,1,3},{1,9,5}};

        System.out.println(maximumWealth(accounts));
    }

}
