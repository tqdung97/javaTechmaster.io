package HomeWork;


public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Account account = new Account();
        account.setName("Trinh Quang Dung");
        account.setAccountNumber("1515199766666");
        account.setMail("tqdung2301197@gmail.com");
        account.setAccountBalance(500000);
        account.displayInfo();
        account.recharge();
        account.changeEmail();


    }
}
