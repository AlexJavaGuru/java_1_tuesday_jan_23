package student_julija_raudive.lesson_7.level_7;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class UserRepositoryTest {

    ArrayList<UserEntity> userList = new ArrayList<>();
    UserRepository userRepository = new UserRepository(userList);


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
        userRepository.addUser(new UserEntity(name, surname, personalCode));
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
        userRepository.addUser(new UserEntity("Peteris", "Abolins", "4444-66666"));
        userRepository.addUser(new UserEntity("Juris", "Ozols", "45456-0796965"));
        UserEntity resultUser = userList.get(2);
        UserEntity realResult = userRepository.getUsersByName("Juris", "Ozols");
        checkResults(resultUser.equals(realResult), "Get user by name test");
    }

    public void getUserByIdTest() {
        UserEntity resultUser = userList.get(1);
        UserEntity realResult = userRepository.getUserById(2);
        checkResults(resultUser.equals(realResult), "Get user by ID test");
    }

    public void getAllUsersTest() {

       List<UserEntity> expectedUsers = new ArrayList<>();
        UserRepository userRepository2 = new UserRepository(expectedUsers);

        userRepository2.addUser(new UserEntity("Janis", "Berzins", "1111-3333"));
        userRepository2.addUser(new UserEntity( "Peteris", "Abolins", "4444-66666"));
        userRepository2.addUser(new UserEntity( "Juris", "Ozols", "45456-0796965"));


        List<UserEntity> result = userRepository2.getAllUsers();
        boolean isEqual = true;
        if (userList.size() == expectedUsers.size()) {
            for (int i = 0; i < expectedUsers.size(); i++) {
                isEqual = (userList.get(i).getId() == result.get(i).getId()) || (Objects.equals(userList.get(i).getName(), result.get(i).getName())) || (Objects.equals(userList.get(i).getSurname(), result.get(i).getSurname())) || (Objects.equals(userList.get(i).getPersonalCode(), result.get(i).getPersonalCode()));
            }
        } else isEqual = false;
        checkResults(isEqual, "Get all users test");
    }


    public void changeUserDataTest() {

        String newName = "Maris";
        String newSurname = "Ezerins";
        String newPersonalCode = "5555-77777";
        UserEntity userToChange = userRepository.getUserById(2);
        userRepository.changeUserData(userToChange, newName, newSurname, newPersonalCode);
        boolean condition = userToChange.getName().equals(newName) && userToChange.getSurname().equals(newSurname) && userToChange.getPersonalCode().equals(newPersonalCode);
        checkResults(condition, "Change user data test");

    }

    public void deleteUserTest() {
        UserEntity userToDelete = userRepository.getUserById(46);
        userRepository.deleteUser(userToDelete);

        boolean isDeleted = true;
        for (UserEntity user : userList) {
            if (user.equals(userToDelete)) {
                isDeleted = false;
                break;
            }
        }
        checkResults(isDeleted, "Delete user test");
    }

    public void tryToAddExistingPersonalCodeTest() {
        userRepository.addUser(new UserEntity("Liene", "Ozola", "68686-939329"));
        userRepository.addUser(new UserEntity("Baiba", "Berzina", "68686-939329"));

        boolean isNotAdded = true;
        for (UserEntity user : userList) {
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
