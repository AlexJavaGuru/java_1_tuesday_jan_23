package student_julija_raudive.lesson_7.level_7;


import java.util.ArrayList;
import java.util.Objects;

class UserRepositoryTest {

    ArrayList<UserEntity> users = new ArrayList<>();
    UserRepository userRepository = new UserRepository(users);


    public static void main(String[] args) {

        UserRepositoryTest test = new UserRepositoryTest();
        test.addUserTest();
        test.getUsersByNameTest();
        test.getUserByIdTest();
        test.getAllUsersTest();
        test.changeUserDataTest();
        test.deleteUserTest();
        test.tryToAddExistingPersonalCodeTest();


    }

    public void addUserTest() {

        String name = "Janis";
        String surname = "Berzins";
        String personalCode = "1111-3333";
        userRepository.addUser(name, surname, personalCode);
        boolean result = true;
        for (UserEntity user : userRepository.users) {
            if (!(Objects.equals(user.getName(), name) && Objects.equals(user.getSurname(), surname) && Objects.equals(user.getPersonalCode(), personalCode))) {
                result = false;
                break;
            }
        }
        checkResults(result, "New user added");

    }


    public void getUsersByNameTest() {
        users.add(new UserEntity(27, "Peteris", "Abolins", "4444-66666"));
        users.add(new UserEntity(46, "Juris", "Ozols", "45456-0796965"));
        UserEntity resultUser = users.get(2);
        UserEntity realResult = userRepository.getUsersByName("Juris", "Ozols");
        checkResults(resultUser.equals(realResult), "Get user by name test");
    }

    public void getUserByIdTest() {
        UserEntity resultUser = users.get(1);
        UserEntity realResult = userRepository.getUserById(27);
        checkResults(resultUser.equals(realResult), "Get user by ID test");
    }

    public void getAllUsersTest() {

        ArrayList<UserEntity> expectedUsers = new ArrayList<>() {
            {
                add(new UserEntity(1, "Janis", "Berzins", "1111-3333"));
                add(new UserEntity(27, "Peteris", "Abolins", "4444-66666"));
                add(new UserEntity(46, "Juris", "Ozols", "45456-0796965"));
            }
        };

        ArrayList<UserEntity> result = userRepository.getAllUsers();
        boolean isEqual = true;
        if (users.size() == expectedUsers.size()) {
            for (int i = 0; i < expectedUsers.size(); i++) {
                isEqual = (users.get(i).getId() == result.get(i).getId()) || (Objects.equals(users.get(i).getName(), result.get(i).getName())) || (Objects.equals(users.get(i).getSurname(), result.get(i).getSurname())) || (Objects.equals(users.get(i).getPersonalCode(), result.get(i).getPersonalCode()));
            }
        } else isEqual = false;
        checkResults(isEqual, "Get all users test");
    }


    public void changeUserDataTest() {
        UserEntity userToChange = userRepository.getUserById(27);
        String newName = "Maris";
        String newSurname = "Ezerins";
        String newPersonalCode = "5555-77777";
        userRepository.changeUserData(userToChange, newName, newSurname, newPersonalCode);
        boolean condition = userToChange.getName().equals(newName) && userToChange.getSurname().equals(newSurname) && userToChange.getPersonalCode().equals(newPersonalCode);
        checkResults(condition, "Change user data test");

    }

    public void deleteUserTest() {
        UserEntity userToDelete = userRepository.getUserById(46);
        userRepository.deleteUser(userToDelete);

        boolean isDeleted = true;
        for (UserEntity user : users) {
            if (user.equals(userToDelete)) {
                isDeleted = false;
                break;
            }
        }
        checkResults(isDeleted, "Delete user test");
    }

    public void tryToAddExistingPersonalCodeTest() {
        userRepository.addUser("Liene", "Ozola", "68686-939329");
        userRepository.addUser("Baiba", "Berzina", "68686-939329");

        boolean isNotAdded = true;
        for (UserEntity user : users) {
            if (user.getName().equals("Baiba") && user.getSurname().equals("Berzina") && user.getPersonalCode().equals("68686-939329")) {
                isNotAdded = false;
                break;
            }
        }
        checkResults(isNotAdded, "Try to add existing personal code test");

    }

    void checkResults(boolean condition, String testName) {

        System.out.print(testName + ": ");
        if (condition) {

            System.out.println("OK");

        } else {
            System.out.println("FAIL");
        }
    }


}
