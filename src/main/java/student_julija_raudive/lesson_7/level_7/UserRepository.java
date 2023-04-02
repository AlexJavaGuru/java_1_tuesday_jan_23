package student_julija_raudive.lesson_7.level_7;

import java.util.ArrayList;
import java.util.Objects;


class UserRepository {

    ArrayList<UserEntity> users;

    public UserRepository(ArrayList<UserEntity> users) {
        this.users = users;
    }

    public void addUser(String name, String surname, String personalCode) {
        int id = getUniqueId();
        if (checkPersonalCode(personalCode)) {
            users.add(new UserEntity(id, name, surname, personalCode));
        } else {
            message("Personal code already exists");
        }
    }


    public UserEntity getUserById(int id) {
        for (UserEntity user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;

    }

    public UserEntity getUsersByName(String name, String surname) {
        for (UserEntity user : users) {
            if (user.getName().equals(name) && user.getSurname().equals(surname)) {
                return user;
            }
        }
        return null;


    }

    public ArrayList getAllUsers() {
        return users;
    }

    public void changeUserData(UserEntity user, String name, String surname, String PersonalCode) {
        user.setName(name);
        user.setSurname(surname);
        user.setPersonalCode(PersonalCode);

    }

    public void deleteUser(UserEntity user) {
        users.remove(user);

    }

    public int getUniqueId() {
        int id = 1;
        for (UserEntity user : users) {
            while (user.getId() == id) {
                id++;
            }
        }

        return id;
    }

    public boolean checkPersonalCode(String personalCode) {
        for (UserEntity user : users) {
            if (Objects.equals(user.getPersonalCode(), personalCode)) {
                return false;
            }
        }
        return true;

    }

    public void message(String message) {
        System.out.println(message);
    }


    @Override
    public String toString() {
        return "UserRepository{" +
                "users=" + users +
                '}';
    }
}
