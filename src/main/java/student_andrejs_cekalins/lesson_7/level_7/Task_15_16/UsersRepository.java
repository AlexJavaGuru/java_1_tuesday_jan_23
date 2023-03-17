package student_andrejs_cekalins.lesson_7.level_7.Task_15_16;

import java.util.Objects;

class UsersRepository {
    private UserEntity[] users;

    UsersRepository(UserEntity[] usersArray) {
        this.users = usersArray;
    }

    public UserEntity getUserById(int userId) {
        for (int i = 0; i < users.length; i++) {
            if (userId == users[i].getId()) {
                return users[i];
            }
        }
        return null;
    }

    public UserEntity getUserByName(String name) {
        for (int i = 0; i < users.length; i++) {
            if (name.equals(users[i].getName())) {
                return users[i];
            }
        }
        return null;
    }

    public UserEntity getUserBySurname(String surname) {
        for (int i = 0; i < users.length; i++) {
            if (surname.equals(users[i].getSurname())) {
                return users[i];
            }
        }
        return null;
    }

    public UserEntity[] getAllUsers() {
        return users;
    }

    public void editUser(int id) {
        UserEntity user = getUserById(id);
        user.setName("");
        user.setSurname("");
        user.setPersonalCode("");
    }

    public void deleteUser(int id) {
        for (int i = 0; i < users.length; i++) {
            if (id == users[i].getId()) {
                users[i] = null;
            }
        }
    }

    private boolean uniqueUserId(UserEntity userId) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getId() == userId.getId()) {
                return false;
            }
        }
        return true;
    }

    private boolean uniqueUserPersonalCode(UserEntity userPersonalCode) {
        for (int i = 0; i < users.length; i++) {
            if (Objects.equals(users[i].getPersonalCode(), userPersonalCode.getPersonalCode())) {
                return false;
            }
        }
        return true;
    }
}

