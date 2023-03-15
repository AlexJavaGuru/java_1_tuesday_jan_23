package student_oksana_tarasova.lesson_7.level_7;

import java.util.Arrays;
import java.util.Scanner;

public class Repository {

    private UserEntity[] users;

    Repository(UserEntity[] users) {
        this.users = users;
    }

    public void setUsers(UserEntity[] users) {
        this.users = users;
    }

    UserEntity[] getUsers() {
        return users;
    }

    UserEntity getUserId(long id) {
        for (UserEntity user : users) {
            if (id == user.getId()) {
                return user;
            }
        }
        return null;
    }

    UserEntity getUserSurname(String surname) {
        for (UserEntity user : users) {
            if (surname.equals(user.getSurname())) {
                return user;
            }
        }
        return null;
    }

    UserEntity[] deleteUser(long id) {
        for (int i = 0; i < users.length; i++) {
            if (id == users[i].getId()) {
                users[i] = null;
                break;
            }
        }
        setUsers(users);
        return users;
    }

     UserEntity[] addUser(UserEntity user) {
        int j = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                break;
            } else if (users[users.length - 1] != null && i == users.length - 1) {
                arrayIncrease();
                j++;
            }
        }
        return users;
    }

    UserEntity[] correctedUserData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Correct user data. Enter user id:");
        long id = scanner.nextLong();
        System.out.println(getUserId(id));
        System.out.println("Make changes name: ");
        String name = scanner.next();
        nameSubstitution(id, name);
        return users;
    }


    private UserEntity[] arrayIncrease() {
        UserEntity[] usersAdd = new UserEntity[users.length + 1];
        for (int i = 0; i < users.length; i++) {
            usersAdd[i] = users[i];
        }
        return users = usersAdd;
    }

    private UserEntity nameSubstitution(long id, String name) {
        for (UserEntity user : users) {
            if (id == user.getId()) {
                user.setName(name);
                return user;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Repository{" +
                "users=" + Arrays.toString(users) +
                '}';
    }
}
