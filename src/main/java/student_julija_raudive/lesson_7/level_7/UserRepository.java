package student_julija_raudive.lesson_7.level_7;


import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;


class UserRepository {

    List<UserEntity> users;
    private static final AtomicInteger count = new AtomicInteger(0);

    public UserRepository(List<UserEntity> users) {
        this.users = users;
    }

    public void addUser(UserEntity user) {
        if (checkPersonalCode(user.getPersonalCode())) {
            users.add(user);
            user.setId(count.incrementAndGet());
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

    public List getAllUsers() {
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
