package student_oksana_tarasova.lesson_7.level_7;

import java.util.Arrays;

public class Repository {

    private UserEntity[] users;

    public void setUsers(UserEntity[] users) {
        this.users = users;
    }

    Repository(UserEntity[] users) {
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

    void deleteUser(long id) {
        for (int i = 0; i < users.length; i++) {
            if (id == users[i].getId()) {
                users[i] = null;
                break;
            }
        }
        setUsers(users);
    }

    void addUser(UserEntity user) {
        int j = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[j] = user;
                break;
            } else {
                arrayIncrease();
                j += 1;
            }
        }
    }

    private UserEntity[] arrayIncrease() {
        UserEntity[] usersAdd = new UserEntity[users.length + 1];
        for (int i = 0; i < users.length; i++) {
            usersAdd[i] = users[i];
        }
        return users = usersAdd;
    }

    @Override
    public String toString() {
        return "Repository{" +
                "users=" + Arrays.toString(users) +
                '}';
    }
}
