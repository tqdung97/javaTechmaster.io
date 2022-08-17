package HomeWork;

import java.util.Scanner;

public class Account implements IAccount {
    private String name;
    private String accountNumber;
    private String mail;
    private double accountBalance;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    @Override
    public void recharge() {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Amount: ");
        double amount = sc.nextDouble();
        if(amount > 0 || amount < 0){
            System.out.println("Result accountblance : " + (amount + this.accountBalance) + " $");
        }else{
            System.out.println("Result accountblance : " +  this.accountBalance + " $");

        }

    }
    @Override
    public void changeEmail() {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("input change Email: ");
        String email = sc.nextLine();
        System.out.println("changeEmail: " +  email);
        sc.close();
    }
    @Override
    public void displayInfo() {
        // TODO Auto-generated method stub
        System.out.println("Name: " + this.name );
        System.out.println("AccountNumber: " + this.accountNumber );
        System.out.println("Email: " + this.mail);
        System.out.println("AccountBlance: " + this.accountBalance + "$");
        
    }
}
