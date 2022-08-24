package service;

import CRUDuser.CRUDUsers;
import model.Main;
import model.User;

import java.util.List;
import java.util.Scanner;

public class userService implements CRUDUsers {
    static String regexEmail = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

    static String regexPassword = "^(?=.*\\d)(?=.*[a-z])(?=.*[.,-_;])(?=.*[A-Z])(?=.*[a-zA-Z]).{7,15}$";
    List<User> userList = Main.userList;
    @Override
    public void editUser(User user, int checkNumber) {
        Scanner sc = new Scanner(System.in);
        if (checkNumber != 1 && checkNumber != 2 && checkNumber != 3){
            System.out.println("Hãy nhập lại");
            editUser(user, checkNumber);
        }
        while (checkNumber == 1){
            boolean checkUsername = true;
            System.out.println("Nhập tài khoản mới :");
            String username = sc.nextLine();
            for (User users : userList ) {
                if (users.getUserName().equals(username)){
                    System.out.println("Tài khoản đã tồn tại, hãy nhập lại");
                    checkUsername = false;
                }
            }
            if (checkUsername){
                user.setUserName(username);
                System.out.println("Đổi thành công.");
                checkNumber = 0;
            }
        }
        while (checkNumber == 2){
            System.out.println("Nhập password mới :");
            String password = sc.nextLine();
            boolean checkPassword = password.matches(regexPassword);
            if (!checkPassword){
                System.out.println("Mật khẩu không đúng định dạng. Hãy nhập lại");
                continue;
            }
            user.setPassword(password);
            System.out.println("Đổi mật khẩu thành công.");
            checkNumber = 0;
        }
        while (checkNumber == 3){
            boolean checkEmail = true;
            System.out.println("Nhập email mới :");
            String email = sc.nextLine();
            boolean checkEmailRegex = email.matches(regexEmail);
            if (!checkEmailRegex){
                System.out.println("Email không đúng định dạng. Hãy nhập lại");
                continue;
            }
            for (User users : userList ) {
                if (users.getEmail().equals(email)){
                    System.out.println("Email đã tồn tại, hãy nhập lại");
                    checkEmail = false;
                }
            }
            if (checkEmail){
                user.setEmail(email);
                System.out.println("Đổi thành công.");
                checkNumber = 0;
            }
        }

    }

    @Override
    public void display() {
        }


    @Override
    public void updateUser() {

    }

    @Override
    public void delUser() {

    }
}
