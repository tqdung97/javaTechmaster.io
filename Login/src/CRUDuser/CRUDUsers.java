package CRUDuser;

import model.User;

public interface CRUDUsers {
    void editUser(User user, int checkNumber);
    void updateUser();
    void display();
    void delUser();
}
