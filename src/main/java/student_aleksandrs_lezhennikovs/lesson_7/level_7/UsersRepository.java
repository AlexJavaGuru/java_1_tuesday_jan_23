package student_aleksandrs_lezhennikovs.lesson_7.level_7;

class UsersRepository {

    private UserEntity[] users;

    UsersRepository(UserEntity[] arrayOfUsers) {
        this.users = arrayOfUsers;
    }

    UserEntity[] getAllUsers() {
        return users;
    }

    UserEntity getUserById(int lookingId) {
        for (int i = 0; i < users.length; i++) {
            if (lookingId == users[i].getId()) {
                return users[i];
            }
        }
        return null;
    }

    UserEntity getUserByLastName(String lastName) {
        for (int i = 0; i < users.length; i++) {
            if (lastName.equals(users[i].getLastName())) {
                return users[i];
            }
        }
        return null;
    }

    UserEntity getUserByFirstName(String firstName) {
        for (int i = 0; i < users.length; i++) {
            if (firstName.equals(users[i].getFirstName())) {
                return users[i];
            }
        }
        return null;
    }

    void deleteUserById(int id) {
        for (int i = 0; i < users.length; i++) {
            if (id == users[i].getId()) {
                users[i] = null;
                resizeUsers(i);
            }
        }
    }

    void add(UserEntity newUser) {
        int indexOfEmptyElement = getIndexOfEmptyElement(users);
        if (indexOfEmptyElement != -1) {
            users[indexOfEmptyElement] = newUser;
        } else if (isPersonalCodeUnique(newUser) && isUserIdUnique(newUser)) {
            extendUsers();
            users[users.length - 1] = newUser;
        }
    }


    private int getIndexOfEmptyElement(UserEntity[] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                return i;
            }
        }
        return -1;
    }

    private void extendUsers() {
        UserEntity[] newUsers = new UserEntity[users.length + 1];
        for (int i = 0; i < users.length; i++) {
            newUsers[i] = users[i];
        }
        users = newUsers;
    }

    private boolean isPersonalCodeUnique(UserEntity checkUser) {
        for (UserEntity user : users) {
            if (user.getPersonalCode().equals(checkUser.getPersonalCode())) {
                return false;
            }
        }
        return true;
    }

    private boolean isUserIdUnique(UserEntity checkUser) {
        for (UserEntity user : users) {
            if (user.getId() == checkUser.getId()) {
                return false;
            }
        }
        return true;
    }

    private void resizeUsers(int index) {
        for (int i = index; i < users.length - 1; i++) {
            users[i] = users[i + 1];
        }
        deleteLastElementOfArray();
    }

    private void deleteLastElementOfArray() {
        UserEntity[] newUser = new UserEntity[users.length - 1];
        for (int i = 0; i < newUser.length; i++) {
            newUser[i] = users[i];
        }
        users = newUser;
    }

}
