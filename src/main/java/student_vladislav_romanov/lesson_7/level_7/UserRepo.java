package student_vladislav_romanov.lesson_7.level_7;

import java.util.Arrays;
import java.util.Scanner;

class UserRepo {

    private UserEntity[] userEntities;
    Scanner scanner = new Scanner(System.in);

    public UserRepo() {
        userEntities = new UserEntity[0];
    }

    public UserRepo(UserEntity user) {
        userEntities = new UserEntity[1];
        userEntities[0] = user;
    }

    public void saveUserToDataBase(UserEntity user) {
        if (isIdNotUnique(user.getId())) {
            user.setId(createUniqueId());
        }
        int index = userEntities.length;
        UserEntity[] newUserEntities = new UserEntity[index + 1];
        for (int i = 0; i < userEntities.length; i++) {
            newUserEntities[i] = userEntities[i];
        }
        newUserEntities[index] = user;
        userEntities = newUserEntities;
    }

    public boolean isIdNotUnique(int id) {
        for (UserEntity user : userEntities) {
            if (user.getId() == id) {
                return true;
            }
        }

        return false;
    }

    public int createUniqueId() {
        int uniqueId = 1;

        for (UserEntity user : userEntities) {
            if (user.getId() > uniqueId) {
                uniqueId = user.getId();
            }
        }

        return ++uniqueId;
    }

    public UserEntity getUserById(int id) {
        for (UserEntity user : userEntities) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public UserEntity[] getUsersByName(String name) {
        return fillUsersByNameArray(name, getUsersByNameCount(name));
    }

    private int getUsersByNameCount(String name) {
        int usersCount = 0;
        for (UserEntity user : userEntities) {
            if (user.getName().equals(name)) {
                usersCount++;
            }
        }
        return usersCount;
    }

    private UserEntity[] fillUsersByNameArray(String name, int count) {
        UserEntity[] usersByName = new UserEntity[count];
        int index = 0;
        for (int i = 0; i < userEntities.length; i++) {
            if (userEntities[i].getName().equals(name)) {
                usersByName[index] = userEntities[i];
                index++;
            }
        }

        return usersByName;
    }

    public UserEntity[] getUserEntities() {
        return userEntities;
    }

    public void editUser(int id) {
        UserEntity user = getUserById(id);

        System.out.print("Current user name: " + user.getName() + ". Please enter new: " );
        user.setName(scanner.next());

        System.out.print("Current user surname: " + user.getSurname() + ". Please enter new: " );
        user.setSurname(scanner.next());

        System.out.print("Current user personal code: " + user.getPersonalCode() + ". Please enter new: " );
        user.setPersonalCode(scanner.next());
    }

    public void editUser(int id, String name, String surname, String personalCode) {
        UserEntity user = getUserById(id);

        user.setName(name);
        user.setSurname(surname);
        user.setPersonalCode(personalCode);
    }

    public void deleteUser(int id) {
        UserEntity[] newUserEntities = new UserEntity[userEntities.length - 1];
        int i = 0;
        for (UserEntity user : userEntities) {
            if (user.getId() != id) {
                newUserEntities[i] = user;
                i++;
            }
        }
        userEntities = newUserEntities;
    }

    @Override
    public String toString() {
        return "UserRepo{" +
                "userEntities=" + Arrays.toString(userEntities) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRepo userRepo = (UserRepo) o;
        return Arrays.equals(userEntities, userRepo.userEntities);
    }
}
